package collections;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("cat");
        tree.add("dog");
        tree.add("animal");
        tree.add("monkey");

        for (String str : tree) {
            System.out.println(str);
        }
    }
}
