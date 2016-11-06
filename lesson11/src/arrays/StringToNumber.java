package arrays;

public class StringToNumber {
    public static void main(String[] args) {
        String str = "35*10";

        //int indexOfOperation = getOperation(str);

        //charAt - получает символ по заданной позиции
        char operation = str.charAt(2);

        //substring - получает подстроку из строки
        String firstNumber = str.substring(0, 2);
        String secondNumber = str.substring(3, 5);

        //Integer.parseInt - переводит из строки в число
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int result = 0;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
        }

        System.out.println(result);
    }
}
