import java.util.Scanner;
public class CaseStudy {
    
    static Scanner sc = new Scanner(System.in);
    static String[][] daftarPrestasi = new String[100][5];
    static int jumlahPrestasi = 0;

    public static void tambahDataPrestasi() {
        if (jumlahPrestasi >= daftarPrestasi.length) {
            System.out.println("Achievement data capacity is full.");
            return;
        }

        System.out.print("Enter Student Name: ");
        String nama = sc.nextLine();
        System.out.print("Enter the student's NIM: ");
        String nim = sc.nextLine();
        System.out.print("Enter the type of achievement (1st / 2nd / 3rd place): ");
        String jenisPrestasi = sc.nextLine();
        String tingkatPrestasi;

        while (true) {
            System.out.print("Enter Level of Achievement (Local / National / International):");
            tingkatPrestasi = sc.nextLine();
            if (tingkatPrestasi.equalsIgnoreCase("Local") ||
                tingkatPrestasi.equalsIgnoreCase("National") ||
                tingkatPrestasi.equalsIgnoreCase("International")) {
                break;
            }
            System.out.println("Invalid achievement level. Try again.");
        }

        int tahunPrestasi;
        while (true) {
            System.out.print("Enter Years of Achievement (2010 - 2024): ");
            tahunPrestasi = sc.nextInt();
            sc.nextLine();
            if (tahunPrestasi >= 2010 && tahunPrestasi <= 2024) {
                break;
            }
            System.out.println("Year of achievement is invalid. Try again.");
        }

        daftarPrestasi[jumlahPrestasi][0] = nama;
        daftarPrestasi[jumlahPrestasi][1] = nim;
        daftarPrestasi[jumlahPrestasi][2] = jenisPrestasi;
        daftarPrestasi[jumlahPrestasi][3] = tingkatPrestasi;
        daftarPrestasi[jumlahPrestasi][4] = String.valueOf(tahunPrestasi);
        jumlahPrestasi++;

        System.out.println("Achievement data added successfully.");
    }
    public static void tampilkanSemuaPrestasi(){
        String[] labels = {"Name : ", "NIM : ", "Type : ", "Level : ", "Year : "};
        if (jumlahPrestasi == 0) {
            System.out.println("There is no achievement data yet.");
        } else {
            System.out.println("\n=== LIST OF ALL ACHIEVEMENTS ===");
            for (int i = 0; i < jumlahPrestasi; i++) {
                for (int j = 0; j < daftarPrestasi[i].length; j++) {
                    System.out.print(labels[j] + daftarPrestasi[i][j]);
                    if (j < daftarPrestasi[i].length - 1) {
                        System.out.print(" | ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void findOutData(){
        System.out.println("\n=== ACHIVEMENT ANALYSIS ===");
        System.out.print("Enter the achievement you want to analyze (name / NIM / type / level / year): ");
        String search = sc.nextLine();
        boolean found = false;
        for (int a = 0; a < daftarPrestasi.length; a++){
            for (int b = 0; b < daftarPrestasi[a].length; b++){
                if (search.equalsIgnoreCase(daftarPrestasi[a][b])) {
                    found = true;
                    for (int c = 0; c < daftarPrestasi[a].length; c++){
                        switch (c){
                            case 0:
                                System.out.print("Name : " + daftarPrestasi[a][c] + " | ");
                                break;
                            case 1:
                                System.out.print("NIM : " + daftarPrestasi[a][c] + " | ");
                                break;
                            case 2:
                                System.out.print("Type : " + daftarPrestasi[a][c] + " | ");
                                break;
                            case 3:
                                System.out.print("Level : " + daftarPrestasi[a][c] + " | ");
                                break;
                            case 4:
                                System.out.print("Year : " + daftarPrestasi[a][c] + " | ");
                                break;
                        }
                    }
                    System.out.println();
                } 
            }
        }
        if (found == false) {
            System.out.println("Invalid input, no matching data.");
        }
    }

    public static void tampilkanMenu() {
        System.out.println("\n=== STUDENT ACHIEVEMENT RECORD ===");
        System.out.println("1. Add Achievement Data");
        System.out.println("2. Show All Achievements");
        System.out.println("3. Achievement Analysis (by type / name / NIM / level / year)");
        System.out.println("4. Exit");
        System.out.print("Select the menu: ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        switch (pilihan) {
            case 1:
                tambahDataPrestasi();
                break;
            case 2:
            tampilkanSemuaPrestasi();
                break;
            case 3:
                findOutData();
                break;
            case 4:
                System.out.println("Exit the program. Thank you!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid selection. Try again.");
        }
    }
    public static void main(String[] args) {

     while (true) {
        tampilkanMenu();
    }

    }
}
