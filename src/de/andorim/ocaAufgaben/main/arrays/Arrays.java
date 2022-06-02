package de.andorim.ocaAufgaben.main.arrays;

import java.io.IOException;

import static de.andorim.ocaAufgaben.main.Main.eingabe;

public class Arrays {


    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Arrays Menu ###");
            System.out.println("1. Aufgaben 29.04");
            System.out.println("2. Aufgaben 02.05");
            System.out.println("3. Aufgaben 03.05");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        de.andorim.ocaAufgaben.main.arrays.d0429.Aufgaben.menu();
                        break;
                    case 2:
                        de.andorim.ocaAufgaben.main.arrays.d0502.Aufgaben.menu();
                        break;
                    case 3:
                        de.andorim.ocaAufgaben.main.arrays.d0503.Aufgaben.menu();
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

}
