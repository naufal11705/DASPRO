import java.util.Scanner;

public class TulisCetak04 {
    public static String Tulis(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Tuliskan sesuatu: ");
        String pesan = sc.nextLine();
        sc.close();
        return pesan;
    }

    public static void Cetak(){
        System.out.println(Tulis());
    }   

    public static void main(String[] args) {
        Cetak();
    }
}
