import java.util.Scanner;
public class Tugasmandiri07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        String nama, jenisKelamin;
        int jumlahMahasiswa =30;

        int i = 1;

        for (i = 1; i <= jumlahMahasiswa ; i++) {
            System.out.print("Masukan Nama : ");
            nama = input07.nextLine();
            System.out.print("Masukan Jenis Kelamin (L/P :)");
            jenisKelamin = input07.nextLine();

            if (jenisKelamin.equalsIgnoreCase("P")){
                System.out.println("Nama " + nama);
            }

        }
    }
}
