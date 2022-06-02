package de.andorim.ocaAufgaben.main.packagesImportsVisibilities;

import java.io.IOException;

import static de.andorim.ocaAufgaben.main.Main.eingabe;

public class PackagesImportsVisibilities {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben Packages #");
            System.out.println("###           Imports #");
            System.out.println("###      Visibilities #");
            System.out.println("1. Aufgaben vom 02.06");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        de.andorim.ocaAufgaben.main.packagesImportsVisibilities.d0602.Aufgaben.menu();
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


}
