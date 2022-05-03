package main.arrays.d0503;

import java.io.IOException;

import static main.Main.eingabe;

public class A2DArrays {


    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;

        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben Arrays - 2D ###");
            System.out.println("1. Aufgaben 1- 4");
            System.out.println("2. Aufgabe 5");
            System.out.println("3. Aufgabe 6");
            System.out.println("4. Aufgabe 7");
            System.out.println("99. Zurück");
            System.out.println("############################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        a1toA4();
                        break;
                    case 2:
                        a5();
                        break;
                    case 3:
                        a6();
                        break;
                    case 4:
                        a7();
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

    private static void a1toA4() {
        //A1
        int[][] arr = createArray(4, 5);
        //A2
        printArray(arr);
        System.out.println("############");
        //A3
        arr[1][1] = 5;
        printArray(arr);

        //A4
        setAllValues(arr, 2);

        System.out.println("############");
        //A5


    }

    private static void a5() {
        int[][] arr2 = createArray(4, 5, 2);

        printArray(arr2);
    }

    private static void a6() {
        int[][] arr = createArray(4, 5);

        printArray(arr, ", ");
    }

    private static void a7() {
        char[][] arr = createBorderedArray(5, 'X');
        for (char[] r : arr) {
            for (char v : r) {
                System.out.print(v);
            }
            System.out.println();
        }
    }

    private static int[][] createArray(int rows, int cols) {
        return new int[rows][cols];
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void printArray(int[][] arr, String separator) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) {
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(arr[i][j] + separator);
                }

            }
            System.out.println();
        }
    }

    private static void setAllValues(int[][] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value;
            }
        }
    }

    private static int[][] createArray(int rows, int cols, int defaultValue) {
        int[][] arr = createArray(rows, cols);
        setAllValues(arr, defaultValue);
        return arr;
    }

    private static char[][] createBorderedArray(int dim, char borderChar) {
        char[][] arr = new char[dim][dim];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = borderChar;
                } else {
                    arr[i][j] = ' ';
                }
            }
        }
        return arr;
    }
}
