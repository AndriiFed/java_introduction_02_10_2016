package arrays;

//Есть ли введенное число в массиве
public class FindNumber {
    public static void main(String[] args) {
        int number = 34; //число, которое нужно найти

        int[] array = InputArray.getArray();

        boolean exists = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("Такое число есть в массиве");
        } else {
            System.out.println("Такого числа нет");
        }
    }
}
