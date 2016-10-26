package arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] x = {45, 87, 98};
        int[] y = {54, 45, 23, 12, 35};

        int[] merged = new int[x.length + y.length];

        for (int i = 0; i < x.length; i++) {
            merged[i] = x[i];
        }

        for (int i = 0; i < y.length; i++) {
            merged[i + x.length] = y[i];
        }

        InputArray.outputArray(merged);
    }
}
