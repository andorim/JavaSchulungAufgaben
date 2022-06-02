package de.andorim.ocaAufgaben.main.classes.d0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zufallszahlen {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        DecimalFormat valueDecFormat = new DecimalFormat(" 0000000 ");

        DecimalFormat percentDecFormat = new DecimalFormat("  000.00");

        double value = Math.random(); // erzeugt eine Zufallszahl [0 .. 1) (niemals 1)
        int roundedValue;
        int floorValue;
        int ceilValue;
        int castValue;
        int loops = 0;
        int maxValue = 0;
        double percentage;
        int[] countArrRound;
        int[] countArrFloor;
        int[] countArrCeil;
        int[] countArrCast;


        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        try {
            System.out.println("Geben Sie die Maximale Zahl ein!");
            maxValue = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Geben sie die Anzahl der Durchläufe an:");
            loops = Integer.parseInt(bufferedReader.readLine());
        } catch (Exception ex) {
            System.out.println("Eine Eingabe war nicht gültig!");
            System.out.println("Die Werte wurden auf max=10 und loops = 1000 gesetzt!");
            maxValue = 10;
            loops = 1000;
        }


        countArrRound = new int[maxValue + 1];
        countArrFloor = new int[maxValue + 1];
        countArrCeil = new int[maxValue + 1];
        countArrCast = new int[maxValue + 1];

        for (int i = 0; i < loops; i++) {
            value = Math.random();
            value = value * maxValue;
            roundedValue = (int) Math.round(value);
            floorValue = (int) Math.floor(value);
            ceilValue = (int) Math.ceil(value);
            castValue = (int) value;


            countArrRound[roundedValue]++;
            countArrFloor[floorValue]++;
            countArrCeil[ceilValue]++;
            countArrCast[castValue]++;
        }

        System.out.println("-------------------");
        System.out.println("Random Verteilung (value = Math.random()*maxValue)");
        System.out.println("|  Value  |       Round        |       Floor        |        Ceil        |        Cast        |");
        for (int i = 0; i <= maxValue; i++) {
            System.out.print("|" + valueDecFormat.format(i));

            System.out.print("|" + valueDecFormat.format(countArrRound[i]));
            percentage = 100.0 / loops * countArrRound[i];
            System.out.print("-" + percentDecFormat.format(percentage) + "% ");

            System.out.print("|" + valueDecFormat.format(countArrFloor[i]));
            percentage = 100.0 / loops * countArrFloor[i];
            System.out.print("-" + percentDecFormat.format(percentage) + "% ");

            System.out.print("|" + valueDecFormat.format(countArrCeil[i]));
            percentage = 100.0 / loops * countArrCeil[i];
            System.out.print("-" + percentDecFormat.format(percentage) + "% ");

            System.out.print("|" + valueDecFormat.format(countArrCast[i]));
            percentage = 100.0 / loops * countArrCast[i];
            System.out.print("-" + percentDecFormat.format(percentage) + "% |\n");

        }
        System.out.println("-------------------");

    }
}
