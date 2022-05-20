package main.inheritance.d0519.zahlraten;

public class Divide implements IntOperation {
    private int value;

    public Divide(int value) {
        this.value = value;
    }

    @Override
    public int execute(int x) {
        return x / value;
    }

}
