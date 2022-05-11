package main.inheritance.d0511;

import java.util.Arrays;

public class Safe {
    private char[] password;

    public Safe(char[] password) {
        this.password = password;
    }

    public boolean open(char[] passwordToTry) {
        return Arrays.equals(passwordToTry, password);
    }
}
