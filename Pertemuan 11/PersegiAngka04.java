import java.util.Scanner;

public class PersegiAngka04 {
    public static void main(String[] args) {
        //Deklarasi scanner
        Scanner sc = new Scanner(System.in);
        //Meminta inputan N
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        if (N >= 3) {
            //Melakukan perulangan jumlah baris
            for (int i = 1; i <= N; i++) {
                //Melakukan perulangan kolom
                for (int j = 1; j <= N; j++) {
                    if ((i == 1 || i == N ) || (j == 1 || j == N)) {
                        //Melakukan print untuk baris pertama dan terakhir
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("nilai N minimal 3!");
        }
    }
}