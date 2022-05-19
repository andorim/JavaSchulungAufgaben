package main.inheritance.d0519.kleineAufgabe;

public abstract class Product implements PriceSupplier {

    private String name;
    private long priceInCent;

    public Product(String name, long priceInCent) {
        this.name = name;
        this.priceInCent = priceInCent;
    }

    public abstract String toString();

    public String getName() {
        return this.name;
    }

    @Override
    public int getPriceInEuro() {
        return (int) this.getPrice() / 100;
    }

    @Override
    public long getPriceInCent() {
        return priceInCent;
    }
}
