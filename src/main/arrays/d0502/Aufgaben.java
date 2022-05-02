package main.arrays.d0502;

import java.io.IOException;
import java.sql.SQLOutput;

import static main.Main.eingabe;

public class Aufgaben {
    static Hafen hafen;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        hafen = new Hafen();
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 02.05 ###");
            System.out.println("1. 12 Schiffe andocken und Ausgabe Hafen");
            System.out.println("2. Neues Schiff andocken");
            System.out.println("3. Schiff abdocken");
            System.out.println("4. Zeige angedockte Schiffe");
            System.out.println("5. Zeige Hafenauslastung");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        aufgabe();
                        break;
                    case 2:
                        dockNewSchiff();
                        break;
                    case 3:
                        schiffUndock();
                        break;
                    case 4:
                        hafen.printDockedSchiffe();
                        break;
                    case 5:
                        System.out.println(hafen);
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


    public static void aufgabe() {
        for (int i = 0; i < 12; i++) {
            hafen.addSchiff(new Schiff("Schiff" + i));
        }
        System.out.println(hafen);
    }

    public static void dockNewSchiff() {
        try {
            String schiffName = eingabe("Gib den Namen des Schiffs ein:");
            hafen.addSchiff(new Schiff(schiffName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }

    public static void schiffUndock() {
        System.out.println("Angedockte Schiffe: \n");
        for (int i = 0; i < hafen.getNumberOfDockedSchiffe(); i++) {
            System.out.println(i + ". " + hafen.getSchiffByIndex(i));
        }
        try {
            int eingabe = Integer.parseInt(eingabe("Nummer des Angedockten Schiffes: "));
            hafen.removeSchiff(hafen.getSchiffByIndex(eingabe));
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Das angegebene Schiff konnte nicht abgedockt werden, da es nicht angedockt ist!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
