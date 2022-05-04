package main.arrays.d0503;

import main.OddbException;

import java.util.Random;

public class IntMatrix implements Cloneable {
    private int[][] matrix;

    public IntMatrix(int rows, int cols) throws OddbException {
        createMatrix(rows, cols);
    }

    public IntMatrix(int rows, int cols, int defaultValue) throws OddbException {
        createMatrix(rows, cols);
        initMatrix(defaultValue);
    }

    public static IntMatrix getRandomMatrix(int rows, int cols, int maxValue) throws OddbException {
        IntMatrix matrix = new IntMatrix(rows, cols);
        Random rand = new Random();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                matrix.set(i, j, rand.nextInt(maxValue + 1));
            }
        }
        return matrix;
    }

    public static IntMatrix add2Matrices(IntMatrix m1, IntMatrix m2) throws OddbException {
        if (m1.sameDimensions(m2)) {
            try {
                IntMatrix newM = (IntMatrix) m1.clone();
                newM.addMatrix(m2);
                return newM;
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        } else {
            throw new OddbException("Die beiden zu addierenden Matrizen müssen die gleichen Dimensionen haben!");
        }
    }

    public static IntMatrix multiply2Matrices(IntMatrix m1, IntMatrix m2) throws OddbException {
        if (m1.sameDimensions(m2)) {
            try {
                IntMatrix newM = (IntMatrix) m1.clone();
                newM.multiplyMatrix(m2);
                return newM;
            } catch (Exception ex) {
                ex.printStackTrace();
                return null;
            }
        } else {
            throw new OddbException("Die beiden zu addierenden Matrizen müssen die gleichen Dimensionen haben!");
        }
    }

    private void createMatrix(int rows, int cols) throws OddbException {
        if (rows >= 0 && cols >= 0) {
            this.matrix = new int[rows][cols];
        } else {
            throw new OddbException("Wie soll denn bitte eine Matrix mit einer negativen Anzahl an Zeilen/Spalten angelegt werden?!");
        }

    }

    public int get(int row, int col) throws OddbException {
        if (isRowValid(row) && isColValid(col)) {
            return this.matrix[row - 1][col - 1];
        } else {
            throw new OddbException("Die Angegebenen Koordinaten sind nicht korrekt!");
        }

    }

    public void set(int row, int col, int value) throws OddbException {
        if (isRowValid(row) && isColValid(col)) {
            this.matrix[row - 1][col - 1] = value;
        } else {
            throw new OddbException("Die Angegebenen Koordinaten sind nicht korrekt!");
        }
    }

    private boolean isRowValid(int row) {
        return row > 0 && row <= this.getNoOfRows();
    }

    private boolean isColValid(int col) {
        return col > 0 && col <= this.getNoOfCols();
    }

    public int getNoOfRows() {
        return matrix.length;
    }

    public int getNoOfCols() {
        return matrix[0].length;
    }

    private void initMatrix(int value) {
        try {
            for (int i = 1; i <= this.getNoOfRows(); i++) {
                for (int j = 1; j <= this.getNoOfCols(); j++) {
                    this.set(i, j, value);
                }
            }
        } catch (OddbException ex) {
            ex.printStackTrace();
        }
    }

    public boolean sameDimensions(IntMatrix m) {
        return this.getNoOfRows() == m.getNoOfRows() && this.getNoOfCols() == m.getNoOfCols();
    }

    @Override
    public boolean equals(Object m1) {
        if (!(m1 instanceof IntMatrix)) {
            return false;
        }
        IntMatrix m = (IntMatrix) m1;
        if (!this.sameDimensions(m)) {
            return false;
        }
        int rows = this.getNoOfRows();
        for (int i = 1; i <= rows; i++) {
            int cols = this.getNoOfCols();
            for (int j = 1; j <= cols; j++) {
                try {
                    if (this.get(i, j) != m.get(i, j)) {
                        return false;
                    }
                } catch (OddbException ex) {
                    ex.printStackTrace();
                    return false;
                }
            }
        }
        return true;
    }


    public boolean addMatrix(IntMatrix m) {
        if (!this.sameDimensions(m)) {
            return false;
        } else {
            for (int i = 1; i <= this.getNoOfRows(); i++) {
                for (int j = 1; j <= this.getNoOfCols(); j++) {
                    try {
                        this.set(i, j, this.get(i, j) + m.get(i, j));
                    } catch (OddbException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        return true;
    }

    public boolean multiplyMatrix(IntMatrix m) {
        if (!this.sameDimensions(m)) {
            return false;
        } else {
            for (int i = 1; i <= this.getNoOfRows(); i++) {
                for (int j = 1; j <= this.getNoOfCols(); j++) {
                    try {
                        this.set(i, j, this.get(i, j) * m.get(i, j));
                    } catch (OddbException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        return true;
    }

    public void transpose() {
        try {
            IntMatrix tmp = new IntMatrix(this.getNoOfRows(), this.getNoOfCols());
            for (int i = 1; i <= this.getNoOfRows(); i++) {
                for (int j = 1; j <= this.getNoOfCols(); j++) {
                    tmp.set(j, i, this.get(i, j));
                }
            }
            for (int i = 1; i <= this.getNoOfRows(); i++) {
                for (int j = 1; j <= this.getNoOfCols(); j++) {
                    this.set(i, j, tmp.get(i, j));
                }
            }
        } catch (OddbException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= this.getNoOfRows(); i++) {
            for (int j = 1; j <= this.getNoOfCols(); j++) {
                try {
                    if (j == this.getNoOfCols()) {
                        sb.append(this.get(i, j));
                    } else {
                        sb.append(this.get(i, j)).append(", ");
                    }
                } catch (OddbException ex) {
                    ex.printStackTrace();
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
