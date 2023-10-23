package JobSheet9;
import java.util.Scanner;

public class ArrayNilai04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc04.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }

    }
}
