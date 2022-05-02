package main.classes.d0428;

import static main.Main.eingabe;

public class Aufgaben {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 28.04 ###");
            System.out.println("1. Personenbuilder");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        personenBuilder();
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

    public static void personenBuilder() {
        Person p = new PersonBuilder()
                .vorname("John")
                .nachname("Doe")
                .geburtsjahr(1987)
                .postleitzahl(65936)
                .build();

        System.out.println(p.toString());
    }


}
