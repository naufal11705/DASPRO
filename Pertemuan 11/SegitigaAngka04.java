import java.util.Scanner;

public class SegitigaAngka04 {
    public static void main(String[] args) {
        //Deklarasi scanner
        Scanner sc04 = new Scanner(System.in);
        //Meminta inputan
        System.out.print("Masukkan nilai N = ");
        int N = sc04.nextInt();
        int i = 1;
        //Validasi agar nilai N minimal 3
        if (N >= 3) {
            //Outer loop untuk menentukan banyaknya baris
            while (i <= N) {
                int j = 1;
                //Melakukan print spasi
                for (int k = N; k > i; k--){
                    System.out.print(" ");
                }
                //Melakukan print angka
                while (j <= i) {
                    System.out.print(j);
                    j++;
                }
                i++;
                //Melakukan pritn baris
                System.out.println();
            }  
        } else {
            System.out.println("nilai N minimal 3!");
        }
    }
}
