import java.util.Scanner;
public class ifKondisi07 {
    public static void main(String[] args) {
        Scanner sc07 = new Scanner(System.in);

        System.out.println("Masukan Suhu :");
        int suhu = sc07.nextInt();

        if (suhu <16){
            System.out.println("Silahkan Menggunakan jaket");
        }
        if (suhu <20){
            System.out.println("Silahkan Menggunakan Baju Tebal");
        }
        else{
            System.out.println("Silahkan pakai Topi");
        }
    }
}
