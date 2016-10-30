package arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 5, 6, 9, 12, 15, 18, 35};

        int n = 5;

        int fromIndex = 0;
        int toIndex = array.length - 1;

        boolean exists = false;

        while (fromIndex <= toIndex) {

            int midIndex = (toIndex - fromIndex) / 2 + fromIndex;

            if (array[midIndex] == n) {
                exists = true;
                break;
            }

            if (array[midIndex] > n) {
                toIndex = midIndex;
            } else {
                fromIndex = midIndex;
            }
        }

        if (exists) {
            System.out.println("Элемент существует");
        } else {
            System.out.println("Элемент не существует");
        }
    }
}
