package arrays;

public class EvenIndexElements {
    public static void main(String[] args) {
        int[] array = {34, 12, 56, 12, 3, 45, 12, 67};

        System.out.print("На четных позициях: ");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println();

        System.out.print("Четные элементы: ");
        for (int elem : array) {
            if (elem % 2 == 0) {
                System.out.print(elem + ", ");
            }
        }

        System.out.println();

        System.out.print("Элементы наоборот: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }

        System.out.println();

        System.out.print("Элементы *2: ");
        for (int i = 1; i < array.length; i*=2) {
            System.out.print(array[i] + ", ");
        }
    }
}
