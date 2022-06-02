package de.andorim.ocaAufgaben.main.javaAPI;

import java.io.IOException;

import static de.andorim.ocaAufgaben.main.Main.eingabe;

public class JavaAPI {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben JavaAPI ###");
            System.out.println("1. Aufgaben vom 13.05");
            System.out.println("2. Aufgaben vom 16.05");
            System.out.println("3. Aufgaben vom 17.05");
            System.out.println("4. Aufgaben vom 24.05");
            System.out.println("99. Zurück");
            System.out.println("##########################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        de.andorim.ocaAufgaben.main.javaAPI.d0513.Aufgaben.menu();
                        break;
                    case 2:
                        de.andorim.ocaAufgaben.main.javaAPI.d0516.Aufgaben.menu();
                        break;
                    case 3:
                        de.andorim.ocaAufgaben.main.javaAPI.d0517.Aufgaben.menu();
                        break;
                    case 4:
                        de.andorim.ocaAufgaben.main.javaAPI.d0524.Aufgaben.menu();
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
