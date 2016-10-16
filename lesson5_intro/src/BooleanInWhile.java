public class BooleanInWhile {

    public static void main(String[] args) {

        int n = 100;
        int m = 50;

        int i = 0;
        int j = 0;

        while (i < n || j < m) {
            System.out.println(i + " " + j);
            i = i + 3;
            j = j + 1;
        }
    }
}
