package main.inheritance.d0519.zahlraten;

public class Add implements IntOperation {
    private int value;
    private int result;

    public Add(int value) {
        this.value = value;
    }

    @Override
    public int execute(int x) {
        result = x + value;
        return result;
    }

    @Override
    public IntOperation andThen(IntOperation op) {
        result = this.execute(result);
        op.execute(result);
        return op;
    }
}
