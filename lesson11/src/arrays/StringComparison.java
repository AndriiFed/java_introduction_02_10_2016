package arrays;

public class StringComparison {
    public static void main(String[] args) {

        char digit = '6';
        if (digit >= '0' && digit <= '9') {
            System.out.println("Символ является цифрой");
        } else if (isLetter(digit)) {
            System.out.println("Символ является буквой");
        }
    }

    private static boolean isLetter(char digit) {
        return isBigLetter(digit) || isSmallLetter(digit);
    }

    private static boolean isBigLetter(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    private static boolean isSmallLetter(char ch) {
        return ch >= 'a' && ch <= 'z';
    }
}
