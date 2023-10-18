package UTS_04;
import java.util.Scanner;

public class HitungIP04 {
    public static void main(String[] args) {
        String nilai = "";
        String matkul= "";
        int inputsks = 0;
        int totalsks = 0;
        int totalnilai = 0;
        int totalmatkul = 0;
        String konfirmasi = "y";
        System.out.println("Program Hitung IP");
        Scanner sc04 = new Scanner(System.in);
        System.out.println("Masukkan Nama: ");
        String nama = sc04.nextLine();
        do { 
            //ADA ERROR PADA TAHAP INI, PENGGUNA TIDAK DAPAT MEMASUKKAN
            //NAMA MATA KULIAH PADA LOOP KE 2 DAN SETERUSNYA           
            System.out.print("Nama Mata Kuliah: ");
            matkul = sc04.nextLine();
            System.out.print("Nilai (A,B+,C+,C,D,E):  ");
            nilai = sc04.nextLine();
            System.out.print("Masukkan jumlah SKS:  ");
            inputsks = sc04.nextInt();
            Double konversi = nilai.equalsIgnoreCase("A") ? 4.0
            : nilai.equalsIgnoreCase("B+") ? 3.5
            : nilai.equalsIgnoreCase("B") ? 3.0
            : nilai.equalsIgnoreCase("C+") ? 2.5
            : nilai.equalsIgnoreCase("C") ? 2.0
            : nilai.equalsIgnoreCase("D") ? 1.0
            : 0.0;
            totalnilai += konversi;
            totalsks += inputsks;
            totalmatkul++;
            matkul = "";
            System.out.print("Apakah lanjut input nilai (Y/N): ");
            konfirmasi = sc04.next();
        } while (konfirmasi.equalsIgnoreCase("y"));

            System.out.print("Hasil Perhitungan IP");
            System.out.print("Nama: "+nama);
            System.out.print("Indeks Prestasi (IP): "+(totalnilai*totalsks)/totalsks);
            System.out.print("Jumlah Mata Kuliah: "+totalmatkul);
            System.out.print("Jumlah SKS: "+totalsks);
            System.out.print("Jumlah MK yang perlu perbaikan: ");
    }

}

