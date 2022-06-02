package de.andorim.ocaAufgaben.main.inheritance.d0530;

import java.io.IOException;
import java.util.function.Predicate;

import static de.andorim.ocaAufgaben.main.Main.eingabe;

public class Aufgaben {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 30.05 ###");
            System.out.println("1. Aufgaben/Lambdas und Predicate");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        lambdasPredicate();
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

    private static void lambdasPredicate() {
        Integer[] ints = {-256, -128, -64, -32, -8, -2, 3, 4, 12, 19, 64, 128};

        System.out.println("######## Nur Positive  Werte ############");
        printIf(ints, i -> i >= 0);
        System.out.println("#########################################");

        System.out.println("########### gerade Werte ################");
        printIf(ints, i -> (i % 2) == 0);
        System.out.println("#########################################");

        System.out.println("######## Nur Positive gerade Werte ######");
        printIf(ints, i -> i >= 0 && (i % 2) == 0);
        System.out.println("#########################################");


    }

    private static void printIf(Integer[] ints, Predicate<Integer> predicate) {
        for (int i : ints) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }


}
