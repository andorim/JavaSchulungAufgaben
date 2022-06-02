package de.andorim.ocaAufgaben.main.inheritance.d0519.zahlraten;

import java.util.ArrayList;

// TODO: 23.05.22 Bessere Lösung siehe die Lösung vom Dozent

public class CombinedIntOperation implements IntOperation {

    private ArrayList<IntOperation> ops;

    public CombinedIntOperation(IntOperation op1, IntOperation op2) {
        ops = new ArrayList<IntOperation>();
        ops.add(op1);
        ops.add(op2);
    }

    @Override
    public int execute(int x) {
        for (IntOperation op : ops) {
            x = op.execute(x);
        }
        return x;
    }

    @Override
    public IntOperation andThen(IntOperation op) {
        ops.add(op);
        return this;
    }
}
