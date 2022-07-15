package Nalog1;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Samsung",500,5);
        Product product1 = new Product("Samsung",500,5);
        Product product2 = new Product("Samsung",500,5);
        Sell sell = new Sell();
        sell.buy(product);
        sell.buy(product1);
        sell.buy(product2);
        sell.print();
        sell.sellOut(product,2);
        sell.print();
    }
}
