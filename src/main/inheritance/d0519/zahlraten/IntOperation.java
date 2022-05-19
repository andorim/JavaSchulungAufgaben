package main.inheritance.d0519.zahlraten;

public interface IntOperation {
    int execute(int x);

    IntOperation andThen(IntOperation op);
}
