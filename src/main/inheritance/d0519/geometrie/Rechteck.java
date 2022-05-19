package main.inheritance.d0519.geometrie;

public class Rechteck implements Shape {
    private int breite;
    private int hoehe;

    public Rechteck(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public int getBreite() {
        return breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    @Override
    public double getFlaeche() {
        return hoehe * breite;
    }
}
