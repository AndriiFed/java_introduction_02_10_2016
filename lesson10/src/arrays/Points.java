package arrays;

import java.util.Random;

public class Points {
    public static void main(String[] args) {

        Random rnd = new Random();
        int r = 10;

        int inCircle = 0;

        for (int i = 0; i < 10000; i++) {
            double x =  rnd.nextInt(r*2 + 1) - r;
            double y =  rnd.nextInt(r*2 + 1) - r;

            if (x * x + y * y <= r * r) {
                inCircle++;
            }
        }

        double result = (r * 2 * r * 2) * inCircle / 10000;
        double original = 3.14 * r * r;
        System.out.println(result);
        System.out.println(original);
    }
}
