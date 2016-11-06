package arrays;

public class MaxSymbol {
    public static void main(String[] args) {
        String str = "Hello World";

        char max = getMaxSymbol(str);

        System.out.println("Максимальный символ: " + max);
    }

    private static char getMaxSymbol(String str) {
        char max = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > max) {
                max = str.charAt(i);
            }
        }
        return max;
    }
}
