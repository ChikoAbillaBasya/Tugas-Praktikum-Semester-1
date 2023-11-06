import java.util.Scanner;

public class NestedLoop07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double[3][5];
        double[] rataRata = new double[3];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            double total = 0;
            for (double temp : temps[i]) {
                total += temp;
                System.out.print(temp + " ");
            }
            rataRata[i] = total / temps[i].length;
            System.out.println();
        }

        System.out.println("Rata-rata suhu masing-masing kota:");
        for (int i = 0; i < rataRata.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ": " + rataRata[i]);
        }
    }
}