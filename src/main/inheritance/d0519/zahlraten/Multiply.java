package main.inheritance.d0519.zahlraten;

public class Multiply implements IntOperation {
    private int value;

    public Multiply(int value) {
        this.value = value;
    }

    @Override
    public int execute(int x) {
        return x * value;
    }

}
