package Nalog;

public class Product implements  MyInterface {
    protected String NameProduct;
    protected int price;
    protected int count;

    public Product() {

    }



    public Product(String n, int p, int c) {
        NameProduct = n;
        price = p;
        count = c;
    }

    @Override
    public String toString() {
        return "Համակարգիչ։։ " +
                "Տեսակը։ " + NameProduct + " " +
                " Գինը։ " + price +
                " Քանակը։ " + count ;
    }
}
