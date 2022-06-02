package de.andorim.ocaAufgaben.main.inheritance.d0511;

public class Katze extends Tier {

    public Katze(String name, int alter, boolean gesund) {
        super(name, alter, gesund);
    }

    @Override
    public void laufen() {
        System.out.println("Katze " + getName() + " läuft");
    }

    @Override
    public String toString() {
        return "Katze " + super.toString();
    }

}
