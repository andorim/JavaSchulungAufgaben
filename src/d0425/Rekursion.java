package d0425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rekursion {
    private static InputStreamReader reader = new InputStreamReader(System.in);
    private static BufferedReader bfr = new BufferedReader(reader);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 25.04 Rekursion ###");
            System.out.println("1. getFakultätRekursiv (3)");
            System.out.println("2. getFakultät (3)");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        System.out.println(getFakutaetRekursiv(3));
                        break;
                    case 2:
                        System.out.println(getFakutaet(5));
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

    private static int getFakutaetRekursiv(int zahl) {
        if (zahl <= 1) {
            return 1;
        } else {
            return zahl * getFakutaetRekursiv(zahl - 1);
        }
    }

    /*
    3*(3-1)*(3-2)
     */

    private static int getFakutaet(int zahl) {
        int ergebnis = zahl;
        for (int i = 1; i < zahl; i++) {
            ergebnis *= zahl - i;
        }
        return ergebnis;
    }

}
