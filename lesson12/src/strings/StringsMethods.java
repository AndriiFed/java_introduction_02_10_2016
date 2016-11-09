package strings;

public class StringsMethods {
    public static void main(String[] args) {
        String str = "Hello World";

        int index = str.indexOf('o');
        int lastIndex = str.lastIndexOf('o');

        System.out.println(index);
        System.out.println(lastIndex);
    }
}
