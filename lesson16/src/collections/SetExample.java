package collections;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> animals = new HashSet<>();
        animals.add("monkey");
        animals.add("cat");
        animals.add("dog");
        animals.add("cat");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
