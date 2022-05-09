package main.inheritance.d0506;

public class Rectangle extends Shape {
    int height;
    int width;

    public Rectangle(int height, int width) {
        super();
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rechteck (Höhe: " + this.height + " Breite: " + this.width + ")";
    }


}
