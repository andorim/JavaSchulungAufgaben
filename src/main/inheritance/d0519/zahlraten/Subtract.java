package main.inheritance.d0519.zahlraten;

public class Subtract implements IntOperation {
    private int value;

    public Subtract(int value) {
        this.value = value;
    }

    @Override
    public int execute(int x) {
        return x - value;
    }
}

