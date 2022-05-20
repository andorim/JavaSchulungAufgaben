package main.inheritance.d0519.zahlraten;

public class Add implements IntOperation {
    private int value;

    public Add(int value) {
        this.value = value;
    }

    @Override
    public int execute(int x) {
        return x + value;

    }


}
