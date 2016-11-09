package strings;

public class ReplaceExample {
    public static void main(String[] args) {
        String str = "H!el!lo Wor!ld";

        String str1 = str.replace("!", "*");
        String str2 = str.replace("!", "");

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
    }
}
