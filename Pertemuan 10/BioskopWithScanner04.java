import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc04.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc04.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc04.nextInt();
            sc04.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc04.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
