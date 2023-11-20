import java.util.Arrays;
import java.util.Scanner;

public class Tugas204 {

    static int[][] nilaiTugas = new int[5][7];

    /*static int[][] nilaiTugas = {
        {20, 19, 25, 20, 10, 0, 10},
        {30, 30, 40, 10, 15, 20, 25},
        {5, 0, 20, 25, 10, 5, 45},
        {50, 0, 7, 8, 0, 30, 60},
        {15, 10, 16, 15, 10, 10, 5}
    };*/

    static Scanner sc = new Scanner(System.in);

    public static void inputNilai() {
        for (int i = 0; i < nilaiTugas.length; i++) {
            System.out.println("Mahasiswa ke " + (i + 1));
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print("Masukkan nilai tugas minggu ke-" + (j + 1) + ": ");
                nilaiTugas[i][j] = sc.nextInt();
            }
        }
    }

    public static void Tampil() {
        for (int i = 0; i < nilaiTugas.length; i++) {
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ", Tugas ke-" + (j + 1) +
                        ": " + nilaiTugas[i][j]);
            }
        }
    } 

    public static void SortHari() {
        int nilaiTertinggi = 0;
        int indexMahasiswa = -1;
        int indexMinggu = 0;
        int nilaiTotal = 0;
        for (int i = 0; i < nilaiTugas.length; i++){
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                if (nilaiTugas[i][j] > nilaiTertinggi){
                    nilaiTertinggi = nilaiTugas[i][j];
                    indexMahasiswa = i+1;
                    indexMinggu = j+1;
                }
            }
        System.out.println("Nilai tertinggi pada minggu ke- "+(i+1)+" adalah "+nilaiTertinggi);        }
    }

    public static void NilaiTertinggi() {
        int nilaiTertinggi = 0;
        int indexMahasiswa = -1;
        int indexMinggu = 0;
        int nilaiTotal = 0;
        for (int i = 0; i < nilaiTugas.length; i++){
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                if (nilaiTugas[i][j] > nilaiTertinggi){
                    nilaiTertinggi = nilaiTugas[i][j];
                    indexMahasiswa = i+1;
                    indexMinggu = j+1;
                }
            }
        }
        System.out.println("Mahasiswa dengan nilai tertinggi adalah mahasiswa ke- "+indexMahasiswa);
        System.out.println("Mendapatkan nilai "+nilaiTertinggi+" pada minggu ke- "+indexMinggu);
    }
    public static void main(String[] args) {

        int Menu = 0;
        boolean isLoop = true;

        while(isLoop){
            System.out.println("═══════════════════════════════════════");
            System.out.println("Menu");
            System.out.println("═══════════════════════════════════════");
            System.out.println("[1] Input Nilai Mahasiswa");
            System.out.println("[2] Menampilkam Nilai Mahasiswa");
            System.out.println("[3] Mencari hari dengan nilai tertinggi");
            System.out.println("[4] Mahasiswa dengan nilai tertinggi");
            System.out.println("═══════════════════════════════════════");

            System.out.print("Masukkan Pilihan: ");
            Menu = sc.nextInt();
            sc.nextLine();

            switch (Menu) {
                case 1:
                inputNilai();
                    break;
                case 2:
                Tampil();
                    break;
                case 3:
                SortHari();
                    break;
                case 4:
                NilaiTertinggi();
                    break;
                default:
                    break;
            }
        }
    }
}
