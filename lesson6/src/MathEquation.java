public class MathEquation {
    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 1;

        double result = (Math.abs(a - b)) /
                Math.pow(c, 5) +
                Math.pow((Math.cos(c) + Math.log(a)), 8);

        System.out.println(result);
    }
}
