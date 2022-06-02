package de.andorim.ocaAufgaben.main.inheritance.d0511;

public class Hund extends Tier {

    public Hund(String name, int alter, boolean gesund) {
        super(name, alter, gesund);
    }

    @Override
    public void laufen() {
        System.out.println("Hund " + getName() + " läuft");
    }

    @Override
    public String toString() {
        return "Hund " + super.toString();
    }
}
