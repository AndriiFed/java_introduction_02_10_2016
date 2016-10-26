package loops;

public class LoopsExample {
    public static void main(String[] args) {
        int n = 10;

        //printNumbersWithWhile(n);

        printNumbersWithFor(n);
    }

    private static void printNumbersWithFor(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    private static void printNumbersWithWhile(int n) {
        int i = 0;
        while (i < n) {
            System.out.println(i);
            i++;
        }
    }

}
