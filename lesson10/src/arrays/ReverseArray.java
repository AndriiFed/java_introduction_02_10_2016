package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] x = {34, 25, 49, 85, 67};

        int[] y = new int[x.length];

        for (int i = x.length - 1; i >= 0; i--) {
            y[x.length - i - 1] = x[i];
        }

        OutputArray.output(y);
    }
}
