package collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("monkey");
        animals.add("cat");
        animals.add("dog");
        animals.add("cat");

        animals.remove(2);

        for (int i = 0; i < animals.size(); i++) {
            System.out.print("Элемент " + i + ": ");
            System.out.println(animals.get(i));
        }
    }
}
