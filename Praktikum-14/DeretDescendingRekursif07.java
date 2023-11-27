import java.util.Scanner;

public class DeretDescendingRekursif07 {
    // Fungsi rekursif
    public static void deretDescRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescRekursif(n - 1);
        }
    }

    // Fungsi iteratif
    public static void deretDescIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt();

        System.out.println("Deret descending rekursif: ");
        deretDescRekursif(n);

        System.out.println("\nDeret descending iteratif: ");
        deretDescIteratif(n);
    }
}