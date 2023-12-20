import java.util.Scanner;

public class Percobaan607 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("Masukkan Panjang");
        p=input.nextInt();
        System.out.println("Masukkan lebar");
        l=input.nextInt();
        System.out.println("Masukkan tinggi");
        t=input.nextInt();

        L=p*l;
        System.out.println("Luas Persegi Panjang Adalah "+L);

        vol=p*l*t;
        System.out.println("Volume balok adalah "+vol);

        if (vol > 300) {
            System.out.println("Balok besar");
        } else {
            System.out.println("Balok kecil");
        }
    } // Fungsi Hitung Luas
    static int hitungluas (int pjg, int lb) {
        int Luas=pjg*lb;
        return Luas;
    } // Fungsi Hitung Volume
    static int hitungvolume (int tinggi, int a, int b) {
        int Volume= hitungluas(a,b)*tinggi;
        return Volume;
    }
}