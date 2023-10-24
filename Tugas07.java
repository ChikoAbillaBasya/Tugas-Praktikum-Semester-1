import java.util.Scanner;

public class Tugas07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner (System.in);
        
        //Input jumlah elemen
        System.out.print("Masukkan banyaknya elemen : ");
        int elemen = input07.nextInt();

        //Input 
        int[] nilaiElemen = new int[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + " : ");
            nilaiElemen[i] = input07.nextInt();
        }

        //Menghitung nilai tertinggi, terendah dan rata rata
        int nilaiTertinggi = nilaiElemen[0];
        int nilaiTerendah = nilaiElemen[0];
        int totalNiali = 0;

        for (int i = 0; i < elemen; i++) {
            if (nilaiElemen[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiElemen[0];
            }
            if (nilaiElemen[i] < nilaiTerendah) {
                nilaiTerendah = nilaiElemen[i];
            }
            totalNiali += nilaiElemen[i];
        }
        double nilaiRatarata = (double) totalNiali / elemen;

        //output
        System.out.println("Nilai tertinggi : " + nilaiTertinggi);
        System.out.println("Nilai terendah : " + nilaiTerendah);
        System.out.println("Nilai rata rata : " + nilaiRatarata);
    }
}