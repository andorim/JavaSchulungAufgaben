package main.spielereien;

import java.util.Arrays;

public class IterateThroughUnknownArray {


    public static void main(String[] args) {
        run();
    }

    public static void run() {
        String[][][][][] str = new String[2][2][5][20][50];
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                for (int k = 0; k < str[i][j].length; k++) {
                    for (int l = 0; l < str[i][j][k].length; l++) {
                        for (int m = 0; m < str[i][j][k][l].length; m++) {
                            str[i][j][k][l][m] = i + "." + j + "." + k + "." + l + "." + m;
                        }
                    }

                }
            }
        }
        //printArrayContentsFromUnknownArray(str);

        int[][][][][] intArr = new int[2][2][5][20][50];
        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                for (int k = 0; k < intArr[i][j].length; k++) {
                    for (int l = 0; l < intArr[i][j][k].length; l++) {
                        for (int m = 0; m < intArr[i][j][k][l].length; m++) {
                            intArr[i][j][k][l][m] = Integer.parseInt(i + "" + j + "" + k + "" + l + "" + m);
                        }
                    }

                }
            }
        }

        int[] iArr = {1, 2, 3};
        long[] longArr = Arrays.stream(iArr).asLongStream().toArray();


        int i = 1;
        long l = i;

        printArrayContentsFromUnknownArray(intArr);
    }

    public static void printArrayContentsFromUnknownArray(Object obj) {
        if (obj.getClass().isArray()) {
            Object[] obj2;
            try {
                obj2 = (Object[]) obj;
                for (int i = 0; i < obj2.length; i++) {
                    printArrayContentsFromUnknownArray(obj2[i]);
                }
            } catch (Exception ex) {
                //System.out.println(obj.getClass().toString());
                // TODO: 03.05.2022 auf jeden primitiven Datentyp muss geprüft werden

                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    String[] strArr = new String[iArr.length];
                    for (int i = 0; i < iArr.length; i++) {
                        strArr[i] = String.valueOf(iArr[i]);
                    }
                    printArrayContentsFromUnknownArray(strArr);
                }
                //ex.printStackTrace();
            }
        } else {
            System.out.println(obj);
        }
    }
}
