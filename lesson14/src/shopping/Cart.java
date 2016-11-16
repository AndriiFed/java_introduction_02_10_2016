package shopping;

public class Cart {

    private Product[] products;
    private int count; //текущее количество товаров

    public Cart() {
        count = 0;
        products = new Product[10];
    }

    public void addProduct(Product product) {
        products[count] = product;
        count++;
    }

    public void removeProduct() {
        count--;
        products[count] = null;
    }

    public void clearAll() {
        for (int i = 0; i < count; i++) {
            products[i] = null;
        }
        count = 0;
    }

    public void showAll() {
        for (int i = 0; i < count; i++) {
            Product product = products[i];
            System.out.println("Название: " +
                    product.getName());
        }
    }
}
