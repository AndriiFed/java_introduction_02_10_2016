package animals;

public class Cat {
    String name;
    int age;
    String color;
    String sex;

    public void meow() {
        System.out.println("Meow... - " + name);
    }

    public boolean isBlackCat() {
        return color.equals("Black");
    }
}
