package main.classes.d0428;

public class PersonBuilder {
    String vorname;
    String nachname;
    int geburtsjahr;

    int postleitzahl;

    public PersonBuilder vorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    public PersonBuilder nachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    public PersonBuilder geburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
        return this;
    }

    public PersonBuilder postleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
        return this;
    }

    public Person build() {
        return new Person(this.vorname, this.nachname, this.geburtsjahr, this.postleitzahl);
    }

}
