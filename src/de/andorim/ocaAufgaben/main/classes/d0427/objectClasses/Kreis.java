package de.andorim.ocaAufgaben.main.classes.d0427.objectClasses;

public class Kreis {
    public int radius;

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Kreis. R = " + this.radius;
    }

}
