package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, String> morze = new HashMap<>();
        morze.put("A", ".-");
        morze.put("B", "--.");
        morze.put("C", "..-");

        //Set set = morze.keySet();

        String value = morze.get("B");

        System.out.println(value);
    }
}
