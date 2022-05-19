package main.inheritance.d0519.kleineAufgabe;

public class Flower extends Product {


    public Flower(String name, int priceInCent) {
        super(name, priceInCent);
    }

    public String toString() {
        return this.getName() + ", " + this.getPrice() + " Cent";
    }

}
