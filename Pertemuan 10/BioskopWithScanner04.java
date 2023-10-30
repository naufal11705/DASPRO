import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        // Deklarasi scanner untuk memasukkan inputan
        Scanner sc04 = new Scanner(System.in);
        // Deklarasi varible
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        int menu;
        boolean exit = false;

        // Perulangan untuk menu
        do {
            System.out.println("[1]. Input data penonton");
            System.out.println("[2]. Tampilkan daftar penonton");
            System.out.println("[3]. Exit");
            System.out.print("Masukkan Pilihan: ");
            menu = sc04.nextInt();
            // Masuk ke menu / case sesuai inputan
            switch (menu) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc04.next();

                        do {
                            System.out.print("Masukkan baris: ");
                            baris = sc04.nextInt();
                            System.out.print("Masukkan kolom: ");
                            kolom = sc04.nextInt();
                            if (penonton[baris-1][kolom-1] == null || penonton[baris-1][kolom-1].equals("***")){
                                penonton[baris-1][kolom-1] = nama;
                                break;
                            } else {
                                System.out.println("Kursi tidak tersedia!");
                            }
                        } while (penonton[baris-1][kolom-1] != null);
                        
                        sc04.nextLine();
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc04.nextLine();
            
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;                
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null){
                                penonton[i][j] = "***";
                            }
                        }
                        System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (exit==false);

    }
}
