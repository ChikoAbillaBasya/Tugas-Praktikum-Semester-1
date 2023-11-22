import java.util.Scanner;

public class Kubus07 {
    public int sisi;
    public Kubus07(int sisi) {
        this.sisi = sisi;
    }
    public int hitungVolume() {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    public int hitungLuasPermukaan() {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Sisi: ");
        int sisi = input.nextInt();
        
        Kubus07 kubus = new Kubus07(sisi);
        int volume = kubus.hitungVolume();
        int luasPermukaan = kubus.hitungLuasPermukaan();

        System.out.println("Volume Kubus: " + volume);
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }
}