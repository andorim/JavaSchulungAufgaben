package de.andorim.ocaAufgaben.main.inheritance.d0527;

public class CPU {
    private int anzahlKerne;
    private String hersteller;

    public CPU(int anzahlKerne, String hersteller) {
        this.anzahlKerne = anzahlKerne;
        this.hersteller = hersteller;
    }

    public int getAnzahlKerne() {
        return anzahlKerne;
    }

    public String getHersteller() {
        return hersteller;
    }
}
