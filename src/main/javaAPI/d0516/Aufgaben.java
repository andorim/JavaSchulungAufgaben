package main.javaAPI.d0516;

import main.OddbException;

import java.io.IOException;
import java.util.Date;

import static main.Main.eingabe;

public class Aufgaben {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 16.05 ###");
            System.out.println("1. kleine Aufgabe Index Of");
            System.out.println("2. String - StringBuilder (ein langer String)");
            System.out.println("3. String - StringBuilder (pro loop neuer String)");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        kleineAufgabeStringIndexOf();
                        break;
                    case 2:
                        stringStringBuilder();
                        break;
                    case 3:
                        stringStringBuilder2();
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

    private static void kleineAufgabeStringIndexOf() {
        try {
            String s = eingabe("Zu durchsuchender String:");
            String c = eingabe("Der zu suchende String:");
            int index = s.indexOf(c, 0);
            while (index > -1) {
                System.out.println(index);
                index = s.indexOf(c, index + 1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void stringStringBuilder() {
        try {
            String s1 = "Hello";
            String s2 = " ";
            String s3 = "Welt";

            int loops = Integer.parseInt(eingabe("Anzahl Druchläufe:"));
            if (loops < 0) {
                throw new OddbException("Zahl zu klein/groß!");
            }
            StringBuilder sb = new StringBuilder();
            String string = "";

            Date date = new Date();
            long start = date.getTime();
            for (int i = 0; i < loops; i++) {
                // Unter java 17 im Vergleich zu Java 8 um einiges schneller!
                string += s1 + s2 + s3;
            }
            date = new Date();
            long stringTime = date.getTime() - start;
            System.out.println("Stringtime (ms): " + stringTime);
            System.out.println("string.length() : " + string.length());

            date = new Date();
            start = date.getTime();
            for (int i = 0; i < loops; i++) {
                sb.append(s1);
                sb.append(s2);
                sb.append(s3);
            }
            date = new Date();
            long sbTime = date.getTime() - start;
            System.out.println("StringBuilderTime (ms): " + sbTime);
            System.out.println("sb.length() : " + sb.length());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private static void stringStringBuilder2() {
        try {
            String s1 = "Hello";
            String s2 = " ";
            String s3 = "Welt";

            int loops = Integer.parseInt(eingabe("Anzahl Druchläufe:"));
            if (loops < 0) {
                throw new OddbException("Zahl zu klein/groß!");
            }
            StringBuilder sb = new StringBuilder();
            String string = "";

            Date date = new Date();
            long start = date.getTime();
            for (int i = 0; i < loops; i++) {
                string = "";
                string += s1;
                string += s2;
                string += s3;
            }
            date = new Date();
            long stringTime = date.getTime() - start;
            System.out.println("Stringtime (ms): " + stringTime);
            System.out.println("string.length() : " + string.length());


            date = new Date();
            start = date.getTime();
            for (int i = 0; i < loops; i++) {
                //sb = new StringBuilder();     // sehr langsam!
                //sb.delete(0, sb.length());    // sehr viel schneller!
                sb.setLength(0);                // noch schneller!
                sb.append(s1);
                sb.append(s2);
                sb.append(s3);
            }
            date = new Date();
            long sbTime = date.getTime() - start;
            System.out.println("StringBuilderTime (ms): " + sbTime);
            System.out.println("sb.length() : " + sb.length());


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


}
