//subClass
public class DVD extends Product {
    private int length;
    private String rating;
    private String studio;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public DVD() {
        number = 10;
        nama = "Trap";
        quantity = 100;
        price = 20000.0;
        length = 5;
        rating = "PG";
        studio = "Warner Bros";
    }

    public DVD (String rating, int length, String studio) {
        this.rating = rating;
        this.length = length;
        this.studio = studio;
    }

    public DVD(int number, String nama,int quantity, double price, int length, String rating, String studio) {
        super(number, nama, quantity, price);
        this.length = length;
        this.rating = rating;
        this.studio = studio;
    }

    @Override
    public void print() {
        System.out.println("Rating: " + rating);
        System.out.println("Length: " + length);
        System.out.println("Studio: " + studio);
    }
}