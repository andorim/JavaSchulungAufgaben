package templates;

import static main.Main.*;

public class Aufgaben {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben dd.mm ###");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
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
