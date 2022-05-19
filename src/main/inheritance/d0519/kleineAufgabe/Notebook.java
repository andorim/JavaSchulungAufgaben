package main.inheritance.d0519.kleineAufgabe;

public class Notebook extends Product {

    public Notebook(String name, int priceInEuro) {
        super(name, priceInEuro * 100L);
    }

    public String toString() {
        return this.getName() + ", (" + this.getPriceInEuro() + "€)";
    }


}
