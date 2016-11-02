package arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] x = {34, 25, 49, 85, 67, 26};

        for (int i = 0; i < x.length / 2; i++) {
            int buf = x[i];
            x[i] = x[x.length - 1 - i];
            x[x.length - 1 - i] = buf;
        }
    }
}
