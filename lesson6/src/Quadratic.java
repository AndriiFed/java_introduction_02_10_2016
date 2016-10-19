public class Quadratic {

    public static String calculate(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / 2 * a;
        double x2 = (-b - Math.sqrt(d)) / 2 * a;

        String roots = "x1 = " + x1 + "; x2 = " + x2;
        return roots;
    }
}
