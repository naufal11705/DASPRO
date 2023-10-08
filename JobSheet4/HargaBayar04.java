import java.util.Scanner;
public class HargaBayar04 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String merk;
        int harga, jumlah, jmlHalaman;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukkan merk buku");
        merk=input.next();
        System.out.println("Masukkan jumlah halaman");
        jmlHalaman=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan jumlah diskon");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Buku yang anda beli adalah " +merk+ "dengan jumlah halaman " +jmlHalaman);
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}
