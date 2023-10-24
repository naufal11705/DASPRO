import java.util.Scanner;
public class PemilihanPercobaan104 {

    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = input00.nextInt();

        String hasil = (angka % 2 == 0) ? "Angka "+angka+" bilangan genap" : "Angka "+angka+" bilangan ganjil";
        System.out.println(hasil);

    }
}