import java.util.Scanner;

public class LatihanIndividu4 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        int[] bilBulat = new int[8];
        int total = 0;
        double rata2;

        for (int i = 0; i < bilBulat.length; i++) {
            System.out.print("Masukkan bilangan bulat ke-"+(i+1)+" : ");
            bilBulat[i] = sc04.nextInt();
            total += bilBulat[i];
        }

        rata2 = total/bilBulat.length;
        System.out.println("Rata - rata: "+rata2);
    }
}
