package de.andorim.ocaAufgaben.main.basics.d0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TimeZone;

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
            System.out.println("### Aufgaben 21.04 ###");
            System.out.println("1. Time Zones");
            System.out.println("2. Zahlenreihe");
            System.out.println("3. A7: Spielfeld");
            System.out.println("4. A8: Kalender");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(bfr.readLine());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        timeZones();
                        break;
                    case 2:
                        optionalZahlenreihe();
                        break;
                    case 3:
                        a7Field();
                        break;
                    case 4:
                        a8Month();
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

    private static void timeZones() {
        String[] zoneIds = TimeZone.getAvailableIDs();

        for (String id : zoneIds) {
            System.out.println(id);
        }
    }

    private static void optionalZahlenreihe() {
        //3 1 2 3 2 1 2 1 1
        for (int i = 3; i > 0; i--) {
            System.out.print(i + " ");
            for (int x = 1; x <= i; x++) {
                System.out.print(x + " ");
            }
        }
    }

    private static void a7Field() {
        char a = 'A';
        a--;
        for (char c = a; c <= 'E'; c++) {
            if (c == a) {
                System.out.print(" ");
            } else {
                System.out.print(c);
            }
            for (int i = 1; i <= 5; i++) {
                if (c == a) {
                    System.out.print(i);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    private static void a8Month() {
        for (int monat = 1; monat <= 12; monat++) {
            System.out.print("Monat " + monat + ": ");
            switch (monat) {
                case 4:
                case 6:
                case 9:
                case 11:
                    for (int i = 1; i <= 30; i++) {
                        System.out.print(i + " ");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 29; i++) {
                        if (i == 29) {
                            System.out.print("(" + i + ") ");
                        } else {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                default:
                    for (int i = 1; i <= 31; i++) {
                        System.out.print(i + " ");
                    }
            }
            System.out.println();
        }
    }
}
