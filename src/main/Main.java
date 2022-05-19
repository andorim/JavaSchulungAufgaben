package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        boolean weiter = true;

        while (weiter) {
            System.out.println();
            System.out.println("### Main Menu ###");
            System.out.println("1. Basics");
            System.out.println("2. Classes");
            System.out.println("3. Arrays");
            System.out.println("4. Vererbung");
            System.out.println("5. JavaAPI");
            System.out.println("50. Spielereien");
            System.out.println("99. Beenden");
            System.out.println("#################");

            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        main.basics.Basics.menu();
                        break;
                    case 2:
                        main.classes.Classes.menu();
                        break;
                    case 3:
                        main.arrays.Arrays.menu();
                        break;
                    case 4:
                        main.inheritance.Inheritence.menu();
                        break;
                    case 5:
                        main.javaAPI.JavaAPI.menu();
                        break;
                    case 50:
                        main.spielereien.Spielereien.menu();
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

    public static String eingabe() throws IOException {
        return bfr.readLine().trim();
    }

    public static String eingabe(String text) throws IOException {
        System.out.println(text);
        return bfr.readLine().trim();
    }
}
