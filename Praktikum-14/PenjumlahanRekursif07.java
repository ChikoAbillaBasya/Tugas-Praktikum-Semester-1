import java.util.Scanner;

public class PenjumlahanRekursif07 {
    static int penjumlahanRekursif(int f){
        if (f==1){
         return(f);
        }else {
        return (f + penjumlahanRekursif(f - 1));
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int angka, total;
    System.out.print("Masukkan angka : ");
    angka = sc.nextInt();
    for (int i = 1; i<=angka; i++){
        System.out.print(i + " + ");
    }
    total = penjumlahanRekursif(angka);
    System.out.print("= " + total);
    }
}