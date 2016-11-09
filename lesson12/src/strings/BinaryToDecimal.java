package strings;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1011011010111";

        int index = (int) Math.pow(2, binary.length() - 1);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                sum = sum + index;
            }
            index = index / 2;
        }

        System.out.println(sum);
    }
}
