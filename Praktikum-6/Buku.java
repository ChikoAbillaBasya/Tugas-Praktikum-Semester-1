import java.util.Scanner;

public class Buku {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        double diskon = 0;
        int jumlah_buku, harga_buku, bayar, jumlah_diskon;
        String jenis_buku;

        System.out.print("Masukkan jenis buku : ");
        jenis_buku = input10.nextLine();
        System.out.print("Masukkan harga buku : ");
        harga_buku = input10.nextInt();
        System.out.print("Masukkan jumlah_buku : ");
        jumlah_buku = input10.nextInt();

        if (jenis_buku.equalsIgnoreCase("kamus")) {
            if (jumlah_buku > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.1;
            }
        } else if (jenis_buku.equalsIgnoreCase("novel")) {
            if (jumlah_buku > 3) {
                diskon = 0.09;
            } else {
                diskon = 0.08;
            }
        } else {
            if (jumlah_buku > 3) {
                diskon = 0.05;
            } else {
                diskon = 0;
            }
        }

        jumlah_diskon = (int) (diskon * jumlah_buku * harga_buku);
        bayar = (int) ((harga_buku * jumlah_buku) - jumlah_diskon);

        System.out.println("Anda mendapat diskon : " + jumlah_diskon);
        System.out.println("Anda harus membayar : " + bayar);
    }
}