package flow;

public class ReturnExample {
    public static void main(String[] args) {
        int n = 100;
        int i = 0;
        while (i < n) {
            i++;
            if (isValidNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isValidNumber(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }
}
