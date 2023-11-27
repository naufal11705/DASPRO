import java.util.Scanner;

public class Percobaan604 {

    static int hitungLuas (int pjg, int lb){
        int Luas=pjg*lb;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b)*tinggi;
        return volume;
    }

    static int luasPermukaan1 (int pjg, int lb) {
        int Lp1 = pjg*lb*2;
        return Lp1;
    }

    static int luasPermukaan2 (int pjg, int tinggi) {
        int Lp2 = pjg*tinggi*2;
        return Lp2;
    }

    static int luasPermukaan3 (int lb, int tinggi) {
        int Lp3 = lb*tinggi*2;
        return Lp3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol,lp;

        System.out.println("Masukkan panjang");
        p=input.nextInt();
        System.out.println("Masukkan lebar");
        l=input.nextInt();
        System.out.println("Masukkan Tinggi");
        t=input.nextInt();

        L=hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalahh "+L);

        vol=hitungVolume(t, p, l);
        System.out.println("Volume balok adalah "+vol);

        lp= luasPermukaan1(p, l)+luasPermukaan2(p, t)+luasPermukaan3(l, t);
        System.out.println("Luas Permukaan adalah "+lp);
    }
}
