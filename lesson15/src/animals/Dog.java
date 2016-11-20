package animals;

public class Dog extends Animal {

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("Bark Bark");
    }
}
