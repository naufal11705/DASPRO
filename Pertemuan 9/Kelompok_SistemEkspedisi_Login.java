import java.util.Scanner;

public class Kelompok_SistemEkspedisi_Login {

    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        String[] usernames = {"naufal", "putra", "farhan"};
        String[] passwords = {"000", "111", "222"};

        System.out.println("***LOGIN***");

        boolean login = false;

        while (!login) {
            System.out.print("Masukkan username: ");
            String inputUsername = input11.nextLine();

            System.out.println("Masukan Password: ");
            String inputPassword = input11.nextLine();

            for (int i = 0; i < usernames.length ; i++ ) {
                if ((usernames[i].equals(inputUsername)) && (passwords[i].equals(inputPassword))) {
                    System.out.println("Login Berhasil");
                    login = true;
                    break;
            }    
        }
        if(!login){
            System.out.println("Login Gagal, silahkan coba lagi!");
        }

    }
    }
}