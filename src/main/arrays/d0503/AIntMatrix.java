package main.arrays.d0503;

import main.OddbException;

import java.io.IOException;

import static main.Main.eingabe;

public class AIntMatrix {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;

        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben IntMatrix ###");
            System.out.println("1. Erstelle Matrix (2,3)");
            System.out.println("2. Erstelle Matrix (5,3,100)");
            System.out.println("3. get(1,2)");
            System.out.println("4. Random Matrix (4,6,200)");
            System.out.println("5. Equals Test");
            System.out.println("6. Addiere 2 (2,3,100) Matrizen");
            System.out.println("7. Multipliziere 2 (2,3,100) Matrizen");
            System.out.println("8. Transponieren");
            System.out.println("99. Zurück");
            System.out.println("############################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        a1();
                        break;
                    case 2:
                        a2();
                        break;
                    case 3:
                        a3();
                        break;
                    case 4:
                        a4();
                        break;
                    case 5:
                        a5();
                        break;
                    case 6:
                        addStatic();
                        break;
                    case 7:
                        multiplyStatic();
                        break;
                    case 8:
                        transpose();
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
        IntMatrix m = new IntMatrix(2, 3);
        System.out.println(m);
    }

    private static void a2() {
        IntMatrix m = new IntMatrix(5, 3, 100);
        System.out.println(m);
    }

    private static void a3() {
        IntMatrix m = new IntMatrix(2, 3);
        System.out.println(m.get(1, 2));
    }

    private static void a4() {
        IntMatrix m = IntMatrix.getRandomMatrix(4, 6, 200);
        System.out.println(m);
    }

    private static void a5() {
        IntMatrix m1 = new IntMatrix(2, 3, 5);
        IntMatrix m2 = new IntMatrix(2, 3, 5);
        System.out.println(m1.equals(m2));
    }

    private static void addStatic() {
        IntMatrix m1 = new IntMatrix(2, 3, 100);
        IntMatrix m2 = new IntMatrix(2, 3, 100);
        try {
            IntMatrix m3 = IntMatrix.add2Matrices(m1, m2);
            System.out.println(m3);
        } catch (OddbException ex) {

        }

    }

    private static void multiplyStatic() {
        IntMatrix m1 = new IntMatrix(2, 3, 100);
        IntMatrix m2 = new IntMatrix(2, 3, 100);
        try {
            IntMatrix m3 = IntMatrix.multiply2Matrices(m1, m2);
            System.out.println(m3);
        } catch (OddbException ex) {

        }

    }

    private static void transpose() {
        IntMatrix m = IntMatrix.getRandomMatrix(4, 4, 10);
        System.out.println(m);
        System.out.println("Transpose");
        m.transpose();
        System.out.println(m);
    }


}
