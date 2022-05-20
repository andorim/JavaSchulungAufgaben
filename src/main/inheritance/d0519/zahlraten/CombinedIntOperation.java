package main.inheritance.d0519.zahlraten;

import java.util.ArrayList;

public class CombinedIntOperation implements IntOperation {

    private ArrayList<IntOperation> ops;

    public CombinedIntOperation(IntOperation op1, IntOperation op2) {
        ops = new ArrayList<IntOperation>();
        ops.add(op1);
        ops.add(op2);
    }

    @Override
    public int execute(int x) {
        int temp = x;
        for (IntOperation op : ops) {
            temp = op.execute(temp);
        }
        return temp;
    }

    @Override
    public IntOperation andThen(IntOperation op) {
        ops.add(op);
        return this;
    }
}
