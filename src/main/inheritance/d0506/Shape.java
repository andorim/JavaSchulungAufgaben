package main.inheritance.d0506;

public class Shape {
    int coordX, coordY;

    public Shape() {
        setCoordX(0);
        setCoordY(0);
    }

    public Shape(int coordX, int coordY) {
        setCoordX(coordX);
        setCoordY(coordY);
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public String getCoordinatesString() {
        return "Koordinaten: x: " + getCoordX() + " y: " + getCoordY();
    }

    public void bewegen(int coordX, int coordY) {
        setCoordX(coordX);
        setCoordY(coordY);
    }
}
