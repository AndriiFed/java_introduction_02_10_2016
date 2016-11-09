package strings;

public class SplitExample {
    public static void main(String[] args) {
        String text = "first second third forth";
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
