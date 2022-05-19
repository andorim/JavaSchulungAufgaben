package main.inheritance.d0519.getMax;

public class Kreis implements ValueSupplier {
    private int radius;

    public Kreis(int radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Kreis. R = " + radius;
    }

    @Override
    public int getValue() {
        return radius;
    }
}
