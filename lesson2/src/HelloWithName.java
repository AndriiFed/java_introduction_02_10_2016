import java.util.Scanner;

public class HelloWithName {
    public static void main(String[] args) {

        //вывод запроса имени
        System.out.print("Введите имя: ");

        //ввод информации в переменную "name"
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        //вывод информации
        System.out.println("Hello, " + name);
    }
}
