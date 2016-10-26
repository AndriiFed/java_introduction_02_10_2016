package arrays;

public class MinimumElement {
    public static void main(String[] args) {

        int[] array = {4, 5, 3, -1, 8};

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Минимальный элемент: " + min);
    }
}
