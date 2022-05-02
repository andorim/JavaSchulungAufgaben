package main.arrays.d0429;

import java.io.IOException;
import java.util.Random;

import static main.Main.eingabe;

import main.OddbException;

public class Aufgaben {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 29.04 ###");
            System.out.println("1. A1 und A2");
            System.out.println("2. A3 und A4");
            System.out.println("3. A5");
            System.out.println("4. A6");
            System.out.println("5. A7");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        A1toA2();
                        break;
                    case 2:
                        A3toA4();
                        break;
                    case 3:
                        A5();
                        break;
                    case 4:
                        A6();
                        break;
                    case 5:
                        A7();
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

    private static void A1toA2() {
        int[] arr = createArray(2, 15, 30);
        printArray(arr);
    }

    private static int[] createArray(int minValue, int maxValue, int length) {
        int[] array = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = rand.nextInt((maxValue - minValue)) + minValue;
        }
        return array;
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void A3toA4() {
        System.out.println(deutscheBuchstaben());
    }

    private static char[] deutschUmlaute() {
        return new char[]{'ä', 'Ä', 'ö', 'Ö', 'ü', 'Ü'};
    }

    private static char[] deutscheBuchstaben() {
        // 65 - 90 & 97 - 122 & deutscheUmlaute() & ß
        int length;
        char[] buchstaben;
        char[] umlaute = deutschUmlaute();
        length = umlaute.length + (122 - 65 - 5) + 1;
        buchstaben = new char[length];
        int arrIndex = 0;
        for (int i = 65; i <= 122; i++) {
            if (i < 91 || i > 96) {
                buchstaben[arrIndex] = (char) i;
                arrIndex++;
            }

        }
        for (char c : umlaute) {
            buchstaben[arrIndex] = c;
            arrIndex++;
        }
        buchstaben[arrIndex] = 'ß';

        return buchstaben;
    }

    private static void A5() {
        double[] arr = new double[2];
        arr[0] = Math.PI;
        arr[1] = Math.E;
        System.out.println("PI: " + arr[0]);
        System.out.println("E: " + arr[1]);
    }

    private static void A6() {
        try {
            int[] a1 = {1, 2, 3};
            int[] a2 = {12, 13, 14};
            int[] a3 = add(a1, a2); // a3 bekommt folgende Werte: 13, 15, 17

            for (int i = 0; i < a1.length; i++) {
                System.out.println(a1[i] + " + " + a2[i] + " = " + a3[i]);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static int[] add(int[] arr1, int[] arr2) throws OddbException {
        if (arr1 == null || arr2 == null) {
            throw new OddbException("Beide Arrays dürfen nicht Null sein!");
        } else if (arr2.length != arr1.length) {
            throw new OddbException("Das zweite Array muss genauso lang sein wie das erste!");
        }
        int[] results = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            results[i] = arr1[i] + arr2[i];
        }
        return results;

    }

    private static void A7() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {12, 13, 14};

        int[] a3 = join(a1, a2); // a3 bekommt folgende Werte: 1, 2, 3, 12, 13, 14

        for (int i : a3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] join(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] result = new int[length];
        int arrIndex = 0;
        for (int i : arr1) {
            result[arrIndex] = i;
            arrIndex++;
        }
        for (int i : arr2) {
            result[arrIndex] = i;
            arrIndex++;
        }
        return result;
    }


}
