package shopping;

public class Shop {
    public static void main(String[] args) {

        Product product1 = new Product();
        Product product2 = new Product("Телевизор", 100);
        Product product3 = new Product("Утюг", 20);

        Cart cart1 = new Cart();

        cart1.addProduct(product1);
        cart1.addProduct(product2);
        cart1.addProduct(product3);

        System.out.println("Перед очисткой: ");
        cart1.showAll();

        cart1.clearAll();

        System.out.println("После очистки: ");
        cart1.showAll();

    }
}
