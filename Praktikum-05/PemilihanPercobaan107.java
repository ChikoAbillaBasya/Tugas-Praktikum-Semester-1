import java.net.SocketTimeoutException;
import java.util.Scanner;
public class PemilihanPercobaan107 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.println("Masukan angka:  ");
        int angka = input07.nextInt();
        String hasil = (angka %2 == 0) ? "Angka" +angka+ "Bilangan Genap" : "Angka" +angka+ "Bilangan Ganjil";
        System.out.println(hasil);
    }
}


