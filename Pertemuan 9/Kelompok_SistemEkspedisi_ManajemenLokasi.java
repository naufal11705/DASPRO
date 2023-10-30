import java.util.Scanner;

public class Kelompok_SistemEkspedisi_ManajemenLokasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arrayLokasi = new String[48];
        boolean found = false;
        int hasil = 0;

        while (true) {
            System.out.println("Manajemen Lokasi");
            System.out.println("1. Menambahkan Lokasi");
            System.out.println("2. Mencari Lokasi");
            System.out.println("3. Menampilkan Data Lokasi");
            System.out.println("4. Exit");

            System.out.print("Masukkan angka 1/2/3/4: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    for (int i = 0; i < arrayLokasi.length; i++) {
                        if (arrayLokasi[i] == null) {
                            System.out.print("Masukkan nama lokasi: ");
                            arrayLokasi[i] = input.next();
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Masukkan key yang ingin dicari: ");
                    String key = input.next();
                    for (int i = 0; i < arrayLokasi.length; i++) {
                        if (arrayLokasi[i] == key) {
                            hasil = i;
                            found = true;
                            break;
                        }
                    }
                    if(found == true) {
                        //Menampilkan hasil sesuai kata kunci
                        System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
                        found = false;
                    }else{
                        System.out.println("Key tidak ditemukan");
                    }                                            
                    break;
                case 3:
                    for (int i = 0; i < arrayLokasi.length; i++) {
                        if (arrayLokasi[i] != null) {
                            System.out.println(arrayLokasi[i]);
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}
