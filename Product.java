//superClass
public class Product{
    int number;
    String nama;
    int quantity;
    double price;

    public Product() {
        number = 0;
        nama = "Product 0";
        quantity = 0;
        price = 0;
    }

    public void print() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + nama);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    public Product (int number, String nama, int quantity, double price) {
        this.number = number;
        this.nama = nama;
        this.quantity = quantity;
        this.price = price;
    }
}