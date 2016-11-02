package sorting;

public class BruteForceSort {
    public static void main(String[] args) {
        int[] x = {34, 25, 49, 85, 67};

        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int buf = x[i];
                    x[i] = x[j];
                    x[j] = buf;
                }
            }
        }
    }
}
