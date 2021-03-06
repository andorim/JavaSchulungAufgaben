package de.andorim.ocaAufgaben.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

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
            System.out.println("6. Packages / Imports / Visibilities");
            System.out.println("7. JavaDev");
            System.out.println("50. Spielereien");
            System.out.println("99. Beenden");
            System.out.println("#################");

            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        de.andorim.ocaAufgaben.main.basics.Basics.menu();
                        break;
                    case 2:
                        de.andorim.ocaAufgaben.main.classes.Classes.menu();
                        break;
                    case 3:
                        de.andorim.ocaAufgaben.main.arrays.Arrays.menu();
                        break;
                    case 4:
                        de.andorim.ocaAufgaben.main.inheritance.Inheritence.menu();
                        break;
                    case 5:
                        de.andorim.ocaAufgaben.main.javaAPI.JavaAPI.menu();
                        break;
                    case 6:
                        de.andorim.ocaAufgaben.main.packagesImportsVisibilities.PackagesImportsVisibilities.menu();
                        break;
                    case 7:
                        de.andorim.ocaAufgaben.main.javaDev.JavaDev.menu();
                        break;
                    case 50:
                        de.andorim.ocaAufgaben.main.spielereien.Spielereien.menu();
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
