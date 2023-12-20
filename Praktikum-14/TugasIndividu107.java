import java.util.Scanner;

public class TugasIndividu107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();
        
        // Menghitung total secara iteratif
        int totalIteratif = hitungTotalIteratif(N);
        
        // Menghitung total secara rekursif
        int totalRekursif = hitungTotalRekursif(N);
        
        // Menampilkan hasil
        System.out.println("Total secara iteratif: " + totalIteratif);
        System.out.println("Total secara rekursif: " + totalRekursif);
    }
    
    // Fungsi untuk menghitung total secara iteratif
    public static int hitungTotalIteratif(int N) {
        int total = 0;
        for (int i = 1; i <= N; i++) {
            total += i;
        }
        return total;
    }
    
    // Fungsi untuk menghitung total secara rekursif
    public static int hitungTotalRekursif(int N) {
        if (N == 1) {
            return 1;
        } else {
            return N + hitungTotalRekursif(N-1);
        }
    }
}