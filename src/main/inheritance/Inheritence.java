package main.inheritance;

import java.io.IOException;

import static main.Main.eingabe;

public class Inheritence {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben Vererbung ###");
            System.out.println("1. Aufgaben 06.05");
            System.out.println("2. Aufgaben 11.05");
            System.out.println("3. Aufgaben 19.05");
            System.out.println("4. Aufgaben 20.05");
            System.out.println("5. Aufgaben 27.05");
            System.out.println("99. Zurück");
            System.out.println("##########################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        main.inheritance.d0506.Aufgaben.menu();
                        break;
                    case 2:
                        main.inheritance.d0511.Aufgaben.menu();
                        break;
                    case 3:
                        main.inheritance.d0519.Aufgaben.menu();
                        break;
                    case 4:
                        main.inheritance.d0520.Aufgaben.menu();
                        break;
                    case 5:
                        main.inheritance.d0527.Aufgaben.menu();
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
