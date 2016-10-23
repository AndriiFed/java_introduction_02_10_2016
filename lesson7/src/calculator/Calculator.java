package calculator;

import java.util.Scanner;

public class Calculator {

    public static int getOperand() {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        return result;
    }

    public static String getOperation() {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.next();
        return result;
    }

    public static int calculate(String operation, int operand) {
        return 0;
    }

    public static int calculate(String operation, int opearand1, int operand2) {
        return 0;
    }
}
