import java.util.Scanner;
public class Suhu07 {
    public static void main(String[] args) {
        Scanner input07 = new Scanner(System.in);

        int suhu;
        char hujan;

        System.out.print("Masukan Suhu : ");
        suhu = input07.nextInt();
        System.out.print("Apakah Hujan : ( ya atau tidak) ");
        hujan = input07.next().charAt(0);
        if(suhu > 27) {
            System.out.println("Memakai Dress"); {
                if(hujan == 'y'|| hujan == 'Y') {
                    System.out.println("Membawa Payung");
                } else {
                    System.out.println("Memakai Sunscreen");
                }
            }
        } else {
            System.out.println("Memakai Celana Panjang");
        }
    }
    
}