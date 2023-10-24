import java.util.Scanner;
public class HargaBayar07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, jmlHalaman;
        double dis, total, bayar, jmlDis;
        String merkBuku;
        
        System.out.println("Masukan Merk Buku ");
        merkBuku = input.nextLine();
        System.out.println("Masukan Jumlah halaman ");
        jmlHalaman = input.nextInt();
        System.out.println("Masukan Harga");
        harga = input.nextInt();
        System.out.println("Jumlah Barang Yang DiBeli");
        jumlah = input.nextInt();
        System.out.println("Masukan Diskon");
        dis = input.nextDouble();

        total = harga*jumlah;
        jmlDis = total*dis;
        bayar = total - jmlDis;
        System.out.println("DISKON yang Didapat " + jmlDis);
        System.out.println("Jumlah yang Di Bayar " + bayar);
    }
    
}