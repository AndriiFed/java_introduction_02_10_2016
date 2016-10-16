public class SumOfNumbers {
    public static void main(String[] args) {

        int n = 100;
        int sum = 0;
        int i = 0;

        while (i < n) {
            i++;
            sum += i; //sum = sum + i;
        }

        System.out.println(sum);
    }
}
