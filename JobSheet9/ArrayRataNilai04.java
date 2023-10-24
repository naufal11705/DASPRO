package JobSheet9;
import java.util.Scanner;

public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        double rata2Lulus = 0;
        double rata2TdkLulus = 0;
        int lulus = 0;
        int tdkLulus = 0;
        //Memasukkan jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa : ");
        int length = sc04.nextInt();
        //Kapasitas array disesuaikan sesuai jumlah mahasiswa
        int[] nilaiMhs = new int[length];
        //Memasukkan nilai mahasiswa
        for (int i = 0 ; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc04.nextInt();
        }
        
        for (int i = 0 ; i < nilaiMhs.length; i++) {
            //Menghitung jumlah dan nilai dari mahasiswa dengan nilai
            //lebih dari 70
            if (nilaiMhs[i] > 70) {
                rata2Lulus += nilaiMhs[i];
                lulus++;
            } else {
            //Menghitung jumlah dan nilai dari mahasiswa dengan nilai
            //kurang dari 70
                rata2TdkLulus += nilaiMhs[i];
                tdkLulus++;
            }
        }
        //Printout rata rata nilai
        System.out.println("Rata-rata nilai lulus= "+(rata2Lulus/lulus));
        System.out.println("Rata-rata nilai tidak lulus= "+(rata2TdkLulus/tdkLulus));
        
    }
}
