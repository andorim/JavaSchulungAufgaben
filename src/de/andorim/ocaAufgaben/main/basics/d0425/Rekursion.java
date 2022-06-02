package de.andorim.ocaAufgaben.main.basics.d0425;

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
            System.out.println("2. getFakultät");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        System.out.println(getFakultaetRekursiv());
                        break;
                    case 2:
                        System.out.println(getFakultaet());
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

    private static int getFakultaetRekursiv() {
        try {
            int zahl = Integer.parseInt(eingabe("Fakultät von:"));
            return getFakultaetRekursiv(zahl);
        } catch (Exception ex) {
            System.out.println("Fehler bei der Eingabe!");
            return 0;
        }
    }

    private static int getFakultaetRekursiv(int zahl) {
        if (zahl <= 1) {
            return 1;
        } else {
            return zahl * getFakultaetRekursiv(zahl - 1);
        }
    }


    private static int getFakultaet() {
        try {
            int zahl = Integer.parseInt(eingabe("Fakultät von:"));
            return getFakultaet(zahl);
        } catch (Exception ex) {
            System.out.println("Fehler bei der Eingabe!");
            return 0;
        }

    }
    /*
    3*(3-1)*(3-2)
     */

    private static int getFakultaet(int zahl) {
        int ergebnis = zahl;
        for (int i = 1; i < zahl; i++) {
            ergebnis *= zahl - i;
        }
        return ergebnis;
    }

}
