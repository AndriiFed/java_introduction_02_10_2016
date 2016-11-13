package animals;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Barsik";
        cat1.age = 5;
        cat1.color = "Black";
        cat1.sex = "male";

        Cat cat2 = new Cat();
        cat2.name = "Murka";
        cat2.age = 3;
        cat2.color = "White";
        cat2.sex = "female";

        //System.out.println(murka.name);
        cat1.meow();
        cat2.meow();

        if (cat1.isBlackCat()) {
            System.out.println(cat1.name + " черный");
        } else {
            System.out.println(cat1.name + " другой");
        }

        if (cat2.isBlackCat()) {
            System.out.println(cat2.name + " черный");
        } else {
            System.out.println(cat2.name + " другой");
        }
    }
}
