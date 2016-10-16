public class Factorial {

    //5! = 5 * 4 * 3 * 2 * 1
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;

        int current = n;
        while (current > 0) {
            factorial = factorial * current;
            current = current - 1; // n--
        }

        System.out.println("Факториал числа " + n + " равен " + factorial);
    }
}
