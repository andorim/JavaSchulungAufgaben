package main.spielereien;

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
        printArrayContentsFromUnknownStringArray(str);
    }

    public static void printArrayContentsFromUnknownStringArray(Object obj) {
        if (obj.getClass().isArray()) {
            Object[] obj2 = (Object[]) obj;
            for (int i = 0; i < obj2.length; i++) {
                printArrayContentsFromUnknownStringArray(obj2[i]);
            }
        } else {
            System.out.println(obj.toString());
        }
    }
}
