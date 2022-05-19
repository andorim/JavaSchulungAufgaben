package main.inheritance.d0519.zahlraten;

public class Divide implements IntOperation {
    private int result;
    private int value;

    public Divide(int value) {
        this.value = value;
    }

    @Override
    public int execute(int x) {
        result = x / value;
        return result;
    }

    public IntOperation andThen(IntOperation op) {
        result = this.execute(result);
        op.execute(result);
        return op;
    }
}
