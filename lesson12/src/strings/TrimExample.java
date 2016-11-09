package strings;

public class TrimExample {
    public static void main(String[] args) {
        String str = "   Hello World    ";
        String result = str.trim();

        System.out.println("'" + str + "'");
        System.out.println("'" + result + "'");

        result = result.toLowerCase();
        System.out.println(result);

        result = result.toUpperCase();
        System.out.println(result);
    }
}
