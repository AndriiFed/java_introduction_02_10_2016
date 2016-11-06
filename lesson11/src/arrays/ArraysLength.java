package arrays;

public class ArraysLength {
    public static void main(String[] args) {
        int[][] array = {
                {3, 1, 2},
                {5, 12, 36, 81},
                {6, 9},
                {3, 8, 7}
        };

        /*
        int[] numbersArray = {25, 36, 8, 10};
        int numbersArrayLength = numbersArray.length;
        */

        int mainArrayLength = array.length;

        for (int i = 0; i < array.length; i++) {
            //int[] subArray = array[i];
            //array[i].length
            System.out.println("Длина " + i + "-го массива: " + array[i].length);
        }
    }
}
