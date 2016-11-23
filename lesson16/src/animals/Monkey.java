package animals;

public class Monkey extends Animal {

    public Monkey(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice() {
        System.out.println("Hello World...");
    }
}
