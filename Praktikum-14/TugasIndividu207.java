public class TugasIndividu207 {
    public static void main(String[] args) {
        int n = 12; // Jumlah angka Fibonacci yang ingin dihitung
        int a = 1;
        int b = 1;
        
        System.out.print(a + ", " + b);
        
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}