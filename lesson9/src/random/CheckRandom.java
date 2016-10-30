package random;

import java.util.Random;

public class CheckRandom {
    public static void main(String[] args) {
        //диапазон от 0 до 19
        int n = 20;

        //количество вызовов функции random
        int numberOfCalls = 100;

        //создаем только один раз
        Random random = new Random();

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numberOfCalls; i++) {
            if (random.nextInt(n) % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Количество нечетных чисел: " + oddCount);
        System.out.println("Количество четных чисел: " + evenCount);
    }
}
