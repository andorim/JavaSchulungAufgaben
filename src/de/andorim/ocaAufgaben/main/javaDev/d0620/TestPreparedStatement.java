package de.andorim.ocaAufgaben.main.javaDev.d0620;

import java.sql.*;
import java.util.Random;

public class TestPreparedStatement {

    static final int NUMBER_OF_RECTANGLES = 100_000;

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection("jdbc:derby:mydb;create=true");
             Statement stm = connection.createStatement()) {

            System.out.println("*** Tabelle für Rechtecke erzeugen");
            prepareEmptyTable(stm);


            System.out.println("*** " + NUMBER_OF_RECTANGLES
                    + " zufällige Rechtecke in der Tabelle speichern");

            long timeStart = System.currentTimeMillis();

//			insertMitStatement(connection);
            insertMitPreparedStatement(connection);

            long timeEnd = System.currentTimeMillis();

            long time = (timeEnd - timeStart) / 1000;
            System.out.println("Fertig in " + time + " Sek.");

            System.out.println("*** Tabelle lesen");
//			int count = getTableSize(connection);
            int count = getTableSizeMitCountFunction(connection);

            System.out.println("Anzahl der Rechtecke in der Tabelle: " + count);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    } // end of main


    static void insertMitPreparedStatement(Connection connection) throws SQLException {

        String sql = "insert into rechtecke (breite, hoehe) values (?, ?)"; // ? ist ein Platzhalter für Werte

        try (PreparedStatement stm = connection.prepareStatement(sql)) {

            Random r = new Random();
            for (int i = 0; i < NUMBER_OF_RECTANGLES; i++) {
                int breite = r.nextInt(100) + 1;
                int hoehe = r.nextInt(100) + 1;

                stm.setInt(1, breite); // 1 steht für den Platzhalter Nr. 1
                stm.setInt(2, hoehe);  // 2 steht für den Platzhalter Nr. 2

                stm.executeUpdate();
            }
        }
    }


    static void insertMitStatement(Connection connection) throws SQLException {

        try (Statement stm = connection.createStatement()) {

            Random r = new Random();
            for (int i = 0; i < NUMBER_OF_RECTANGLES; i++) {
                int breite = r.nextInt(100) + 1;
                int hoehe = r.nextInt(100) + 1;

                String sql = "insert into rechtecke (breite, hoehe) values ("
                        + breite + ", " + hoehe + ")";
                stm.executeUpdate(sql);
            }
        }
    }

    static int getTableSizeMitCountFunction(Connection connection) throws SQLException {
        try (Statement stm = connection.createStatement();
             ResultSet res = stm.executeQuery("select COUNT(*) from rechtecke")) {

            if (res.next()) {
                return res.getInt(1); // Zelle mit der Anzahl der zeile der Tabelle rechtecke
            }

            throw new IllegalStateException("Keine Antwort von der Function select erhalten");
        }
    }


    static int getTableSize(Connection connection) throws SQLException {
        try (Statement stm = connection.createStatement();
             ResultSet res = stm.executeQuery("select * from rechtecke")) {

            int countLines = 0;
            while (res.next()) {
//				int breite = res.getInt("breite");
//				int hoehe = res.getInt("hoehe");
//				System.out.println("B X H: " + breite + " X " + hoehe);

                countLines++;
            }

            return countLines;
        }
    }

    static void prepareEmptyTable(Statement stm) throws SQLException {

        try {
            stm.executeUpdate("drop table rechtecke");
            System.out.println("Alte Tabelle gelöscht ");

        } catch (SQLException e) {
            if ("42Y55".equals(e.getSQLState())) {
                System.out.println("Alte Tabelle nicht gefunden");
            } else {
                throw e;
            }
        }

        stm.executeUpdate("create table rechtecke (breite int, hoehe int)");
        System.out.println("Leere Tabelle wurde erzeugt");
    }


}
