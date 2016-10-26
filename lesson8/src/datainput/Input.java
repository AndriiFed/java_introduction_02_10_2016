package datainput;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        String op = getOperation();
    }

    public static String getOperation() {
        Scanner scanner = new Scanner(System.in);

        String operation;

        do {
            System.out.println("Введите операцию:");
            operation = scanner.next();
        } while (!correctResult(operation));

        return operation;
    }

    private static boolean correctResult(String operation) {
        return operation.equals("+") ||
                operation.equals("корень") ||
                operation.equals("шкалаБофорта");
    }

}
