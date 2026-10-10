
class Product {
    int id;
    String name;
    double price;
    static double discountRate = 10;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void calculateFinalPrice() {
        double discount = price * discountRate / 100;
        double finalPrice = price - discount;

        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Original Price: Rs. " + price);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Price: Rs. " + finalPrice);
    }
}

public class question19 {
    public static void main(String[] args) {
        int productId = 101;
        String productName = "Keyboard";
        double productPrice = 1000;

        Product p = new Product(productId, productName, productPrice);
        p.calculateFinalPrice();
    }
}
