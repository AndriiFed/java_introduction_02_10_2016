package builder;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            builder.append("Число " + i + "\n");
        }

        builder.reverse();
        String result = builder.toString();

        System.out.println(result);
    }
}
