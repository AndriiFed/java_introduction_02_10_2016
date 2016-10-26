package arrays;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {

        int[] x = getArray();

        //какие-то действия

        outputArray(x);

    }

    public static void outputArray(int[] x) {
        System.out.print("Результат: { ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            if (i != x.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print(" }");
    }

    public static int[] getArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите " + i + " элемент:");
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
