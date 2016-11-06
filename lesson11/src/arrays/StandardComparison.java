package arrays;

public class StandardComparison {
    public static void main(String[] args) {
        char digit = '5';

        //Character.isDigit - проверяет является ли символ цифрой
        if (Character.isDigit(digit)) {
            //int number = digit; здесь мы получаем код символа
            int number = Character.getNumericValue(digit);
            System.out.println("Символ является цифрой: " + number);
        }

        //Character.isAlphabetic - проверяет является ли символ буквой
        if (Character.isAlphabetic(digit)) {
            System.out.println("Символ является буквой");
        }
    }
}
