import java.util.Scanner;
public class Suhu04 {
    public static void main(String[] args) {
        Scanner input04 = new Scanner(System.in);
        int suhu;
        char hujan;

        System.out.println("Masukkan Suhu : ");
        suhu = input04.nextInt();
        System.out.println("Apakah hujan ? ( y / n ): ");
        hujan = input04.next().charAt(0);

        if (suhu > 27) {
            System.out.println("Memakai dress");
            if (Character.toString(hujan).equals("y")) {
                System.out.println("Membawa payung");
            } else {
                System.out.println("Memakai sunscreen");
            }
        } else {
            System.out.println("Memakai celana panjang");    
        }
    }
}
