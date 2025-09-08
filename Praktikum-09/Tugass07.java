import java.util.Arrays;
import java.util.Scanner;

public class Tugass07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Elemen: ");
        int jumlahElemen = input07.nextInt();

        int[] nilai = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + " : ");
            nilai[i] = input07.nextInt();
        }

        Arrays.sort(nilai);

        int nilaitertinggi = nilai[jumlahElemen - 1];
        int nilaiterendah = nilai[0];
        double total = 0;

        for (int i = 0; i < jumlahElemen; i++) {
            total += nilai[i];
        }

        double rataRata = total / jumlahElemen;

        System.out.println("Nilai tertinggi: " + nilaitertinggi);
        System.out.println("Nilai terendah: " + nilaiterendah);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}