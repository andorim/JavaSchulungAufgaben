package de.andorim.ocaAufgaben.main.classes.d0427.objectClasses;

import java.util.Random;

public class Passwortgenerator {

    private int length;
    private String passwort;

    public Passwortgenerator() {
        this.length = 16;
    }

    public Passwortgenerator(int length) {
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String generatePasswort() {
        this.passwort = "";
        Random rand = new Random();
        for (int i = 0; i < this.length; i++) {
            char c = (char) (rand.nextInt(126 - 33) + 33);
            this.passwort += c;
        }
        return this.passwort;
    }

}
