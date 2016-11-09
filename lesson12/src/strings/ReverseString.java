package strings;

public class ReverseString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";

        String str = str1.concat(str2);
        String strPlus = str1 + str2;

        System.out.println(str);
        System.out.println(strPlus);

        String reversedString = reverse(str);
        System.out.println(reversedString);
    }

    private static String reverse(String str) {
        String result = "";
        for (char ch : str.toCharArray()) {
            result = ch + result;
        }
        return result;
    }
}
