package d0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Aufgaben {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(reader);

        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 25.04 ###");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(bfr.readLine());
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
