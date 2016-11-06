package arrays;

public class StringExample {
    public static void main(String[] args) {
        String str = "Hello World\n";

        /*
        char symbol = str.charAt(4);
        System.out.println("Символ: " + symbol);
        System.out.println("Код: " + (int)symbol);
        */

        outputStringInformation(str);
    }

    private static void outputStringInformation(String str) {
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            int code = (int) symbol;

            System.out.println(symbol + " - " + code);
        }
    }
}
