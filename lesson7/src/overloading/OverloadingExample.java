package overloading;

public class OverloadingExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        sum(a);

        sum(a, b);

        long aLong = 5;
        long bLong = 10;

        sum(aLong, bLong);

        String str1 = "Hello ";
        String str2 = "World";

        sum(str1, str2);
    }

    private static void sum(int number) {
        number = number + 1;
        System.out.println(number);
    }

    private static void sum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    private static void sum(long a, long b) {
        long result = a + b;
        System.out.println(result);
    }

    private static void sum(String a, String b) {
        String result = a + b;
        System.out.println(result);
    }
}
