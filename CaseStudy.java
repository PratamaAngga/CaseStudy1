public class CaseStudy {
    static Scanner sc = new Scanner(System.in);
    static String[][] daftarPrestasi = new String[100][5];
    static int jumlahPrestasi = 0;
    public static void tambahDataPrestasi() {
        if (jumlahPrestasi >= daftarPrestasi.length) {
            System.out.println("Kapasitas data prestasi sudah penuh.");
            return;
        }

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Jenis Prestasi (Juara 1/Juara 2/Juara 3): ");
        String jenisPrestasi = sc.nextLine();
        String tingkatPrestasi;

        while (true) {
            System.out.print("Masukkan Tingkat Prestasi (Lokal/Nasional/Internasional): ");
            tingkatPrestasi = sc.nextLine();
            if (tingkatPrestasi.equalsIgnoreCase("Lokal") ||
                tingkatPrestasi.equalsIgnoreCase("Nasional") ||
                tingkatPrestasi.equalsIgnoreCase("Internasional")) {
                break;
            }
            System.out.println("Tingkat prestasi tidak valid. Coba lagi.");
        }

        int tahunPrestasi;
        while (true) {
            System.out.print("Masukkan Tahun Prestasi (2010 - " + java.time.Year.now() + "): ");
            tahunPrestasi = sc.nextInt();
            sc.nextLine();
            if (tahunPrestasi >= 2010 && tahunPrestasi <= java.time.Year.now().getValue()) {
                break;
            }
            System.out.println("Tahun prestasi tidak valid. Coba lagi.");
        }

        // Menyimpan data ke array
        daftarPrestasi[jumlahPrestasi][0] = nama;
        daftarPrestasi[jumlahPrestasi][1] = nim;
        daftarPrestasi[jumlahPrestasi][2] = jenisPrestasi;
        daftarPrestasi[jumlahPrestasi][3] = tingkatPrestasi;
        daftarPrestasi[jumlahPrestasi][4] = String.valueOf(tahunPrestasi);
        jumlahPrestasi++;

        System.out.println("Data prestasi berhasil ditambahkan.");
    }
    public static void tampilkanMenu() {
        System.out.println("=== PENCAATAN PRESTASI MAHASISWA ===");
        System.out.println("1. Tambah Data Prestasi");
        System.out.println("2. Tampilkan Semua Prestasi");
        System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan) {
            case 1:
                tambahDataPrestasi();
                break;
            case 2:
                // tampilkanSemuaPrestasi();
                break;
            case 3:
                // analisisPrestasi();
                break;
            case 4:
                System.out.println("Keluar dari program. Terima kasih!");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak valid. Coba lagi.");
        }
    }
    public static void main(String[] args) {
        while (true) {
            tampilkanMenu();
        }
    }
}
