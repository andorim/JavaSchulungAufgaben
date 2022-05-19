package main.inheritance.d0519.getMax;

public class Size implements ValueSupplier {
    private int value;

    public Size(int value) {
        this.value = value;
    }

    public String toString() {
        return "Size: " + value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
