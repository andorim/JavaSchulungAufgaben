package main.inheritance.d0519.zahlraten;

public class ChangeSign implements IntOperation {
    int value;

    public ChangeSign() {
        this.value = -1;
    }

    @Override
    public int execute(int x) {
        return x * value;
    }


}
