public class StringEquality {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;

        if (a == b) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }

        String str1 = "Hello";
        String str2 = "Hello";

        if (str1.equals(str2)) {
            System.out.println("Строки равны");
        } else {
            System.out.println("Строки не равны");
        }
    }
}
