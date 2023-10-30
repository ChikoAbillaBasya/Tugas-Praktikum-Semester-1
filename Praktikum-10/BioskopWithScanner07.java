import java.util.Scanner;
public class BioskopWithScanner07 {
    public static void main(String[] args) {
    Scanner input07 = new Scanner(System.in);
    String[][] penonton = new String[4][2];

    int baris, kolom;
    String nama, next; 
    
    while (true) {
        System.out.print("Masukkan nama: ");
        nama = input07.nextLine();
        System.out.print("Masukkan baris: ");
        baris = input07.nextInt();
        System.out.print("Masukkan kolom: ");
        kolom = input07.nextInt();
        input07.nextLine();

        penonton[baris-1][kolom-1] = nama;

        System.out.print("Input penonton lainnya? (y/n): ");
        next = input07.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;
        }
        }
    }
}
