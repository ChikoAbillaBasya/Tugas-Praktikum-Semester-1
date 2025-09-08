import java.util.Scanner;

public class LinearSearch07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner (System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int elemen = input07.nextInt();

        int[] arrayInt = new int [elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + " : ");
            arrayInt[i] = input07.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : " );
        int key = input07.nextInt();

        int hasil = 0;

        for (int i=0; i<elemen; i++)
        {
            if (arrayInt[i]==key)
            {
                hasil=i;
                break;
            }
        }

        if (hasil != 0) {
        System.out.println("key ada dalam array pada posisi indeks ke-" + hasil);
        } else {
            System.out.println("key tidak ditemukan didalam array");
        }
    }
}