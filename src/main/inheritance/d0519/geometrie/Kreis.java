package main.inheritance.d0519.geometrie;

public class Kreis implements Shape {
    private int radius;

    public Kreis(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getFlaeche() {
        return Math.PI * Math.pow(radius, 2);
    }
}
