package flow;

public class LoopFlow {
    public static void main(String[] args) {
        int n = 10;
        int i = 0;

        //итерация - один пробег цикла
        while (i < n) {

            i++;

            if (i == 5) {
                continue; // переход к следующей итерации цикла
            }

            if (i == 7) {
                break; // досрочный выход из цикла
            }

            System.out.println(i);

        }
    }
}
