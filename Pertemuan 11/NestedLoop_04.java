import java.util.Scanner;

public class NestedLoop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }
        
        int i = 1;
        double jumlah;
        double rata2 = 0;
        for (double suhu[] : temps) {
            jumlah = 0;
            System.out.print("Kota ke-" + i + ": ");
            for (double temp : suhu) {
                jumlah += temp;
                System.out.print(temp + " ");
            }
            rata2 = jumlah / 7;
            System.out.print("Rata-rata = "+rata2);
            System.out.println();
            i++;
        }
    }
}
