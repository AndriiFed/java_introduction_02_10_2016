import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        sum = sum + number % 10; //0 + 365 % 10 = 5
        sum = sum + number / 10 % 10; //5 + 365 / 10 % 10 = 11
        sum = sum + number / 100; //11 + 365 / 100 = 14
        System.out.println("Результат: " + sum);
    }
}
