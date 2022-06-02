package de.andorim.ocaAufgaben.main.classes.d0427;

import de.andorim.ocaAufgaben.main.classes.d0427.objectClasses.*;

import java.util.Random;

import static de.andorim.ocaAufgaben.main.Main.*;


public class Aufgaben {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 27.04 ###");
            System.out.println("1. kleineAufgabeLand");
            System.out.println("2. kleineAufgabeFahrzeug");
            System.out.println("3. Aufgabe Klassen - Geometrie");
            System.out.println("4. Passwortgenerator");
            System.out.println("5. Zufallszahlenverteilung");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        kleineAufgabeLand();
                        break;
                    case 2:
                        kleineAufgabeFahrzeug();
                        break;
                    case 3:
                        aufgabeKlassenGeometrie();
                        break;
                    case 4:
                        passwort();
                        break;
                    case 5:
                        Zufallszahlen.start();
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

    public static void kleineAufgabeLand() {
        Land brasilien = new Land();
        brasilien.name = "Brasilien";
        brasilien.einwohnerZahl = 211000000;

        Land de = new Land();
        de.name = "Deutschland";
        de.einwohnerZahl = 81000000;

        brasilien.print();
        Land.print(de);
    }

    public static void kleineAufgabeFahrzeug() {
        Fahrzeug f1 = new Fahrzeug();
        System.out.println(f1.tempo); // 0

        f1.start();

        System.out.println(f1.tempo); // 50
    }

    public static void aufgabeKlassenGeometrie() {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            Rechteck rechteck = new Rechteck();
            rechteck.setDimensions(rand.nextInt(20) + 1, rand.nextInt(20) + 1);
            System.out.println((i + 1) + ". " + rechteck);
        }
        System.out.println("---------------");
        Kreis kreis = new Kreis();
        kreis.radius = 5;
        kreis.print();

    }

    public static void passwort() {
        try {
            int length = Integer.parseInt(eingabe("Gebe die Länge des zu generierenden Passworts an:"));
            Passwortgenerator pw = new Passwortgenerator(length);
            System.out.println("Dein neues Passwort lautet: " + pw.generatePasswort());
        } catch (Exception ex) {
            System.out.println("Fehler bei der Eingabe!");
        }

    }


}
