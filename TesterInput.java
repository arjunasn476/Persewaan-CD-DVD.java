import java.util.Scanner;

public class TesterInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama = in.nextLine();
        String artist = in.nextLine();
        String label = in.nextLine();
        int number = in.nextInt();
        int quantity = in.nextInt();
        int totalSong = in.nextInt();
        double price = in.nextDouble();
        CD cd1 = new CD(number, nama, quantity, price, artist, totalSong, label);
        cd1.print();

    }
}
