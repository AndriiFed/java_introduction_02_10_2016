package arrays;

public class SumOfNumbers {
    public static void main(String[] args) {
        String number = "34312";

        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int code = number.charAt(i);
            //Character.getNumericValue - переводит символ в цифру
            sum = sum + Character.getNumericValue(code);
        }

        System.out.println("Сумма цифр: " + sum);
    }
}
