package UTS_04;
import java.util.Scanner;

public class HitungIP04 {
    public static void main(String[] args) {

        Scanner sc04 = new Scanner(System.in);

        String nama, namaMatkul, nilaiHuruf;
        int sks, jumlahsks = 0, totalmatkul = 0, jumlahRemidi = 0;
        Double konversi, totalnilai = 0.0;
        String konfirmasi;

        System.out.println("Program Hitung IP");
        System.out.print("Masukkan Nama: ");
        nama = sc04.nextLine();

        do {        
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul = sc04.nextLine();
            System.out.print("Nilai (A,B+,B,C+,C,D,E):  ");
            nilaiHuruf = sc04.nextLine();
            System.out.print("Masukkan jumlah SKS:  ");
            sks = sc04.nextInt();
            konversi = nilaiHuruf.equalsIgnoreCase("A") ? 4.0
            : nilaiHuruf.equalsIgnoreCase("B+") ? 3.5
            : nilaiHuruf.equalsIgnoreCase("B") ? 3.0
            : nilaiHuruf.equalsIgnoreCase("C+") ? 2.5
            : nilaiHuruf.equalsIgnoreCase("C") ? 2.0
            : nilaiHuruf.equalsIgnoreCase("D") ? 1.0
            : 0.0;
            totalnilai += (konversi*sks);
            jumlahsks += sks;
            totalmatkul++;
            if(konversi <= 1){
                jumlahRemidi++;
            }
            System.out.print("Apakah lanjut input nilai (Y/N): ");
            konfirmasi = sc04.next();
            sc04.nextLine();

        } while (konfirmasi.equalsIgnoreCase("y"));

            System.out.println("------- Hasil Perhitungan IP -------");
            System.out.println("Nama: "+nama);
            System.out.println("Indeks Prestasi (IP): "+(totalnilai/jumlahsks));
            System.out.println("Jumlah Mata Kuliah: "+totalmatkul);
            System.out.println("Jumlah SKS: "+jumlahsks);
            System.out.println("Jumlah MK yang perlu perbaikan: "+jumlahRemidi);
    }

}

