package de.andorim.ocaAufgaben.main.inheritance.d0511;

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
            System.out.println("### Aufgaben 11.05 ###");
            System.out.println("1. TierTest");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        tierTest();
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

    private static void tierTest() {
        Katze k = new Katze("Hans", 14, true);
        printTier(k);

        Hund h = new Hund("Rex", 12, true);
        printTier(h);

        Tier t = new Katze("Tom", 2, true);

        printTier(t);
    }

    public static void printTier(Tier tier) {
        System.out.println(tier);
    }

    // TODO: 11.05.22 Aufgabe BruteForce (Polymorphie-Brutforce.md) 


}
