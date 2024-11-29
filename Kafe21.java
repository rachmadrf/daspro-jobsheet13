import java.util.Scanner;

public class Kafe21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true, "DISKON50");

        int totalKeseluruhan = 0;
        String pilihLagi;

        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            int totalHarga = hitungTotalHarga21(pilihanMenu, banyakItem, "DISKON50)");
            totalKeseluruhan += totalHarga;

            System.out.println("Total harga untuk pesanan Anda: Rp." + totalHarga);

            System.out.print("Apakah Anda ingin memesan menu lain? (y/n)");
            pilihLagi = sc.next();
        } while (pilihLagi.equalsIgnoreCase("y"));

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp." + totalKeseluruhan);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo berlaku. Anda mendapatkan diskon sebesar 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo berlaku. Anda mendapatkan diskon sebesar 30%.");
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi  Hitam - Rp. 15.000");
        System.out.println("2. Cappucino - Rp. 20.000");
        System.out.println("3. Latte - Rp. 22.000");
        System.out.println("4. Teh Tarik - Rp. 12.000");
        System.out.println("5. Roti Bakar - Rp. 10.000");
        System.out.println("6. Mie Goreng - Rp. 18.000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga21(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5; // Diskon 50%
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7; // Diskon 30%
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo invalid.");
        }

        return hargaTotal;
    }
}