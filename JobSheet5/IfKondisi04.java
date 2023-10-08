import java.util.Scanner;
public class IfKondisi04 {
    public static void main(String[] args) {
        Scanner sc00 = new Scanner(System.in);

        System.out.println("Masukkan Suhu :");
        int suhu = sc00.nextInt();

        if (suhu<16){
            System.out.println("silakan menggunakan jaket");
        }
        if (suhu<20){
            System.out.println("silakan pakai baju tebal");
        }
        else{
            System.out.println("silakan pakai topi");
        }
    }
}
