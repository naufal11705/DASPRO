import java.util.Scanner;

public class LatihanIndividu3 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        int angka;

        String[] bulan = {"Januari", "Februari", "Maret", "April",
            "Mei", "Juni", "Juli", "Agustus", "September", "Oktober",
            "November", "Desember"};

        System.out.print("Masukkan angka 1-12: ");
        angka = sc04.nextInt();

        System.out.println(bulan[angka-1]);
    }
}
