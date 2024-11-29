import java.util.Scanner;

public class PenjualanKafe21 {
    // Deklarasi array untuk menyimpan data penjualan
    static int[][] penjualan = new int[5][7];
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fungsi untuk menginputkan data penjualan
        inputPenjualan(sc);

        // Menampilkan semua data penjualan
        System.out.println("\nSeluruh Data Penjualan:");
        tampilkanPenjualan();

        // Menampilkan menu dengan penjualan tertinggi
        System.out.println("\nMenu dengan penjualan tertinggi:");
        tampilkanPenjualanTertinggi();

        // Menampilkan rata-rata penjualan tiap menu
        System.out.println("\nRata-rata penjualan per menu:");
        tampilkanRataRataPenjualan();
    }

    // Fungsi untuk menginputkan data penjualan
    public static void inputPenjualan(Scanner sc) {
        System.out.println("Masukkan data penjualan (dalam angka):");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh data penjualan
    public static void tampilkanPenjualan() {
        System.out.print("Menu/Hari\t");
        for (int hari = 1; hari <= 7; hari++) {
            System.out.print("Hari " + hari + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    public static void tampilkanPenjualanTertinggi() {
        int penjualanTertinggi = 0;
        String menuTertinggi = "";
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > penjualanTertinggi) {
                penjualanTertinggi = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("Menu: " + menuTertinggi + " dengan total penjualan: " + penjualanTertinggi);
    }

    // Fungsi untuk menampilkan rata-rata penjualan per menu
    public static void tampilkanRataRataPenjualan() {
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / 7;
            System.out.println(menu[i] + ": " + String.format("%.2f", rataRata));
        }
    }
}