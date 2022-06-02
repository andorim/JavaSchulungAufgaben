package de.andorim.ocaAufgaben.main.inheritance.d0527;

public class Max implements IntOperation {


    public Max() {

    }

    @Override
    public int execute(int x, int y) {
        return Math.max(x, y);
    }


}
