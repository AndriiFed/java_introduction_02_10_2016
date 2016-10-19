public class PrimeNumbers {
    public static void main(String[] args) {

        int n = 20;
        int i = 4;

        while (i < n) {
            i++;
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int i) {
        int from = 2;
        int to = i - 1;

        while (from <= to) {
            int rem = i % from;
            if (rem == 0) {
                return false;
            }
            from++;
        }

        return true;
    }
}
