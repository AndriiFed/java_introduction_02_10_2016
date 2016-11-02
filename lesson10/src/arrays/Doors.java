package arrays;

public class Doors {
    public static void main(String[] args) {
        boolean[] doors = new boolean[100];

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j = j + 1 + i) {
                doors[j] = !doors[j];
            }
        }

        int opened = 0;
        for (int i = 0; i < 100; i++) {
            if (doors[i]) {
                opened++;
            }
        }
        System.out.println(opened);
    }
}
