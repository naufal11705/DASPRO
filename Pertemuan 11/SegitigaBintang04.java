import java.util.Scanner;

public class SegitigaBintang04 {
    public static void main(String[] args) {
        //Deklarasi scanner
        Scanner sc = new Scanner(System.in);
        //Meminta inputan N
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        int i = 0;
        if (N >= 5) {
            //Melakukan perulangan baris
            while (i <= N) {
                int j = N;
                while (j > i) {
                    System.out.print("*");
                    j--;
                }
                i++;
                System.out.println();
            }  
        } else {
            System.out.println("nilai N minimal 5!");
        }
    }
}