import java.util.Scanner;

public class TugasIndividu {
    public static void main(String[] args) {
        // Membaca input tinggi piramida
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tinggi piramida: ");
        int tinggi = sc.nextInt();

        // Loop untuk mencetak baris-baris piramida
        for (int i = 1; i <= tinggi; i++) {
            // Loop untuk mencetak spasi sebelum angka pada setiap baris
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            // Loop untuk mencetak angka pada setiap baris
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}