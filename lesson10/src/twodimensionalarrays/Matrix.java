package twodimensionalarrays;

import arrays.OutputArray;

public class Matrix {
    public static void main(String[] args) {

        final int size = 5;

        int[][] x = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                x[i][j] = i * size + j;
            }
        }

        OutputArray.outputMatrix(x, size);
    }
}
