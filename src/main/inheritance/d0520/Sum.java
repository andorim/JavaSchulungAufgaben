package main.inheritance.d0520;

public interface Sum {
    default int add(int a, int b) {
        return a + b;
    }
}
