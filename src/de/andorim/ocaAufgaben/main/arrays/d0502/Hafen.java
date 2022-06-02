package de.andorim.ocaAufgaben.main.arrays.d0502;


public class Hafen {
    private int maxCapacity;
    private Schiff[] schiffe;

    public Hafen(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        schiffe = new Schiff[0];
    }

    public void addSchiff(Schiff schiff) {
        if (this.schiffe.length < this.maxCapacity) {
            Schiff[] temp = new Schiff[this.schiffe.length + 1];
            for (int i = 0; i < this.schiffe.length; i++) {
                temp[i] = this.schiffe[i];
            }
            temp[this.schiffe.length] = schiff;
            this.schiffe = temp;
            System.out.println("Schiff " + schiff + " wurde erfolgreich angedockt!");
        } else {
            System.out.println("Schiff " + schiff + " konnte nicht angedockt werden, da die maximale Anzahl erreicht wurde");
        }

    }

    public void removeSchiff(Schiff schiff) {
        try {
            boolean schiffFound = false;
            Schiff[] temp = new Schiff[this.schiffe.length - 1];
            int tempIndex = 0;
            for (int i = 0; i < schiffe.length; i++) {
                if (!this.schiffe[i].equals(schiff)) {
                    temp[tempIndex] = this.schiffe[i];
                    tempIndex++;
                } else {
                    schiffFound = true;
                }
            }
            if (schiffFound) {
                this.schiffe = temp;
                System.out.println("Schiff " + schiff + " wurde abgedockt!");
            } else {
                System.out.println("Schiff konnte nicht gefunden werden");
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Schiff konnte nicht gefunden werden");
        }

    }

    public void printDockedSchiffe() {
        for (Schiff s : this.schiffe) {
            System.out.println(s);
        }
    }


    @Override
    public String toString() {
        return "Hafen (Schiffe: " + this.schiffe.length + ". Freie Plätze: " + (this.maxCapacity - this.schiffe.length) + ")";
    }

    public Schiff getSchiffByIndex(int index) {
        return this.schiffe[index];
    }

    public int getNumberOfDockedSchiffe() {
        return this.schiffe.length;
    }

    public Schiff getSchiffByName(String name) {
        for (Schiff s : this.schiffe) {
            if (s.name.equals(name)) {
                return s;
            }
        }
        return null;
    }
}
