import java.util.Scanner;

public class TugasIndividu1 {
    public static void main(String[] args) {
        // Membaca input tinggi segitiga
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = sc.nextInt();

        // Loop untuk mencetak baris-baris segitiga terbalik
        for (int i = tinggi; i >= 1; i--) {
            // Loop untuk mencetak bintang pada setiap baris
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
