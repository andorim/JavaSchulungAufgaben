package main.inheritance.d0506;

import java.io.IOException;

import static main.Main.eingabe;

public class Aufgaben {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;
        
        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 06.05 ###");
            System.out.println("1. Aufgaben");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        aufgabe();
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

    private static void aufgabe() {
        Rectangle rec = new Rectangle(3, 4);
        System.out.println(rec.getCoordinatesString());

        rec.setCoordX(12);
        rec.setCoordY(-7);
        System.out.println(rec.getCoordinatesString());

        Circle circ = new Circle(4);
        System.out.println(circ.getCoordinatesString());

        circ.bewegen(33, 1);

        System.out.println(circ.getCoordinatesString());

        System.out.println(circ);
    }
}
