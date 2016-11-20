package animals;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal("Unknown", -1);

        Cat cat = new Cat("Barsik", 5);
        Dog dog = new Dog("Tobby", 3);

        cat.eat();
        dog.eat();

        cat.meow();
        dog.bark();
    }
}
