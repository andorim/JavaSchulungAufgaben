package main.classes.d0428;

public class Person {

    private String vorname;
    private String nachname;
    private int geburtsjahr = 0;
    private int postleitzahl = 0;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    ;

    public Person(String vorname, String nachname, int geburtsjahr, int postleitzahl) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsjahr = geburtsjahr;
        this.postleitzahl = postleitzahl;
    }

    public static Person getMustermann() {
        return new Person("Max", "Mustermann", 1960, 12345);
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    @Override
    public String toString() {
        String geburtsjahrAlsText = String.format("%04d", geburtsjahr);

        return vorname + " " + nachname
                + ", Geburtsjahr: " + geburtsjahrAlsText
                + ", Plz: " + postleitzahl;
    }

    @Override
    public boolean equals(Object obj) {
        Person p2 = (Person) obj;

        return vorname.equals(p2.vorname)
                && nachname.equals(p2.nachname)
                && geburtsjahr == p2.geburtsjahr
                && postleitzahl == p2.postleitzahl;
    }
}
