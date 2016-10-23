package flow;

public class PowerProblem {
    public static void main(String[] args) {
        int n = 100;

        int i = 0;

        while (i < n) {
            i++;

            if (isNumberValid(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isNumberValid(int i) {
        int current = 0;

        while (current <= i) {
            current++;

            double result = Math.pow(current, 3);

            if (result > i){
                break;
            }

            if (result == i) {
                return true;
            }
        }

        return false;
    }
}
