import java.util.Scanner;
public class CekPrimaRekursif07 {
    static int cekPrimaRekursif(int x, int y){
        if (y==1){
            return(1);
        } else if (x % y == 0){
            return(0);
        } else {
            return (0 + cekPrimaRekursif(x, y-1));
    }
}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=3; i++){
            System.out.print("Masukkan bilangan : ");
            int bil = sc.nextInt();
            if (cekPrimaRekursif(bil, bil-1)==1){
                System.out.println("Bilangan " + bil + " bilangan prima");
            } else {
                System.out.println("Bilangan " + bil + " bukan bilangan prima");
            }
        }
    }
}