import java.util.Scanner;
public class CaseStudy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ==PENCATATAN PRESTASI MAHASISWA== ");
        System.out.println("1. Tambah Data Prestasi");
        System.out.println("2. Tampilkan Semua Prestasi");
        System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
        System.out.println("4. Keluar");
        System.out.print("Pilih Menu: ");
        int menu = input.nextInt();
    }
}