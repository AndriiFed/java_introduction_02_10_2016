package quadratic;

public class Quadratic {

    public static String calculate(int a, int b, int c) {
        int discriminant = calculateDiscriminant(a, b, c);
        double x1 = calculateFirstRoot(a, b, discriminant);
        double x2 = calculateSecondRoot(a, b, discriminant);

        return "x1: " + x1 + "; x2: " + x2;
    }

    private static double calculateSecondRoot(int a, int b, int discriminant) {
        return (-b - Math.sqrt(discriminant)) / 2 * a;
    }

    private static double calculateFirstRoot(int a, int b, int discriminant) {
        return (-b + Math.sqrt(discriminant)) / 2 * a;
    }

    private static int calculateDiscriminant(int a, int b, int c) {
        int result = b * b - 4 * a * c;
        return result;
    }
}
