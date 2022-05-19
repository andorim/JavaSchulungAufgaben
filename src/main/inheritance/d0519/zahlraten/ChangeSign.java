package main.inheritance.d0519.zahlraten;

public class ChangeSign implements IntOperation {
    int value = -1;
    int result;

    public ChangeSign() {

    }

    @Override
    public int execute(int x) {
        result = x * value;
        return result;
    }

    public IntOperation andThen(IntOperation op) {
        result = this.execute(result);
        op.execute(result);
        return op;
    }

}
