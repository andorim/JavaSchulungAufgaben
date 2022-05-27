package main.inheritance.d0520;

public interface Container {
    /*
     * Speichert x im Container.
     * Liefert die neue Containergröße zurück.
     */
    int add(int x);


    /*
     * Überladen.
     * Speichert im Container x, danach y.
     * Liefert die neue Containergröße zurück.
     */
    default int add(int x, int y) {
        add(x);
        return add(y);
    }
}
