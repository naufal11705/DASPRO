import java.util.Scanner;
public class Latihan204 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku, jumlahDiskon, hargaDiskon, hargaBuku, hargaTotal;
        double diskon = 0;
        //Memasukkan input dengan scanner
        System.out.println("Masukkan Jenis Buku : ");
        jenisBuku = input04.nextLine();
        System.out.println("Masukkan Harga Buku : ");
        hargaBuku = input04.nextInt();
        System.out.println("Masukkan Jumlah Buku : ");
        jumlahBuku = input04.nextInt();
        //Menghitung jumlah diskon dengan memanfaatkan nested if
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku <= 2)
                diskon = 0.10;
            else
                diskon = 0.12;
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku <= 3)
                diskon = 0.08;
            else
                diskon = 0.09;
        } else
            if (jumlahBuku > 3)
                diskon = 0.05;
            //Menghitung persentase diskon
            jumlahDiskon = (int) ((diskon * 100));
            //Menghitung potongan harga
            hargaDiskon = (int) ((hargaBuku * jumlahBuku) * diskon);
            //Menghitung total harga akhir
            hargaTotal = ((hargaBuku * jumlahBuku) - hargaDiskon);
            System.out.println("Diskon : " + jumlahDiskon + "%");
            System.out.println("Potongan Harga : " + hargaDiskon);
            System.out.println("Harga Yang Harus Dibayar : " + hargaTotal);
    }
}
