public class ThreeConditions {
    public static void main(String[] args) {

        int x = 12;
        int result;

        if (x < 5) {
            result = x + 5;
        } else {
            if (x > 5) {
                result = x * x;
            } else {
                result = x - 7;
            }
        }

        System.out.println("Результат: " + result);
    }
}
