package strings;

public class ConvertWords {
    public static void main(String[] args) {
        String str = "internationalization";
        int cnt = str.length() - 2;
        String internal = str.substring(1, str.length() - 1);
        String result = str.replace(internal, String.valueOf(cnt));
        System.out.println(result);
    }
}
