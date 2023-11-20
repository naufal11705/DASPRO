import java.util.Scanner;

public class Kelompok_SistemEkspedisi_MenyimpanHistoryTransaksi {

    public static void main(String[] args) {
        // Deklarasi scanner untuk memasukkan inputan
        Scanner input = new Scanner(System.in);

        // Lokasi default
        String[] arrayLokasi = new String[100];
            arrayLokasi[0] = "Malang";
            arrayLokasi[1] = "Jakarta";
            arrayLokasi[2] = "Surabaya";
            arrayLokasi[3] = "Bandung";
            arrayLokasi[4] = "Medan";
            arrayLokasi[5] = "Makassar";
            arrayLokasi[6] = "Yogyakarta";
            arrayLokasi[7] = "Semarang";
        // Tarif berdasarkan tujuan pengiriman
        double[] arrayTarifLokasi = new double[100];
            arrayTarifLokasi[0] = 8000;
            arrayTarifLokasi[1] = 45000;
            arrayTarifLokasi[2] = 25000;
            arrayTarifLokasi[3] = 16000;
            arrayTarifLokasi[4] = 23000;
            arrayTarifLokasi[5] = 34000;
            arrayTarifLokasi[6] = 36000;
            arrayTarifLokasi[7] = 23000;
            
        // Layanan pengiriman default
        String[] arrayLayanan = new String[20];
            arrayLayanan[0] = "Reguler";
            arrayLayanan[1] = "Sameday";
        // Tarif berdasarkan jenis layanan
        double[] arrayTarifLayanan = new double[20];
            arrayTarifLayanan[0] = 10000;
            arrayTarifLayanan[1] = 20000;

        boolean found = false;
        boolean exit = false;
        boolean isLoop = false;
        // Variabel untuk switch case menu
        int menuUtama, subMenu;
        // Variabel Searching
        String key;
        int beratBarang;
        double biayaAkhir;
        String lokasiPengiriman;
        double tarifPerKg = 5000;
        int pilihanLayanan;
        double tarifLayanan = 0;
        String namaPengirim;
        double biayaJarak = 0;

        // Array History Pemesanan
        String[][] historyTransaksi = new String[100][4];

        System.out.println("=======================================");
        System.out.println("\u001B[33m   Selamat Datang di Sistem Ekspedisi   \u001B[0m");
        System.out.println("=======================================");
        System.out.println("+ [1]. Melakukan Transaksi              \u001B[0m+");
        System.out.println("+ [2]. Keluar                         \u001B[0m+");
        System.out.println("=======================================");

        System.out.print("Masukkan Pilihan: ");
        menuUtama = input.nextInt();
        input.nextLine();

        isLoop = true;

        System.out.print ("Masukkan Nama Pengirim: ");
        namaPengirim = input.nextLine();
        System.out.print ("Masukkan Berat Barang: ");
        beratBarang = input.nextInt();
        //Mencari Kota Pengiriman pada Array
        do {
            System.out.print ("Masukkan Kota Tujuan: ");
            lokasiPengiriman = input.next();
            for (int i = 0; i < arrayLokasi.length; i++) {
                if (arrayLokasi[i] != null && arrayLokasi[i].equalsIgnoreCase(lokasiPengiriman)) {
                    biayaJarak = arrayTarifLokasi[i];
                    found = true;
                    break;
                }
            }
            if(found != true) {
                System.out.println("Kota tidak ditemukan");
            }    
        } while (found == false);
        found = false;

        //Memilih Jenis Layanan pada Array

        for (int i = 0; i < arrayLayanan.length; i++) {
            if (arrayLayanan[i] != null) {
                System.out.println("["+i+"]. "+arrayLayanan[i]+" - "+arrayTarifLayanan[i]);
                
            }
        }
        System.out.print ("Masukkan Pilihan: ");
        pilihanLayanan = input.nextInt();
        tarifLayanan = arrayTarifLayanan[pilihanLayanan];                      

        biayaAkhir = tarifLayanan + (tarifPerKg * beratBarang) + biayaJarak;
        System.out.println(biayaAkhir);

        for (int i = 0; i < historyTransaksi.length; i++) {
            if (historyTransaksi[i][0] == null) {
                historyTransaksi[i][0] = namaPengirim;
                historyTransaksi[i][1] = lokasiPengiriman;
                historyTransaksi[i][2] = arrayLayanan[pilihanLayanan];
                historyTransaksi[i][3] = Double.toString(biayaAkhir);
                break;
            }
        }

    }
}
