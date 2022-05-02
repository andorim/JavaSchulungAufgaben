package main.classes.d0427.objectClasses;

public class Rechteck {
    public int breite;
    public int hoehe;

    public static void setDimensions(Rechteck rechteck, int breite, int hoehe) {
        rechteck.breite = breite;
        rechteck.hoehe = hoehe;
    }

    public void setDimensions(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Rechteck (" + this.breite + " x " + this.hoehe + ")";
    }
}
