package de.andorim.ocaAufgaben.main.inheritance.d0520;

import java.util.ArrayList;

public class Test2 implements Sum, Container {
    ArrayList<Integer> list;

    public Test2() {
        list = new ArrayList<>();
    }

    @Override
    public int add(int x) {
        list.add(x);
        return list.size();
    }

    @Override
    public int add(int a, int b) {
        return Sum.super.add(a, b);
    }

    public int addToContainer(int a, int b) {
        return Container.super.add(a, b);
    }
}
