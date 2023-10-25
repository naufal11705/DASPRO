import java.util.Scanner;

public class LatihanIndividu2 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        int[] nilai = new int[10];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-"+(i+1)+" : ");
            nilai[i] = sc04.nextInt();
        }

        System.out.println("Menampilkan Secara Terbalik:");
        for (int i=9; i > -1; i--) {
            System.out.println(nilai[i]);
        }    
    }
}
