import java.util.Scanner;

public class NilaiMahasiswa07 {
    static  int JUMLAH_MAHASISWA = 5;
    static  int JUMLAH_MINGGU = 7;
    static int[][] nilaiMahasiswa = new int[JUMLAH_MAHASISWA][JUMLAH_MINGGU];
    static String[] namaMahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

    public static void inputDataNilai() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + " (minggu ke-1 sampai ke-7):");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print("Minggu ke-" + (j + 1) + ": ");
                nilaiMahasiswa[i][j] = scanner.nextInt();
            }
        }
    }
    public static void tampilkanNilaiMahasiswa() {
        System.out.println("Nilai Mahasiswa:");
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            System.out.print(namaMahasiswa[i] + ": ");
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                System.out.print(nilaiMahasiswa[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int hariDenganNilaiTertinggi() {
        int[] totalNilaiHarian = new int[JUMLAH_MINGGU];
        for (int j = 0; j < JUMLAH_MINGGU; j++) {
            int total = 0;
            for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
                total += nilaiMahasiswa[i][j];
            }
            totalNilaiHarian[j] = total;
        }
        int hariTertinggi = 0;
        int nilaiTertinggi = totalNilaiHarian[0];
        for (int j = 1; j < JUMLAH_MINGGU; j++) {
            if (totalNilaiHarian[j] > nilaiTertinggi) {
                nilaiTertinggi = totalNilaiHarian[j];
                hariTertinggi = j;
            }
        }
        return hariTertinggi + 1; // Karena indeks dimulai dari 0
    }
    public static void tampilkanMahasiswaNilaiTertinggi() {
        int hariTertinggi = hariDenganNilaiTertinggi();
        int nilaiTertinggi = 0;
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            int totalNilai = 0;
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                totalNilai += nilaiMahasiswa[i][j];
            }
            if (totalNilai > nilaiTertinggi) {
                nilaiTertinggi = totalNilai;
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi:");
        for (int i = 0; i < JUMLAH_MAHASISWA; i++) {
            int totalNilai = 0;
            for (int j = 0; j < JUMLAH_MINGGU; j++) {
                totalNilai += nilaiMahasiswa[i][j];
            }
            if (totalNilai == nilaiTertinggi) {
                System.out.println(namaMahasiswa[i] + " (Total Nilai: " + nilaiTertinggi + ")");
                System.out.println("Detail Nilai:");
                for (int j = 0; j < JUMLAH_MINGGU; j++) {
                    System.out.println("Minggu ke-" + (j + 1) + ": " + nilaiMahasiswa[i][j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        inputDataNilai();
        tampilkanNilaiMahasiswa();

        int hariTertinggi = hariDenganNilaiTertinggi();
        System.out.println("Hari dengan nilai tertinggi dari keseluruhan mahasiswa adalah: Minggu ke-" + hariTertinggi);

        tampilkanMahasiswaNilaiTertinggi();
    }
}