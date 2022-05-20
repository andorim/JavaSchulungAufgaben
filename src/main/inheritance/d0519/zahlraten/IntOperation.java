package main.inheritance.d0519.zahlraten;

public interface IntOperation {
    int execute(int x);

    default IntOperation andThen(IntOperation op) {
        return new CombinedIntOperation(this, op);
    }
}
