package shopping;

public class Product {

    private String name;
    private int price;

    public Product() {
        name = "Неизвестный товар";
        price = -1;
    }

    public Product(String newName, int newPrice) {
        name = newName;
        price = newPrice;
    }

    public String getName() {
        return name;
    }
}
