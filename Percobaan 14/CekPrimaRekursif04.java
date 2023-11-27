import java.util.Scanner;

public class CekPrimaRekursif04 {
    
    static boolean cekPrimaRekursif(int n, int m){
        if (m <= 1) {
            return true;
        } else {
            if (n % m == 0) {
                return false;
            } else {
                return cekPrimaRekursif(n, m - 1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Angka: ");
        int bilangan = sc.nextInt();
        System.out.println(cekPrimaRekursif(bilangan, bilangan-1));
    }
}
