public class MultiplesOfFive {
    public static void main(String[] args) {

        int n = 100;
        int i = 0;

        while (i < n) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }

            i++;
        }
    }
}
