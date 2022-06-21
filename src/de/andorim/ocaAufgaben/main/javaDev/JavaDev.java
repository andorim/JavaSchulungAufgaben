package de.andorim.ocaAufgaben.main.javaDev;

import java.io.IOException;

import static de.andorim.ocaAufgaben.main.Main.eingabe;

public class JavaDev {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben JavaDev ###");
            System.out.println("1. Aufgaben vom 20.06");
            System.out.println("99. Zurück");
            System.out.println("##########################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        de.andorim.ocaAufgaben.main.javaDev.d0620.Aufgaben.menu();
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
