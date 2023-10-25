import java.util.Scanner;

public class LinearSearch04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        int hasil = 0;

        System.out.print("Masukkan jumlah elemen array: ");
        int length = sc04.nextInt();

        int[] arrayInt = new int[length];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = sc04.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc04.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);

    }
}
