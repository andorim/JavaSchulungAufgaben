package main.classes.d0427.objectClasses;

public class Land {

    public String name;
    public int einwohnerZahl;

    public static void print(Land land) {
        System.out.println(land.name + ": Einwohnerzahl: " + land.einwohnerZahl);
    }

    public void print() {
        System.out.println(this.name + ": Einwohnerzahl: " + this.einwohnerZahl);
    }
}
