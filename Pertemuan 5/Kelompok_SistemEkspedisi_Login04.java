import java.util.Scanner;

public class Kelompok_SistemEkspedisi_Login04 {

    public static void main(String[] args) {
        String username = "user";
        String password = "password";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        if (login(inputUsername, inputPassword, username, password)) {
            System.out.println("Login berhasil. Selamat datang, " + inputUsername + "!");
        } else {
            System.out.println("Login gagal. Periksa kembali username dan password Anda.");
        }

        scanner.close();
    }

    private static boolean login(String inputUsername, String inputPassword, String validUsername, String validPassword) {
        return validUsername.equals(inputUsername) && validPassword.equals(inputPassword);
    }
}