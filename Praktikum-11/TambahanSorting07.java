import java.util.Arrays;

public class TambahanSorting07 {
    public static void main(String[] args) {
        String[][] PemainAtlit = {
                { "Agos", "Daffa", "Sukiman", "Jaki", "Udin" }, // Cabang Olahraga badminton
                { "Hafiz", "Aida", "Devan", "Marta", "Moheng" }, // Cabang OlahragatenisMeja
                { "Ahmad", "Amel", "Dayat", "Rafli", "Adit" }, // Cabang Olahraga basket
                { "Vika", "Andre", "Aro", "Erent", "Rara" } // Cabang Olahraga voli
        };

        String[] Cabangolahraga = { "Badminton", "Tenis Meja", "Basket", "Bola Voly" };

        for (int i = 0; i < PemainAtlit.length; i++) {
            Arrays.sort(PemainAtlit[i]); // mengurutkan arraynya
        }

        for (int i = 0; i < PemainAtlit.length; i++) { // perulangan untuk menampilkan cabornya
            System.out.println(Cabangolahraga[i] + ":");
            for (int j = 0; j < PemainAtlit[i].length; j++) { // perulangan untuk menampilkan nama setiap PemainAtlit yang ikut
                                                        // porseni
                System.out.println("Atlit " + Cabangolahraga[i] + " ke-" + (j + 1) + " adalah " + PemainAtlit[i][j]);
            }
            System.out.println();
        }
    }
}