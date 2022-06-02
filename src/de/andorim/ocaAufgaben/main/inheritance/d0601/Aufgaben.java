package de.andorim.ocaAufgaben.main.inheritance.d0601;

import java.io.IOException;
import java.util.Arrays;

import static de.andorim.ocaAufgaben.main.Main.eingabe;

public class Aufgaben {
    private static Blume[] blumen;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 01.06 ###");
            System.out.println("1. Kleine Aufgabe");
            System.out.println("2. Kleine Aufgabe Teil 2");
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
                        kleineAufgabe2();
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

    private static void fillBlumen() {
        blumen = new Blume[5];
        blumen[0] = new Blume("Lilie", 3);
        blumen[1] = new Blume("Rose", 4);
        blumen[2] = new Blume("Tulpe", 1);
        blumen[3] = new Blume("Pfingstrose", 3);
        blumen[4] = new Blume("Löwenmäulchen", 2);
    }

    private static void kleineAufgabe() {
        fillBlumen();

        System.out.println("######### Vor dem Sortieren #######");

        // 1. Ausgabe. Vor dem Sortieren
        printBlumen();

        System.out.println("\n######### Nach dem Sortieren #######");
        // Bitte Blumen nach Preis aufsteigend sortieren
        Arrays.sort(blumen);

        // 2. Ausgabe. Nach dem Sortieren
        printBlumen();
    }

    private static void kleineAufgabe2() {
        fillBlumen();

        System.out.println("######### Vor dem Sortieren #######");

        // 1. Ausgabe. Vor dem Sortieren
        printBlumen();

        System.out.println("\n######### Nach dem Sortieren #######");
        // Bitte Blumen nach Preis aufsteigend sortieren

        Arrays.sort(blumen, (b1, b2) -> b2.compareTo(b1));

        // 2. Ausgabe. Nach dem Sortieren
        printBlumen();
    }

    private static void printBlumen() {
        for (int i = 0; i < blumen.length; i++) {
            System.out.println(i + " " + blumen[i].toString());
        }
    }


}
