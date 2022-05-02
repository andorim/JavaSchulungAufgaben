package main.basics.d0422;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Aufgaben {
    private static InputStreamReader reader = new InputStreamReader(System.in);
    private static BufferedReader bfr = new BufferedReader(reader);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;

        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 22.04 ###");
            System.out.println("1. printFromTo");
            System.out.println("2. sum");
            System.out.println("3. sumFromTo");
            System.out.println("4. zeichneRechteck");
            System.out.println("5. printRandom");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        printFromTo();
                        break;
                    case 2:
                        System.out.println(sum());
                        break;
                    case 3:
                        System.out.println(sumFromTo());
                        break;
                    case 4:
                        zeichneRechteck();
                        break;
                    case 5:
                        printRandom();
                        break;
                    case 99:
                        weiter = false;
                        break;
                    default:
                        System.out.println("Fehler bei der Eingabe!");
                }
            } catch (Exception ex) {
                System.out.println("Fehler bei der Eingabe!");
            }
        }
    }

    private static String eingabe() throws IOException {
        return bfr.readLine();
    }

    private static String eingabe(String text) throws IOException {
        System.out.println(text);
        return bfr.readLine();
    }

    private static void printFromTo() {
        try {
            int from = Integer.parseInt(eingabe("Startwert:"));
            int to = Integer.parseInt(eingabe("Endwert:"));
            printFromTo(from, to);

        } catch (Exception ex) {
            System.out.println("Fehler bei der Eingabe!");
        }
    }

    private static void printFromTo(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    private static int sum() {
        try {
            int zahl1 = Integer.parseInt(eingabe("Zahl1"));
            int zahl2 = Integer.parseInt(eingabe("Zahl2"));
            return sum(zahl1, zahl2);

        } catch (Exception ex) {
            System.out.println("Fehler bei der Eingabe!");
            return 0;
        }
    }

    private static int sum(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    private static int sumFromTo() {
        try {
            int from = Integer.parseInt(eingabe("Startwert:"));
            int to = Integer.parseInt(eingabe("Endwert:"));
            return sumFromTo(from, to);

        } catch (Exception ex) {
            System.out.println("Fehler bei der Eingabe!");
            return 0;
        }
    }

    private static int sumFromTo(int from, int to) {
        int sum = 0;
        while (from <= to) {
            sum += from;
            from++;
        }
        return sum;
    }

    private static void zeichneRechteck(int breite, int hoehe) {
        zeichneRechteck(breite, hoehe, true);
    }

    private static void zeichneRechteck() {
        try {
            int breite = Integer.parseInt(eingabe("Breite:"));
            int hoehe = Integer.parseInt(eingabe("Höhe:"));
            String fuellen = eingabe("Füllen (ja/nein):");
            if (fuellen.equalsIgnoreCase("ja") || fuellen.equalsIgnoreCase("j")) {
                zeichneRechteck(breite, hoehe, true);
            } else if (fuellen.equalsIgnoreCase("nein") || fuellen.equalsIgnoreCase("n")) {
                zeichneRechteck(breite, hoehe, false);
            } else {
                throw new RuntimeException();
            }

        } catch (Exception ex) {
            System.out.println("Fehler bei der Eingabe!");
        }
    }

    private static void zeichneRechteck(int breite, int hoehe, boolean fuellen) {
        for (int row = 0; row < hoehe; row++) {
            for (int col = 0; col < breite; col++) {
                if (fuellen || row == 0 || col == 0 || col == breite - 1 || row == hoehe - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    private static void printRandom() {
        try {
            int nr = Integer.parseInt(eingabe("Anzahl Zahlen:"));
            int min = Integer.parseInt(eingabe("Min:"));
            int max = Integer.parseInt(eingabe("Max:"));
            if (nr > 0 && min < max) {
                printRandom(nr, min, max);
            } else {
                System.out.println("Anzahl muss größer 0 sein!");
                System.out.println("Min muss < Max sein!");
            }


        } catch (Exception ex) {
            System.out.println("Fehler bei der Eingabe!");
        }
    }

    /**
     * Prints Random Values between [min...max]
     *
     * @param nr  number of Values
     * @param min min Value
     * @param max max Value
     */
    private static void printRandom(int nr, int min, int max) {
        int random;
        for (int i = 0; i < nr; i++) {
            //random = (int) (Math.random() * (max - min + 1)) + min;

            Random rand = new Random();
            random = rand.nextInt(max + 1 - min) + min;
            System.out.print(random + " ");
        }
        System.out.println();
    }

}
