package main.javaAPI.d0524;

import java.io.IOException;
import java.util.ArrayList;

import static main.Main.eingabe;

public class Aufgaben {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 24.05 ###");
            System.out.println("1. kleine Aufgabe");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        kleineAufgabe();
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

    private static void kleineAufgabe() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(77);
        list.add(-3);
        list.add(1000);
        list.add(-11);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ". " + list.get(i));
        }

        System.out.println(list);


    }


}
