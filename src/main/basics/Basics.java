package main.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Basics {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(reader);

        while (weiter) {
            System.out.println();
            System.out.println("### Basics Menu ###");
            System.out.println("1. Aufgaben 21.04");
            System.out.println("2. Aufgaben 22.04");
            System.out.println("3. Aufgaben 25.04");
            System.out.println("99. Beenden");
            System.out.println("#################");
            try {
                int eingabe = Integer.parseInt(bfr.readLine());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        main.basics.d0421.Aufgaben.menu();
                        break;
                    case 2:
                        main.basics.d0422.Aufgaben.menu();
                        break;
                    case 3:
                        main.basics.d0425.Aufgaben.menu();
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
}
