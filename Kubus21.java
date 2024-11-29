import java.util.Scanner;

public class Kubus21 {
    // Fungsi untuk menghitung volume kubus
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi; // Volume = sisi³
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * (sisi * sisi); // Luas Permukaan = 6 × sisi²
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input sisi kubus dari user
        System.out.print("Masukkan panjang sisi kubus: ");
        int sisiKubus = sc.nextInt();

        // Menghitung volume
        int volume = hitungVolume(sisiKubus);
        System.out.println("Volume kubus dengan sisi " + sisiKubus + " adalah: " + volume);

        // Menghitung luas permukaan
        int luasPermukaan = hitungLuasPermukaan(sisiKubus);
        System.out.println("Luas permukaan kubus dengan sisi " + sisiKubus + " adalah: " + luasPermukaan);
    }
}