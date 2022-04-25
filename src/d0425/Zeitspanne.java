package d0425;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zeitspanne {
    private static InputStreamReader reader = new InputStreamReader(System.in);
    private static BufferedReader bfr = new BufferedReader(reader);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 25.04 Zeitspanne ###");
            System.out.println("1. getZeitspanne (25.03.2020 - 5.7.2022");
            System.out.println("2. getZeitspanne (25.03.2022 - 5.7.2022");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        System.out.println(getZeitspanneInGanzenTagen(25, 3, 2020, 5, 7, 2022));
                        break;
                    case 2:
                        System.out.println(getZeitspanneInGanzenTagen(25, 3, 2022, 5, 7, 2022));
                        break;
                    case 99:
                        weiter = false;
                        break;
                    default:
                        System.out.println("Fehler bei der Eingabe!");
                }
            } catch (Exception ex) {
                System.out.println("Fehler bei der Eingabe!");
            }
        }
    }

    private static String eingabe() throws IOException {
        return bfr.readLine();
    }

    private static String eingabe(String text) throws IOException {
        System.out.println(text);
        return bfr.readLine();
    }

    private static int getZeitspanneInGanzenTagen(int day1, int month1, int year1, int day2, int month2, int year2) {
        int days = 0;
        for (int year = year1; year < year2; year++) {
            if (isSchaltjahr(year)) {
                days += 366;
            } else {
                days += 365;
            }
        }

        for (int i = 1; i < month1; i++) {
            days -= getDaysOfMonth(i, year1);
        }
        days -= day1;

        for (int i = 1; i < month2; i++) {
            days += getDaysOfMonth(i, year2);
        }
        days += day2;

        return days;

    }

    private static boolean isSchaltjahr(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static int getDaysOfMonth(int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isSchaltjahr(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }

}
