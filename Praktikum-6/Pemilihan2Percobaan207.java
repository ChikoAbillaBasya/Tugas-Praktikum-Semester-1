import java.util.Scanner;
public class Pemilihan2Percobaan207 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        float sudut1, sudut2, sudut3 , totalSudut;

        System.out.print("Masukkan Sudut 1 : ");
        sudut1 = input17.nextFloat();
        System.out.print("Masukkan Sudut 2 : ");
        sudut2 = input17.nextFloat();
        System.out.print("Masukkan Sudut 3 : ");
        sudut3 = input17.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;

if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)){
                System.out.println("Segitiga Siku-Siku");    
        }else if (sudut1 == sudut2 && sudut2 == sudut3) { 
                System.out.println("Segitiga Sama Sisi");
        }else if (sudut1 == sudut2 || sudut1 == sudut3 || sudut2 == sudut3) {
                System.out.println("Segitiga Sama kaki");
        }else {
            System.out.println("Segitiga Sembarang");
        }
    }
}