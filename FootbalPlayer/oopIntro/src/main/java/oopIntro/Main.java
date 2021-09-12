package oopIntro;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1,"Lenovo V14",1500,"16 GB Ram",10);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("HP Pavillion");
        product2.setDetail("32 GB Ram");
        product2.setDiscount(10);
        product2.setUnitPrice(1600);

//1:14:00 da qalmisuqs
        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
    }
}
