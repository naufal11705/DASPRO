package UTS_04;
import java.util.Scanner;

public class Toko04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        String namaproduk;
        int qty;
        double diskon = 0;
        double harga;
        String konfirmasi = "";
        double subtotal=0;
        System.out.println("Program Toko");
        System.out.print("Masukkan Nama: ");
        String nama = sc04.nextLine();
        do { 
            System.out.print("Nama produk yang anda beli: ");
            namaproduk = sc04.nextLine();
            System.out.print("Banyaknya:  ");
            qty = sc04.nextInt();
            System.out.print("Harga:  ");
            harga = sc04.nextInt();
            System.out.print("Diskon:  ");
            diskon = sc04.nextInt();
            subtotal += (harga * qty);
            diskon += (harga * (diskon/100)) * qty;
            System.out.print("Apakah Anda mau menambahkan produk? (Y/N)? ");
            konfirmasi = sc04.next();
            sc04.nextLine();
        } while (konfirmasi.equalsIgnoreCase("y"));

        System.out.print("Apakah Anda pelanggan member? (Y/N)? ");
        String member = sc04.next();

        if (member.equalsIgnoreCase("y")) {
            if (subtotal >= 200000){
                System.out.println("Total Pembelian");
                System.out.println("Nama Pelanggan: "+nama);
                System.out.println("Tipe: Member");
                System.out.println("SubTotal: "+subtotal);
                System.out.println("Total diskon: "+(diskon+(diskon*0.1)));
                System.out.println("Total yang harus dibayar: "+(subtotal-(diskon+(diskon*0.1))));
            }
            if (subtotal < 200000){
                System.out.println("Total Pembelian");
                System.out.println("Nama Pelanggan: "+nama);
                System.out.println("Tipe: Member");
                System.out.println("SubTotal: "+subtotal);
                System.out.println("Total diskon: "+(diskon+(diskon*0.05)));
                System.out.println("Total yang harus dibayar: "+(subtotal-(diskon+(diskon*0.05))));                
            }
        }
        if (member.equalsIgnoreCase("n")){
            System.out.println("Total Pembelian");
            System.out.println("Nama Pelanggan: "+nama);
            System.out.println("Tipe: ");
            System.out.println("SubTotal: "+subtotal);
            System.out.println("Total diskon: "+diskon);
            System.out.println("Total yang harus dibayar: "+(subtotal-diskon));
        }

    }
}
