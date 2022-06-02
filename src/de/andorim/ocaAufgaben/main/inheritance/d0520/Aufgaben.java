package de.andorim.ocaAufgaben.main.inheritance.d0520;

import java.io.IOException;

import static de.andorim.ocaAufgaben.main.Main.eingabe;

public class Aufgaben {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 20.05 ###");
            System.out.println("1. A1");
            System.out.println("2. A3");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        a1();
                        break;
                    case 2:
                        a3();
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

    private static void a1() {
        Test t = new Test();
        int result = t.add(3, 5);
        System.out.println("3 + 5 = " + result);
    }

    private static void a3() {
        // TODO: 20.05.22 Nicht sicher ob ich die Aufgabe verstanden habe, Vergleich mit der Lösung
        //                  vom Dozenten am Montag 23.05

        Test2 t = new Test2();
        System.out.println("t.add(5)" + t.add(5));
        System.out.println("t.add(2,3)" + t.add(2, 3));
        System.out.println("t.addToContainer(2,3)" + t.addToContainer(2, 3));
        System.out.println("t.add(2)" + t.add(2));


    }
}
