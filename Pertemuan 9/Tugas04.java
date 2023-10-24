import java.util.Scanner;

public class Tugas04 {
    public static void main(String[] args) {
        int temp;
        int total = 0;
        double rata2;

        Scanner sc04 = new Scanner(System.in);
        //Memasukkan kapasitas array
        System.out.print("Jumlah nilai yang ingin di input: ");
        int length = sc04.nextInt();

        int[] nilai = new int[length];
        //Memasukkan nilai
        for (int i = 0 ; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-"+(i+1)+" : ");
            nilai[i] = sc04.nextInt();
            total += nilai[i];
        }

        temp = 0;
        //Mengurutkan dari nilai tertinggi ke terkecil (descending)
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

        System.out.println("Nilai Tertinggi: "+nilai[0]);
        System.out.println("Nilai Tertinggi: "+nilai[length-1]);

        //Menghitung rata rata
        rata2 = total/nilai.length;
        System.out.println("Nilai Rata Rata: "+rata2);

    }
}
