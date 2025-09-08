import java.util.Scanner;

public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner (System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input07.nextInt();

        int[] nilaiMhs= new int[jumlahMahasiswa];
        double total = 0;
        double rata2;
        int mahasiswaLulus = 0;
        double totalTdklulus = 0;
        double totallulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i + 1) +" : ");
            nilaiMhs[i] = input07.nextInt();  
            
            if (nilaiMhs[i] > 70) {
                totallulus +=nilaiMhs[i];
                mahasiswaLulus++;
            }else{
                totalTdklulus += nilaiMhs[i];
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = totallulus/mahasiswaLulus;
        System.out.println("Rata-rata nilai = "+ rata2);
        System.out.println("Rata rata nilai tidak lulus: " + totalTdklulus / (nilaiMhs.length - mahasiswaLulus));
    }
}