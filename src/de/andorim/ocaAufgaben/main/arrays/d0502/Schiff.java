package de.andorim.ocaAufgaben.main.arrays.d0502;

public class Schiff {
    public String name;

    public Schiff() {

    }

    public Schiff(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (this.name == null) {
            return "Unknown Schiff";
        }
        return this.name;
    }
}
