public class ProgramKu {
    public static void TampilHinggakei(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
    }
    public static int Jumlah (int bill1, int bill2) {
        return (bill1 + bill2);
    }
    public static void TampilJumlah (int bill1, int bill2) {
        TampilHinggakei(Jumlah(bill1, bill2));
    }
    public static void main (String[] args) {
        int temp = Jumlah(1, 1);
        TampilJumlah(temp, 5);
    }
}