package de.andorim.ocaAufgaben.main.javaDev.d0620;

import java.io.IOException;
import java.sql.*;
import java.util.Random;

import static de.andorim.ocaAufgaben.main.Main.eingabe;


public class Aufgaben {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 20.06 ###");
            System.out.println("1. Verbindung zur Datenbank");
            System.out.println("2. createTable");
            System.out.println("3. insertData");
            System.out.println("4. insertBatchData");
            System.out.println("5. preparedStatement");
            System.out.println("6. getData");
            System.out.println("7. truncateData");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        verbindungZuDatenbank();
                        break;
                    case 2:
                        createTable();
                        break;
                    case 3:
                        insertData();
                        break;
                    case 4:
                        insertBulkData();
                        break;
                    case 5:
                        preparedStatement();
                        break;
                    case 6:
                        getData();
                        break;
                    case 7:
                        truncateTable();
                        break;
                    case 99:
                        weiter = false;
                        break;
                    default:
                        System.out.println("Fehler bei der Eingabe!");
                }
            } catch (IOException | NumberFormatException ex) {
                System.out.println("Fehler bei der Eingabe!");
            }
        }
    }

    private static void verbindungZuDatenbank() {
        /*
         * Url, mit der eine bereits vorhandene Datenbank geöffnet werden kann:
         * String url = "jdbc:derby:/home/andorim/Projekte/JavaSchulung/testdb";
         */
        String url = "jdbc:derby:/home/andorim/Projekte/JavaSchulung/testdb;create=true";
        try (Connection connection = DriverManager.getConnection(url)) {

            System.out.println("Verbindung steht!");


        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        /*
         * Speziell für Apache-Derby;
         *
         * Wenn sie die Apache-Derby-Datenbank schließen möchten,
         * sollten Sie eine Verbindung mir folgender Url öffnen
         * und dabei eine Exception erhalten!
         *
         * String url = "jdbc:derby:/home/andorim/Projekte/JavaSchulung/testdb;shutdown=true";
         */

    }

    private static void createTable() {
        String sql = "CREATE TABLE rechteck (breite int, hoehe int)";
        String url = "jdbc:derby:/home/andorim/Projekte/JavaSchulung/testdb;create=true";
        try (Connection connection = DriverManager.getConnection(url); Statement stmt = connection.createStatement()) {

            stmt.execute(sql);
            System.out.println("tabelle wurde angelegt");


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void insertData() {

        long start = System.currentTimeMillis();
        String url = "jdbc:derby:/home/andorim/Projekte/JavaSchulung/testdb;create=true";
        try (Connection connection = DriverManager.getConnection(url); Statement stmt = connection.createStatement()) {
            Random rand = new Random();
            for (int i = 0; i < 100_000; i++) {
                String sql = "INSERT INTO rechteck (breite, hoehe) VALUES (" + rand.nextInt(500) + "," + rand.nextInt(500) + ")";
                stmt.execute(sql);
            }
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println("Daten wurden eingefügt (" + time + " ms)");


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void insertBulkData() {
        long start = System.currentTimeMillis();
        String url = "jdbc:derby:/home/andorim/Projekte/JavaSchulung/testdb;create=true";
        try (Connection connection = DriverManager.getConnection(url); Statement stmt = connection.createStatement()) {
            Random rand = new Random();
            for (int i = 0; i < 100_000; i++) {
                String sql = "INSERT INTO rechteck (breite, hoehe) VALUES (" + rand.nextInt(500) + "," + rand.nextInt(500) + ")";
                stmt.addBatch(sql);
            }
            stmt.executeBatch();
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println("Daten wurden eingefügt (" + time + " ms)");


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void preparedStatement() {
        long start = System.currentTimeMillis();
        String url = "jdbc:derby:/home/andorim/Projekte/JavaSchulung/testdb;create=true";
        String sql = "INSERT INTO rechteck (breite, hoehe) VALUES(?,?)";
        try (Connection connection = DriverManager.getConnection(url); PreparedStatement stmt = connection.prepareStatement(sql)) {
            Random rand = new Random();
            for (int i = 0; i < 100_000; i++) {
                stmt.setInt(1, rand.nextInt());
                stmt.setInt(2, rand.nextInt());
                stmt.executeUpdate();

            }
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println("Daten wurden eingefügt (" + time + " ms)");


        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getData() {
        String sql = "SELECT * from rechteck";
        String url = "jdbc:derby:/home/andorim/Projekte/JavaSchulung/testdb;create=true";
        try (Connection connection = DriverManager.getConnection(url); Statement stmt = connection.createStatement()) {

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println("Rechteck: breite: " + rs.getString("breite") + " , hoehe: " + rs.getString("hoehe"));
            }


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static void truncateTable() {
        String sql = "TRUNCATE TABLE rechteck";
        String url = "jdbc:derby:/home/andorim/Projekte/JavaSchulung/testdb;create=true";
        try (Connection connection = DriverManager.getConnection(url); Statement stmt = connection.createStatement()) {

            stmt.execute(sql);
            System.out.println("Daten wurden gelöscht");


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


}
