import java.util.Scanner;

public class LinearSearch04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        //Inisialisasi
        int hasil = 0;
        boolean found = false;
        //Memasukkan jumlah elemen array
        System.out.print("Masukkan jumlah elemen array: ");
        int length = sc04.nextInt();
        //Inisialisasi kapasitas array berdasarkan inputan
        int[] arrayInt = new int[length];
        //Memasukkan elemen ke dalam array
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = sc04.nextInt();
        }
        //Memasukkan kata kunci dari elemen yang ingin dicari
        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc04.nextInt();
        //Melakukan pencarian data
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                found = true;
                break;
            }
        }
        //Menampilkan output
        if(found == true) {
            //Menampilkan hasil sesuai kata kunci
            System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
        }else{
            System.out.println("Key tidak ditemukan");
        }


    }
}
