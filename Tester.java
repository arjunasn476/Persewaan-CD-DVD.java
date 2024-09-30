import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Mau Membuat Berapa Objek? ");
            int jumlah = in.nextInt();
            System.out.println("Jumlah: " + jumlah);
        } catch (Exception e) {
            System.out.println("Tipe Data Salah! ");
            return; // Keluar dari program jika terjadi kesalahan input
        }

        System.out.println("Pilih CD/DVD: ");
        String pilihan = in.next();

        if (pilihan.equals("CD")) {
            CD c = new CD(); // Pastikan CD memiliki konstruktor default
            c.print();
        } else if (pilihan.equals("DVD")) {
            DVD d = new DVD(); // Pastikan DVD memiliki konstruktor default
            d.print();
        } else {
            System.out.println("Error! Pilihan tidak valid.");
        }
    }
}
