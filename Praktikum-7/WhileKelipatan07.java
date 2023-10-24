import java.util.Scanner;

public class WhileKelipatan07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, jumlah = 0, counter = 0;
        double rataRata = 0;
        System.out.print("Masukan Bilangan Kelipatan (1-9) : ");
        kelipatan = scan.nextInt();
        
        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
                rataRata = (double) jumlah / counter;
            }
            i++;
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata-rata dari seluruh bilangan kelipatan %d adalah: %.2f\n ", kelipatan, rataRata);
    }
}