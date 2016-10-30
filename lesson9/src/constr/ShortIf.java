package constr;

//Найти большее из 2х чисел
public class ShortIf {
    public static void main(String[] args) {
        int a = 8;
        int b = 12;

        int result;

        /*
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        */

        result = a > b ? a : b;

        System.out.println(result);
    }

    private static int abs(int a) {
        int result = a > 0 ? a : -a;
        return result;
    }
}
