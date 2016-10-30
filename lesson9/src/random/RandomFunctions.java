package random;

import java.util.Random;

public class RandomFunctions {
    public static void main(String[] args) {
        int n = 20;

        //Случайное число от 0 до n - 1
        int result = fromZeroToN(n);

        //Случайное число от 5 до n
        result = fromFiveToN(n);

        //Случайное число от 0 до n (только четные)
        result = onlyEvenNumbers(n);
    }

    private static int onlyEvenNumbers(int n) {
        Random random = new Random();
        int number = random.nextInt(n / 2) * 2;
        return number;
    }

    private static int fromFiveToN(int n) {
        Random random = new Random();
        int number = random.nextInt(n - 5) + 6;
        return number;
    }

    private static int fromZeroToN(int n) {
        Random random = new Random();
        int number = random.nextInt(n);
        return number;
    }
}
