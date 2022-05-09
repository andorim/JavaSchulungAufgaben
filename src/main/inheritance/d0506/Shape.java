package main.inheritance.d0506;

public class Shape {
    int coordX, coordY;

    public Shape() {
        this.coordX = 0;
        this.coordY = 0;
    }

    public Shape(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public String getCoordinatesString() {
        return "Kooridinaten: x: " + this.coordX + " y: " + this.coordY;
    }

    public void bewegen(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public void moveTo(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }
}
