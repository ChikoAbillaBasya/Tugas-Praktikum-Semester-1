import java.util.ArrayList;
import java.util.Scanner;

public class App {

    private static int authenticateUser(ArrayList<String> usernames, ArrayList<String> passwords, Scanner input) {
        System.out.print("Masukkan Username: ");
        String usernameInput = input.nextLine();
        System.out.print("Masukkan Password: ");
        String passwordInput = input.nextLine();

        if (usernames.contains(usernameInput) && passwords.get(usernames.indexOf(usernameInput)).equals(passwordInput)) {
            System.out.println("Selamat datang, " + usernameInput + "!");
            return usernames.indexOf(usernameInput);
        } else {
            System.out.println("Username atau password salah. Silakan coba lagi.");
            return -1;
        }
    }

    private static void registerUser(ArrayList<String> usernames, ArrayList<String> passwords, Scanner input) {
        System.out.print("Masukkan Username baru: ");
        String newUsername = input.nextLine();

        if (!usernames.contains(newUsername)) {
            System.out.print("Masukkan Password baru: ");
            String newPassword = input.nextLine();

            usernames.add(newUsername);
            passwords.add(newPassword);

            System.out.println("Akun berhasil dibuat! Silakan login.");
        } else {
            System.out.println("Username sudah digunakan. Silakan pilih username lain.");
        }
    }


    private static void makeBooking(int[] stockRooms, String[][] bookings, int userIndex, Scanner input) {
        int hargapermalam = 0, jmlmalam, biayatambahan, totalbiaya;

        // Stylized banner for selecting room type
        System.out.println("\n===============================================");
        System.out.println("|           Pilihan Tipe Kamar                 |");
        System.out.println("===============================================");
        System.out.println("  1 : Studio (Rp.100000)");
        System.out.println("      -------------------------------");
        System.out.println("      Spesifikasi: Single bed, TV, AC");
        System.out.println("      Fasilitas   : Free Wi-Fi, Toiletries");
        System.out.println("  2 : Duplex (Rp.150000)");
        System.out.println("      -------------------------------");
        System.out.println("      Spesifikasi: Double bed, TV, AC, Mini Kitchen");
        System.out.println("      Fasilitas   : Free Wi-Fi, Toiletries, Room Service");
        System.out.println("  3 : Triplex (Rp.200000)");
        System.out.println("      -------------------------------");
        System.out.println("      Spesifikasi: Queen bed, TV, AC, Kitchen, Jacuzzi");
        System.out.println("      Fasilitas   : Free Wi-Fi, Toiletries, Room Service, Spa Access");
        System.out.println("===============================================");
        System.out.print("Masukkan tipe kamar yang diinginkan: ");
        int tipekamar = input.nextInt();

        if (tipekamar >= 1 && tipekamar <= stockRooms.length && stockRooms[tipekamar - 1] > 0) {
            // There is available stock, proceed with booking
            stockRooms[tipekamar - 1]--; // Decrease the available room count
        } else {
            System.out.println("Maaf, kamar tipe ini sudah habis atau tipe kamar tidak valid.");
            return;
        }

        // Stylized banner for entering the number of nights
        System.out.println("\n===============================================");
        System.out.println("|        Masukkan Jumlah Malam                |");
        System.out.println("===============================================");
        System.out.print("Masukkan jumlah malam yang diinginkan: ");
        while (true) {
            if (input.hasNextInt()) {
                jmlmalam = input.nextInt();
                if (jmlmalam > 0) {
                    break; // Exit the loop if the input is valid
                } else {
                    System.out.println("Jumlah malam harus lebih dari 0. Silakan coba lagi.");
                }
            } else {
                System.out.print("Masukkan angka yang valid: ");
                input.next(); // Discard the invalid token from the input
            }
        }

        // Calculate total cost based on room type
        switch (tipekamar) {
            case 1:
                bookings[userIndex][0] = "Kamar Tipe Studio";
                hargapermalam = 100000;
                break;
            case 2:
                bookings[userIndex][0] = "Kamar Tipe Duplex";
                hargapermalam = 150000;
                break;
            case 3:
                bookings[userIndex][0] = "Kamar Tipe Triplex";
                hargapermalam = 200000;
                break;
            default:
                System.out.println("Tipe kamar tidak valid.");
                return;
        }

        bookings[userIndex][1] = "Jumlah Malam: " + jmlmalam;

        totalbiaya = jmlmalam * hargapermalam;
        boolean tambahanLain = true;

        // Stylized banner for additional facilities
        while (tambahanLain) {
            System.out.println("\n===============================================");
            System.out.println("|   Pilihan Tambahan Fasilitas               |");
            System.out.println("===============================================");
            System.out.println("1 : Laundry (Rp.20,000 per malam)");
            System.out.println("2 : Sarapan (Rp.25,000 per malam)");
            System.out.println("3 : Selesai");

            System.out.print("Pilih tambahan fasilitas (1/2/3): ");
            int tambahan = input.nextInt();

            if (tambahan == 1) {
                biayatambahan = 20000 * jmlmalam; // Laundry cost
                totalbiaya += biayatambahan;
                bookings[userIndex][2] = "Biaya laundry: Rp." + biayatambahan;
            } else if (tambahan == 2) {
                biayatambahan = 25000 * jmlmalam; // Breakfast cost
                totalbiaya += biayatambahan;
                bookings[userIndex][2] = "Biaya sarapan: Rp." + biayatambahan;
            } else if (tambahan == 3) {
                tambahanLain = false; // Exit the loop if the user chooses to finish
            } else {
                System.out.println("Tambahan fasilitas tidak valid.");
                return;
            }
        }

        // Stylized banner for displaying the total price
        System.out.println("\n===============================================");
        System.out.println("|     Harga yang harus dibayarkan adalah      |");
        System.out.println("===============================================");
        System.out.println("Rp." + totalbiaya);

        // Stylized banner for payment options
        System.out.println("\n===============================================");
        System.out.println("|       Pilih Opsi Pembayaran                 |");
        System.out.println("===============================================");
        System.out.println("1. Cash");
        System.out.println("2. Transfer Bank");
        System.out.print("Masukkan Pilihan Pembayaran: ");
        int paymentChoice = input.nextInt();
        input.nextLine(); // Consume the newline character

        switch (paymentChoice) {
            case 1:
                bookings[userIndex][5] = "Pembayaran: Cash";
                break;
            case 2:
                bookings[userIndex][5] = "Pembayaran: Transfer Bank";
                break;
            default:
                System.out.println("Pilihan Pembayaran tidak valid.");
                return;
        }

        // Continue with promo code logic
        boolean promoAktif = false;
        while (true) {
            // Stylized banner for promo code activation
            System.out.println("\n===============================================");
            System.out.println("|  Aktivasi Promo Pemesanan Kamar             |");
            System.out.println("===============================================");
            System.out.print("Apakah Anda ingin mengaktifkan promo? (Ya/Tidak): ");

            String promoChoice = input.next();
            if (promoChoice.equalsIgnoreCase("Ya") || promoChoice.equalsIgnoreCase("Tidak")) {
                if (promoChoice.equalsIgnoreCase("Ya")) {
                    System.out.print("Berapa jumlah malam yang Anda pesan? ");
                    int jmlMalam = input.nextInt();
                    if (jmlMalam >= 3) {
                        double diskon = 0.1; // 10% discount
                        totalbiaya -= (totalbiaya * diskon);
                        System.out.println("Anda mendapatkan diskon sebesar 10%.");
                    }
                    promoAktif = true;
                    break;
                } else {
                    break;
                }
            } else {
                System.out.println("Masukkan pilihan yang valid (Ya/Tidak).");
            }
        }

        if (promoAktif) {
            bookings[userIndex][6] = "Total biaya setelah promo: Rp." + totalbiaya;
        }

        // Stylized banner for displaying the total price
        System.out.println("\n===============================================");
        System.out.println("|  Harga yang harus dibayarkan adalah         |");
        System.out.println("===============================================");
        System.out.println("Rp." + totalbiaya);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> registeredUsernames = new ArrayList<>();
        ArrayList<String> registeredPasswords = new ArrayList<>();
        String[][] bookings = new String[4][7]; // Maksimal 4 pengguna, dan 7 informasi pemesanan per pengguna
        String statusPemesanan = "BelumDipesan";
        String statusCheckIn = "belum";

        // Deklarasikan stok kamar untuk setiap tipe kamar
        int[] stokKamar = {1, 5, 3}; // Misalnya: 10 Studio, 5 Duplex, 3 Triplex

        // Stylized banner
        System.out.println("===============================================");
        System.out.println("|          Selamat Datang Di Sistem           |");
        System.out.println("|          Booking dan Reservasi Kamar        |");
        System.out.println("===============================================");

        // User authentication
        boolean loggedIn = false;
        int userIndex = -1;

        while (true) {
            System.out.println("\n================================================");
            System.out.println("|             Pilih Aksi:                      |");
            System.out.println("|   1. Login                                   |");
            System.out.println("|   2. Daftar                                  |");
            System.out.println("================================================");
            System.out.print("Pilih aksi (1/2): ");

            int choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Login
                    userIndex = authenticateUser(registeredUsernames, registeredPasswords, input);
                    if (userIndex != -1) {
                        loggedIn = true;
                    }
                    break;
                case 2:
                    // Daftar (Register)
                    registerUser(registeredUsernames, registeredPasswords, input);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }

            if (loggedIn) {
                break;
            }
        }

        boolean selesai = false;
        while (!selesai) {
            // Stylized banners for features
            System.out.println("\n================================================");
            System.out.println("|                 Pilih Tindakan               |");
            System.out.println("|   1. Pemesanan Kamar                         |");
            System.out.println("|   2. Check-in                                |");
            System.out.println("|   3. Check-out                               |");
            System.out.println("|   4. Selesai                                 |");
            System.out.println("================================================");

            System.out.print("Pilih tindakan (1/2/3/4): ");
            int choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Pemesanan Kamar
                    if (statusPemesanan.equals("Dipesan")) {
                        System.out.println("Anda sudah memesan kamar. Silakan check-in atau check-out terlebih dahulu.");
                        break;
                    }

                    makeBooking(stokKamar, bookings, userIndex, input);
                    statusPemesanan = "Dipesan";
                    break;
                case 2:
                // Check-in

                // Stylized banner for Check-in
                System.out.println("\n===============================================");
                System.out.println("|              Fitur Check-in                  |");
                System.out.println("===============================================");

                if (statusPemesanan.equals("Dipesan") && statusCheckIn.equals("belum")) {
                    System.out.println("Selamat Datang, Tamu yang Terhormat!");
                    System.out.println("Status Pemesanan Anda: " + statusPemesanan);
                    System.out.println("Status Check-in Anda: " + statusCheckIn);
                    System.out.println("-----------------------------------------------");
                    System.out.println("Detail Pemesanan:");
                    System.out.println("Username: " + registeredUsernames.get(userIndex));
                    System.out.println("Tipe Kamar   : " + bookings[userIndex][0]);
                    System.out.println("Jumlah Malam : " + bookings[userIndex][1]);
                    System.out.println("Fasilitas     : " + bookings[userIndex][2]);
                    System.out.println("Pembayaran   : " + bookings[userIndex][5]);
                    System.out.println("-----------------------------------------------");

                    // Additional information or actions for check-in can be added here

                    statusCheckIn = "sudah";
                } else if (statusPemesanan.equals("BelumDipesan")) {
                    System.out.println("Maaf, Anda belum memesan kamar. Silakan pesan terlebih dahulu.");
                } else {
                    System.out.println("Maaf, Anda sudah check-in atau status pemesanan belum tersedia.");
                }
                break;

                case 3:
                // Check-out
            
                // Stylized banner for Check-out
                System.out.println("\n===============================================");
                System.out.println("|               Fitur Check-out               |");
                System.out.println("===============================================");
            
                if (statusPemesanan.equals("Dipesan") && statusCheckIn.equals("belum")) {
                    System.out.println(" Anda belum check-in. Silakan check-in terlebih dahulu.");
                } else if (statusPemesanan.equals("Dipesan") && statusCheckIn.equals("sudah")) {
                    System.out.println();
                    System.out.println(" Selamat tinggal! Terima kasih telah memilih layanan kami.");
                    System.out.println("Bagaimana pengalaman Anda menggunakan aplikasi kami?");
                    System.out.print("Beri rating (1-5): ");
                    int rating = input.nextInt();
            
                    if (rating >= 1 && rating <= 5) {
                        bookings[userIndex][3] = "Rating: " + rating;
                        input.nextLine(); // Clear the newline character from the previous input
                        System.out.print(" Tulis ulasan: ");
                        String ulasan = input.nextLine();
                        bookings[userIndex][4] = "Ulasan: " + ulasan;
            
                        if (rating < 3) {
                            System.out.println(" Mohon maaf atas ketidaknyamanan Anda.");
                            System.out.print("Masukkan komplain atau saran Anda: ");
                            String komplain = input.nextLine();
                            bookings[userIndex][6] = "Komplain: " + komplain;
                            System.out.println();
                            System.out.println("Terimakasih atas masukan dan sarannya, Kami mohon maaf yang sebesar-besarnya");
                        }
            
                        statusPemesanan = "BelumDipesan";
                        statusCheckIn = "belum";
                    } else {
                        System.out.println(" Rating tidak valid.");
                        return;
                    }
                } else if (statusPemesanan.equals("BelumDipesan")) {
                    System.out.println(" Anda belum memesan kamar. Silakan pesan terlebih dahulu.");
                } else {
                    System.out.println(" Anda belum check-in atau status pemesanan belum tersedia.");
                }
                break;

                case 4:
                    selesai = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }
}
