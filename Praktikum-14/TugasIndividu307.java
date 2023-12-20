import java.util.Scanner;

public class TugasIndividu307 {
    public static void main(String[] args) {
        double saldoAwal;
        int tahun;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah saldo awal: ");
        saldoAwal = sc.nextDouble();
        
        System.out.print("Lamanya investasi (tahun): ");
        tahun = sc.nextInt();
        
        double saldoAkhir = hitungSaldoAkhir(saldoAwal, tahun);
        
        System.out.println("Jumlah saldo setelah " + tahun + " tahun: " + saldoAkhir);
    }
    
    static double hitungSaldoAkhir(double saldoAwal, int tahun) {
        if (tahun == 0) {
            return saldoAwal;
        } else {
            double keuntungan = 0.117 * saldoAwal;
            double saldoAkhir = saldoAwal + keuntungan;
            return hitungSaldoAkhir(saldoAkhir, tahun - 1);
        }
    }
}