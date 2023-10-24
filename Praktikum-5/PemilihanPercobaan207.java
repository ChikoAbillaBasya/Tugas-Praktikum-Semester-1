import java.util.Scanner;
public class PemilihanPercobaan207 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        System.out.println("Nilai uas   : ");
        float uas = input07.nextFloat();
        System.out.println("Nilai uts   : ");
        float uts = input07.nextFloat();
        System.out.println("nilai kuis  : ");
        float kuis = input07.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input07.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi", nilaiHuruf = " Null ", kualifikasi = " Null";
        System.out.println("Nilai akhir = " + total + " keterangan " + message);
        double nilaiSetara;

        if (total >80 && total <= 100) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = " Sangat Baik ";
            System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
            }
    
        else if (total >73 && total <= 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = " Lebih Dari Baik ";
            System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);        
            }
    
        else if (total >65 && total <= 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = " Baik ";
            System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
            }
        else if (total >60 && total <= 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = " Lebih dari Cukup ";
            System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
            }
        else if (total >50 && total <= 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = " Cukup ";
            System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
            }
        else if (total >39 && total <= 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = " Kurang ";
            System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
            }
        else if (total <= 39) {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = " Gagal ";
            System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
        }
    }
}
