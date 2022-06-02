package de.andorim.ocaAufgaben.main;

/**
 * Ob du doof bist Exception
 */
public class OddbException extends Exception {
    String massage;

    /**
     * Ob du doof bist Exception
     *
     * @param massage Die zu mitteilende Nachricht
     */
    public OddbException(String massage) {
        super();
        this.massage = massage;

    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.out.println("Ob du doof bist? | " + massage);
        System.out.println("Beende Programm weil du doof bist!");
        System.exit(1);
    }
}
