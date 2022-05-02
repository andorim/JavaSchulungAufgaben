package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static InputStreamReader reader = new InputStreamReader(System.in);
    private static BufferedReader bfr = new BufferedReader(reader);

    public static void main(String[] args) {
        boolean weiter = true;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(reader);

        while (weiter) {
            System.out.println();
            System.out.println("### Main Menu ###");
            System.out.println("1. Basics");
            System.out.println("2. Classes");
            System.out.println("3. Arrays");
            System.out.println("99. Beenden");
            System.out.println("#################");
            try {
                int eingabe = Integer.parseInt(bfr.readLine());
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

    public static String eingabe() throws IOException {
        return bfr.readLine();
    }

    public static String eingabe(String text) throws IOException {
        System.out.println(text);
        return bfr.readLine();
    }
}
