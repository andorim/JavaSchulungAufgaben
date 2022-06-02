package de.andorim.ocaAufgaben.main.javaAPI.d0513;

import java.io.IOException;
import java.util.Random;

import static de.andorim.ocaAufgaben.main.Main.eingabe;

public class Aufgaben {
    private static String[] syllables;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;

        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben JavaAPI ###");
            System.out.println("1. klein Aufgabe (String umdrehen)");
            System.out.println("2. Einfache Aufgabe");
            System.out.println("3. Silben");
            System.out.println("99. Zurück");
            System.out.println("##########################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        kleineAufgabe(eingabe("Gib ein Text ein:"));
                        break;
                    case 2:
                        System.out.println(einfacheAufgabe(eingabe("Gib ein Dateinamen an:")));
                        break;
                    case 3:
                        namensGenerator();
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

    private static void kleineAufgabe(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
    }

    private static boolean einfacheAufgabe(String fileName) {
        if (fileName == null) {
            throw new IllegalArgumentException();
        }
        int indexOfPoint = fileName.lastIndexOf(".");
        if (indexOfPoint == 0) {
            return false;
        }
        String fileExt = fileName.substring(indexOfPoint + 1).toLowerCase();
        return fileExt.equals("txt");
    }

    private static void fillSyllables() {
        syllables = new String[22];
        syllables[0] = "bei";
        syllables[1] = "spiel";
        syllables[2] = "pro";
        syllables[3] = "gi";
        syllables[4] = "idre";
        syllables[5] = "An";
        syllables[6] = "do";
        syllables[7] = "rim";
        syllables[8] = "blei";
        syllables[9] = "chris";
        syllables[10] = "ti";
        syllables[11] = "an";
        syllables[12] = "pe";
        syllables[13] = "ter";
        syllables[14] = "alex";
        syllables[15] = "der";
        syllables[16] = "com";
        syllables[17] = "de";
        syllables[18] = "neu";
        syllables[19] = "tro";
        syllables[20] = "ge";
        syllables[21] = "na";
    }

    private static String generiere(String[] arrSyl, int noOfSyl) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < noOfSyl; i++) {
            sb.append(arrSyl[rand.nextInt(arrSyl.length)].toLowerCase());
        }
        sb.replace(0, 1, String.valueOf(sb.charAt(0)).toUpperCase());
        return sb.toString();
    }

    private static void namensGenerator() {
        try {
            fillSyllables();
            Random rand = new Random();
            int noOfNames = Integer.parseInt(eingabe("Wie viele Namen sollen generiert werden?"));
            for (int i = 0; i <= noOfNames; i++) {
                System.out.println(generiere(syllables, rand.nextInt(5) + 2));
            }
            System.out.println();
        } catch (Exception ex) {
            System.out.println("Fehler bei der Eingabe!");
        }
    }


}
