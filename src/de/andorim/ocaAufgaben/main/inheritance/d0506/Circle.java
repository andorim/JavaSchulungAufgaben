package de.andorim.ocaAufgaben.main.inheritance.d0506;

public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Kreis (Radius: " + this.radius + ")";
    }


}
