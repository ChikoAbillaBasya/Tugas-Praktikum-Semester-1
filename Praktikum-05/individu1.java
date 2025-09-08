import java.util.Scanner; 
public class individu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String meleeWeapon;
        String rangeWeapon;
        int jarak;

        System.out.print("Masukkan Jarak: ");
        jarak = input.nextInt();

        if (jarak <=5) {
            System.out.println("meleeWeapon");
        } else {
            System.out.println("rangeWeapon");
        }
    }
    
}