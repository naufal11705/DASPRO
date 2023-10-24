import java.util.Scanner;

public class WhileKelipatan04 {
    public static void main(String[] args) {
        int kelipatan, jumlah=0, counter=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        int i = 0;
        while (i <= 50){
            i++;
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }
        System.out.println("Banyaknya bilangan "+ kelipatan +" dari 1 sampai 50 adalah "+ counter);
        System.out.println("Total Bilangan kelipatan "+ kelipatan +" dari 1 sampai 50 adalah "+ jumlah);
    }
}
