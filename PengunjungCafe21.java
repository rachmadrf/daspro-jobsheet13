public class PengunjungCafe21 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
    public static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String pengunjung : namaPengunjung) {
            System.out.println("- " + pengunjung);
        }
    }
}