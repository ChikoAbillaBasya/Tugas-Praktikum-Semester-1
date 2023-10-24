import java.util.Scanner;
public class ArrayNilai07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);
        int[] nilaiAkhir = new int [10];
        for (int i = 0; i < nilaiAkhir.length; i++){
            System.out.print("Masukan Nilai Akhir ke-" + i + " : ");
            nilaiAkhir[i] =  input07.nextInt();
        }

        for (int i = 0; i <nilaiAkhir.length; i++){
            if (nilaiAkhir[i] > 70){
            System.out.println("Mahasiswa ke-" + i + "Lulus");
        }else {
            System.out.println("Mahasiswa ke-" + i + "Tidak lulus");
        }
        }
    }
}