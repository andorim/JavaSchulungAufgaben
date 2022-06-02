package de.andorim.ocaAufgaben.main.inheritance.d0519;

import de.andorim.ocaAufgaben.main.inheritance.d0519.geometrie.Kreis;
import de.andorim.ocaAufgaben.main.inheritance.d0519.geometrie.Rechteck;
import de.andorim.ocaAufgaben.main.inheritance.d0519.geometrie.Shape;
import de.andorim.ocaAufgaben.main.inheritance.d0519.getMax.Size;
import de.andorim.ocaAufgaben.main.inheritance.d0519.getMax.ValueSupplier;
import de.andorim.ocaAufgaben.main.inheritance.d0519.kleineAufgabe.Flower;
import de.andorim.ocaAufgaben.main.inheritance.d0519.kleineAufgabe.Notebook;
import de.andorim.ocaAufgaben.main.inheritance.d0519.kleineAufgabe.PriceSupplier;
import de.andorim.ocaAufgaben.main.inheritance.d0519.zahlraten.*;

import java.io.IOException;
import java.util.Random;

import static de.andorim.ocaAufgaben.main.Main.eingabe;

public class Aufgaben {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 19.05 ###");
            System.out.println("1. kleineAufgabe (Blume)");
            System.out.println("2. Geometrie");
            System.out.println("3. getMax");
            System.out.println("4. Zahlen Raten");
            System.out.println("5. Zahlen Raten 2");
            System.out.println("6. Zahlen Raten 3");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        kleineAufgabe();
                        break;
                    case 2:
                        geometrie();
                        break;
                    case 3:
                        getMaxAufgabe();
                        break;
                    case 4:
                        zahlenRaten();
                        break;
                    case 5:
                        zahlenRaten2();
                        break;
                    case 6:
                        zahlenRaten3();
                        break;
                    case 99:
                        weiter = false;
                        break;
                    default:
                        System.out.println("Fehler bei der Eingabe!");
                }
            } catch (IOException | NumberFormatException ex) {
                System.out.println("Fehler bei der Eingabe!");
            }
        }
    }

    private static void kleineAufgabe() {
        Flower b1 = new Flower("Nelke", 70);
        Flower b2 = new Flower("Rose", 130);

        System.out.println(b1);
        System.out.println(b2);

        long preis = getMaxPrice(b1, b2);
        System.out.println("max. Preis: " + preis);

        Notebook n1 = new Notebook("Acer", 450);
        Notebook n2 = new Notebook("Macbook", 2500);

        System.out.println(n1);
        System.out.println(n2);

        System.out.println("max. Preis: " + (getMaxPrice(n1, n2) / 100));
    }

    /**
     * Get max price in cent
     *
     * @param w1 first PriceSupplier to compare
     * @param w2 second PriceSupplier to compare
     * @return max price in cent
     */
    private static long getMaxPrice(PriceSupplier w1, PriceSupplier w2) throws IllegalArgumentException {
        if (w1 == null | w2 == null) {
            throw new IllegalArgumentException("Arguments may not be null");
        }
        return Math.max(w1.getPrice(), w2.getPrice());
    }

    private static void geometrie() {
        Random rand = new Random();
        Shape[] shapes = new Shape[100];
        for (int i = 0; i < shapes.length; i++) {
            if (rand.nextBoolean()) {
                shapes[i] = new Kreis(rand.nextInt(10) + 1);
            } else {
                shapes[i] = new Rechteck(rand.nextInt(10) + 1, rand.nextInt(10) + 1);
            }
        }
        calcAndPrintGesamtFleache(shapes);
    }

    private static void calcAndPrintGesamtFleache(Shape[] shapes) {
        double gesamtFlaeche = 0;
        for (Shape s : shapes) {
            System.out.println("Fläche von " + s.getClass().getSimpleName() + " " + s.getFlaeche());
            gesamtFlaeche += s.getFlaeche();
        }
        System.out.println("Die Gesamtfläche beträgt: " + gesamtFlaeche);
    }

    private static void getMaxAufgabe() {
        Size s1 = new Size(7);
        Size s2 = new Size(3);
        System.out.println(getMax(s1, s2));


        de.andorim.ocaAufgaben.main.inheritance.d0519.getMax.Kreis kreis1 = new de.andorim.ocaAufgaben.main.inheritance.d0519.getMax.Kreis(9);
        de.andorim.ocaAufgaben.main.inheritance.d0519.getMax.Kreis kreis2 = new de.andorim.ocaAufgaben.main.inheritance.d0519.getMax.Kreis(12);
        System.out.println(getMax(kreis1, kreis2));


    }

    private static ValueSupplier getMax(ValueSupplier v1, ValueSupplier v2) {
        // TODO: 20.05.22 Comparable Interface aus der Standardbibliothek anschauen (
        //          Lösung vom Dozent Project Ineritence Package aufgaben.interface.getmax.besser)

        return v1.getValue() > v2.getValue() ? v1 : v2;
    }

    private static void zahlenRaten() {
        Random rand = new Random();
        final int x = rand.nextInt(10) + 1;

        System.out.println(x);

        IntOperation op1 = new Multiply(2);
        int result1 = op1.execute(x);

        IntOperation op2 = new Multiply(5);
        int result2 = op2.execute(result1);

        IntOperation op3 = new Divide(x);
        int result3 = op3.execute(result2);

        IntOperation op4 = new Subtract(7);
        int result4 = op4.execute(result3);

        System.out.println(result4);
    }

    private static void zahlenRaten2() {
        IntOperation[] ops = {
                new Add(5), // addiert 5
                new ChangeSign(), // ändert das Vorzeichen
                new Multiply(2), // mit 2 multiplizieren
                new Subtract(3)  // 3 subtrahieren
        };

        int temp = 2;
        for (IntOperation op : ops) {
            temp = op.execute(temp);
        }
        System.out.println(temp);
    }

    private static void zahlenRaten3() {
        IntOperation op = new Add(5)
                .andThen(new ChangeSign())
                .andThen(new Multiply(2))
                .andThen(new Subtract(3));

        int result = op.execute(2); // result ist -17

        System.out.println(result);

    }
}


