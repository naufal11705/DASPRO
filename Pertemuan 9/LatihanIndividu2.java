import java.util.Scanner;

public class LatihanIndividu2 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        int[] nilai = new int[10];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-"+(i+1)+" : ");
            nilai[i] = sc04.nextInt();
        }

        int temp = 0;

        for (int i=0; i < nilai.length; i++) {
            for (int j=1; j < nilai.length-i; j++) {
                if (nilai[j-1] < nilai[j]) {
                    //swap elemen
                    temp = nilai[j];
                    nilai[j] = nilai[j-1];
                    nilai[j-1] = temp;
                }
            }
        }

        System.out.println("Hasil pengurutan:");
        for (int i=0; i < nilai.length; i++) {
            System.out.println(nilai[i]);
        }        
    }
}
