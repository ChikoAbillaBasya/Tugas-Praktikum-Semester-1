import java.util.Scanner;
public class WhileGaji07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double totalGajiLembur =0;
        String jabatan;

        System.out.print("masukkan jumlah Karyawan: ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = scan.next();
            System.out.print("Masukan Jumlah Jam Lembur : ");
            jumlahJamLembur = scan.nextInt();
            i++;

            int gajiLembur=0;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan Tidak Valid");
                i--;
            }

            totalGajiLembur += gajiLembur;
        }
        System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
}
