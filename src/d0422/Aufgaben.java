package d0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Aufgaben {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(reader);

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
                int eingabe = Integer.parseInt(bfr.readLine());
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

    public static void printFromTo() {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(reader);

        try {
            System.out.println("Startwert:");
            int from = Integer.parseInt(bfr.readLine());
            System.out.println("Endwert:");
            int to = Integer.parseInt(bfr.readLine());
            printFromTo(from, to);

        } catch (Exception ex) {
            System.out.println("Fehler bei der Eingabe!");
        }
    }

    public static void printFromTo(int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int sum() {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(reader);

        try {
            System.out.println("Zahl 1:");
            int zahl1 = Integer.parseInt(bfr.readLine());
            System.out.println("Zahl 2:");
            int zahl2 = Integer.parseInt(bfr.readLine());
            return sum(zahl1, zahl2);

        } catch (Exception ex) {
            System.out.println("Fehler bei der Eingabe!");
            return 0;
        }
    }

    public static int sum(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    public static int sumFromTo() {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(reader);

        try {
            System.out.println("Startwert:");
            int from = Integer.parseInt(bfr.readLine());
            System.out.println("Endwert:");
            int to = Integer.parseInt(bfr.readLine());
            return sumFromTo(from, to);

        } catch (Exception ex) {
            System.out.println("Fehler bei der Eingabe!");
            return 0;
        }
    }

    public static int sumFromTo(int from, int to) {
        int sum = 0;
        while (from <= to) {
            sum += from;
            from++;
        }
        return sum;
    }

    public static void zeichneRechteck(int breite, int hoehe) {
        for (int row = 0; row < hoehe; row++) {
            for (int col = 0; col < breite; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void zeichneRechteck() {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(reader);

        try {
            System.out.println("Breite:");
            int breite = Integer.parseInt(bfr.readLine());
            System.out.println("Höhe:");
            int hoehe = Integer.parseInt(bfr.readLine());
            System.out.println("Füllen (ja/nein):");
            String fuellen = bfr.readLine();
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

    public static void zeichneRechteck(int breite, int hoehe, boolean fuellen) {
        if (fuellen) {
            zeichneRechteck(breite, hoehe);
        } else {
            for (int row = 0; row < hoehe; row++) {
                for (int col = 0; col < breite; col++) {
                    if (row == 0 || col == 0 || col == breite - 1 || row == hoehe - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
    }

    public static void printRandom() {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(reader);

        try {
            System.out.println("Anzahl Zahlen:");
            int nr = Integer.parseInt(bfr.readLine());
            System.out.println("Min:");
            int min = Integer.parseInt(bfr.readLine());
            System.out.println("Max:");
            int max = Integer.parseInt(bfr.readLine());
            printRandom(nr, min, max);


        } catch (Exception ex) {
            System.out.println("Fehler bei der Eingabe!");
        }
    }

    public static void printRandom(int nr, int min, int max) {
        for (int i = 0; i < nr; i++) {
            int random = (int) (Math.random() * (max - min)) + min;
            System.out.print(random + " ");
        }
        System.out.println();
    }

}
