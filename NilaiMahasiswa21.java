import java.util.Scanner;

public class NilaiMahasiswa21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta jumlah mahasiswa dan jumlah tugas dari pengguna
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = sc.nextInt();

        // Deklarasi array untuk menyimpan nilai tugas
        int[][] nilaiTugas = new int[jumlahMahasiswa][jumlahTugas];

        // Input nilai tugas dari pengguna
        inputNilai(sc, nilaiTugas, jumlahMahasiswa, jumlahTugas);

        // Menampilkan seluruh nilai tugas
        System.out.println("\nSeluruh Nilai Tugas Mahasiswa:");
        tampilkanNilai(nilaiTugas, jumlahMahasiswa, jumlahTugas);

        // Menghitung dan menampilkan rata-rata nilai tiap mahasiswa
        System.out.println("\nRata-rata nilai tiap mahasiswa:");
        tampilkanRataRata(nilaiTugas, jumlahMahasiswa, jumlahTugas);

        sc.close();
    }

    // Fungsi untuk input nilai tugas dari pengguna
    public static void inputNilai(Scanner sc, int[][] nilaiTugas, int jumlahMahasiswa, int jumlahTugas) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai tugas untuk Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Tugas ke-" + (j + 1) + ": ");
                nilaiTugas[i][j] = sc.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh nilai tugas
    public static void tampilkanNilai(int[][] nilaiTugas, int jumlahMahasiswa, int jumlahTugas) {
        System.out.print("Mahasiswa/Tugas\t");
        for (int j = 0; j < jumlahTugas; j++) {
            System.out.print("Tugas " + (j + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa " + (i + 1) + "\t");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print(nilaiTugas[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menghitung dan menampilkan rata-rata nilai tiap mahasiswa
    public static void tampilkanRataRata(int[][] nilaiTugas, int jumlahMahasiswa, int jumlahTugas) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            int totalNilai = 0;
            for (int j = 0; j < jumlahTugas; j++) {
                totalNilai += nilaiTugas[i][j];
            }
            double rataRata = (double) totalNilai / jumlahTugas;
            System.out.println("Mahasiswa " + (i + 1) + ": " + String.format("%.2f", rataRata));
        }
    }
}