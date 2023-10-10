package Daspro7;
import java.util.Scanner;

public class LatihanMandiriA {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        String namaMahasiswa;
        char jenisKelamin;

        // Memasukan nama dan jenis kelamin
        for (int i = 0; i < 30; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa = sc04.next();
            System.out.print("Masukkan jenis kelamin (L/P) mahasiswa ke-" + (i + 1) + ": ");
            jenisKelamin = sc04.next().charAt(0);

            // Menampilkan nama mahasiswa perempuan
            if (jenisKelamin == 'P' || jenisKelamin == 'p') {
                System.out.println("Nama mahasiswa perempuan: "+namaMahasiswa);
            }
        }
    }
}

