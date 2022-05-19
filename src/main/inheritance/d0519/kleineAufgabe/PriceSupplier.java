package main.inheritance.d0519.kleineAufgabe;

public interface PriceSupplier {


    /**
     * Get price in Euro
     *
     * @return price in Euro
     */
    int getPriceInEuro();

    /**
     * Get price in cent
     *
     * @return price in cent
     */
    long getPriceInCent();

    default long getPrice() {
        return getPriceInCent();
    }
}
