package animals;

public class Zoo {
    public static void main(String[] args) {
        Cat c1 = new Cat("Barsik", 5);
        Cat c2 = new Cat("Murzik", 10);
        Dog d1 = new Dog("Rex", 3);
        Monkey m1 = new Monkey("Anfisa", 4);

        Animal[] animals = new Animal[4];
        animals[0] = c1;
        animals[1] = c2;
        animals[2] = d1;
        animals[3] = m1;

        for (int i = 0; i < animals.length; i++) {
            Animal a = animals[i];
            a.voice();
        }
    }
}
