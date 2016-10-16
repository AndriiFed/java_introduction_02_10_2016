public class DigitsOfNumber {
    public static void main(String[] args) {

        int n = 25467;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            //System.out.println(digit);

            sum = sum + digit; //sum += digit;
        }

        System.out.println("Сумма чисел: " + sum);

    }
}
