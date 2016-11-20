package animals;

public class Cat extends Animal {

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meow() {
        System.out.println("Meow");
    }
}
