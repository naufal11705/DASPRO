import java.util.Scanner;
public class TugasIndividu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, password, output;
        String storedUsername = "naufal",storedPassword = "athena";

        System.out.println("Masukkan username: ");
        username = sc.next();
        System.out.println("Masukkan password: ");
        password = sc.next();

        output = (username.equals(storedUsername) && password.equals(storedPassword))
            ? "Berhasil masuk ke sistem" : "Username atau password salah";
        System.out.println(output);

    }
}
