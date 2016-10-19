public class QuadraticEquationWithFunctions {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = -8;

        String result = calculateQuadraticEquation(a, b, c);

        System.out.println(result);
    }

    private static String calculateQuadraticEquation(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / 2 * a;
        double x2 = (-b - Math.sqrt(d)) / 2 * a;

        String roots = "x1 = " + x1 + "; x2 = " + x2;
        return roots;
    }
}
