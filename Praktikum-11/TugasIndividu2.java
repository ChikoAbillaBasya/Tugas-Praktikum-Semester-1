import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        // Membaca input tinggi segitiga
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = sc.nextInt();

        // Loop untuk mencetak baris-baris segitiga
        for (int i = 1; i <= tinggi; i++) {
            // Loop untuk mencetak spasi sebelum bintang
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            // Loop untuk mencetak bintang pada setiap baris
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
