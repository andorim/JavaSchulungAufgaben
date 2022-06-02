package de.andorim.ocaAufgaben.main.inheritance.d0601;

class Blume implements Comparable<Blume> {
    private String name;
    private int preis;

    public Blume(String name, int preis) {
        super();
        this.name = name;
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "Blume " + name + "(" + preis + ")";
    }

    @Override
    public int compareTo(Blume o) {
        return this.preis - o.preis;
    }
}
