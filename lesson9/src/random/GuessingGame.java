package random;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Число от 0 до 100 (загадывает компьютер)
        Random random = new Random();
        int number = random.nextInt(101);

        int currentGuess;

        do {
            System.out.print("Введите свою догадку: ");
            currentGuess = scanner.nextInt();

            if (currentGuess == number) {
                System.out.println("Вы угадали число. Это и есть " + currentGuess);
                break;
            }

            if (currentGuess > number) {
                System.out.println("Ваше число " + currentGuess + " больше загаданного");
            } else {
                System.out.println("Ваше число " + currentGuess + " меньше загаданного");
            }
        } while (currentGuess != number);
    }
}
