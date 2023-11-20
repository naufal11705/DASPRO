import java.util.Scanner;

public class Kubus04 {

    static int hitungVolume (int a) {
        int volume = a*a*a;
        return volume;
    }

    static int hitungLuasPermukaan (int a){
        int luasPermukaan= 6*a*a;
        return luasPermukaan;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int s,vol,lp;

        System.out.println("Masukkan Panjang Sisi");
        s=input.nextInt();

        vol=hitungVolume(s);
        System.out.println("Volume kubus adalah "+vol);

        lp=hitungLuasPermukaan(s);
        System.out.println("luas Permukaan Kubus adalah "+lp);
    }
}
