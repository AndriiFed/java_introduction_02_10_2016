import java.util.Scanner;

public class NotJack {
    public static void main(String[] args) {

        //Приветствовать всех кроме Jack
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        if (!name.equals("Jack")) {
            System.out.println("Hello, " + name);
        } else {
            System.out.println("Hello World");
        }
    }
}
