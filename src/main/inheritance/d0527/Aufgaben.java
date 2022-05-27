package main.inheritance.d0527;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static main.Main.eingabe;

public class Aufgaben {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        boolean weiter = true;


        while (weiter) {
            System.out.println();
            System.out.println("### Aufgaben 27.05 ###");
            System.out.println("1. A1");
            System.out.println("2. A2");
            System.out.println("3. A3");
            System.out.println("4. A4");
            System.out.println("99. Zurück");
            System.out.println("######################");
            try {
                int eingabe = Integer.parseInt(eingabe());
                System.out.println();
                switch (eingabe) {
                    case 1:
                        a1();
                        break;
                    case 2:
                        a2();
                        break;
                    case 3:
                        a3();
                        break;
                    case 4:
                        a4();
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

    private static void a1() {
        IntOperation op1 = new Sum();    // Kann Summe bilden
        System.out.println(op1.execute(2, 3)); // 5

        IntOperation op2 = (x, y) -> { // hier eine Lambda zum Bilden der Summe
            return x + y;
        };
        System.out.println(op2.execute(2, 3)); // 5

        IntOperation op3 = new Max(); // Kann den größeren Wert ermitteln
        System.out.println(op3.execute(-6, 17)); // 17

        IntOperation op4 = (a, b) -> { // hier eine Lambda um den größeren Wert zu ermitteln
            return Math.max(a, b);
        };
        System.out.println(op4.execute(-6, 17)); // 17
    }

    private static void a2() {
        List<String> list = new ArrayList<>();
        list.add("Alfred");
        list.add("Berthold");
        list.add("Adam");
        list.add("Gustav");
        list.add("Dustin");

        System.out.println("vor dem sortieren: \n" + list);

        list.sort((String s1, String s2) -> {
            return s1.compareTo(s2);
        });

        System.out.println("nach dem Sortieren: \n" + list);

    }

    private static void a3() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(12);
        list1.add(13);

        List<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(22);
        list2.add(23);

        ListPair combiner = (listA, listB) -> { // hier die Lambda-Funktion
            List<Integer> result = new ArrayList<>();
            for (Integer i : listA) {
                result.add(i);
            }

            result.addAll(listB);

            return result;
        };


        List<Integer> list3 = combiner.accept(list1, list2);
        //list3 hat alle Elemente aus list1 und list2

        System.out.println(list3);
    }

    private static void a4() {
        ArrayList<CPU> list = new ArrayList<>();
        list.add(new CPU(16, "INTEL"));
        list.add(new CPU(32, "AMD"));
        list.add(new CPU(4, "Samsung"));
        list.add(new CPU(8, "Qualcomm"));

        list.forEach(cpu ->
                System.out.println(cpu.getHersteller())
        );
    }


}
