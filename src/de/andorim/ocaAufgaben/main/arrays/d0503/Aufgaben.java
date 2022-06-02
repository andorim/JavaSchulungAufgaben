package de.andorim.ocaAufgaben.main.arrays.d0503;

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
            System.out.println("### Aufgaben 03.05 ###");
            System.out.println("1. Kleine Aufgabe 2D-Arrays");
            System.out.println("2. Arrays - 2D");
            System.out.println("3. Arrays -  IntMatrix");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        KleineAufgabe2DArrays();
                        break;
                    case 2:
                        de.andorim.ocaAufgaben.main.arrays.d0503.A2DArrays.menu();
                        break;
                    case 3:
                        de.andorim.ocaAufgaben.main.arrays.d0503.AIntMatrix.menu();
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

    private static void KleineAufgabe2DArrays() {
        /*int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[2][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = j;
                arr2[i][j] = j;
            }
        }*/

        int[][] arr1 = {
                {0, 1, 2},
                {0, 1, 2}
        };

        int[][] arr2 = {
                {0, 1, 2},
                {0, 1, 2, 3}
        };
        System.out.println(equals(arr1, arr2));
    }

    private static boolean equals(int[][] arr1, int[][] arr2) {
        if (arr1 == null || arr2 == null || (arr1.length != arr2.length)) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == null || arr2[i] == null || (arr1[i].length != arr2[i].length)) {
                return false;
            }
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }


}
