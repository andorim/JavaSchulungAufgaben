package de.andorim.ocaAufgaben.main.javaAPI.d0517;

import java.util.ArrayList;
import java.util.Scanner;


public class Calculator {

    public Calculator() {
        ArrayList<String> inputs = new ArrayList<String>();
        System.out.println("Berechnung eingeben!");
        Scanner scn = new Scanner(System.in);
        String eingabe = scn.nextLine();
        char[] chars = eingabe.toCharArray();
        String tmp = "";
        for (char c : chars) {

            while (Character.isDigit(c)) {
                tmp += String.valueOf(c);
            }
            inputs.add(tmp);
        }
        String[] eingaben = eingabe.split(" ");
        for (String s : eingaben) {
            System.out.print(s);
        }
    }

    public Calculator(String operations) {

    }
}

