import java.util.Scanner;
public class Gaji07 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;
        System.out.println("masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan jumlah Gaji ");
        gaji=input.nextInt();
        System.out.println("Masukkan jumlah Pot Gaji ");
        potGaji=input.nextInt();
        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);
    }
}