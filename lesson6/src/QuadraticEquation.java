public class QuadraticEquation {
    public static void main(String[] args) {
        //ax^2 + bx + c = 0;
        //x^2 + 2x - 8 = 0;
        int a = 1;
        int b = 2;
        int c = -8;

        int d = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / 2 * a;
        double x2 = (-b - Math.sqrt(d)) / 2 * a;

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
