import java.util.Scanner;

public class Latihan104 {
    public static void main(String[] args) {
        int bil1, bil2, bil3;
        Scanner input04 = new Scanner(System.in);

        System.out.println("Masukkan Bilangan ke 1 : ");
        bil1 = input04.nextInt();
        System.out.println("Masukkan Bilangan ke 2 : ");
        bil2 = input04.nextInt();
        System.out.println("Masukkan Bilangan ke 3 : ");
        bil3 = input04.nextInt();

        if (bil1 > bil2)
            if (bil1 > bil3)
                System.out.println("Bilangan Terbesar : " + bil1);
            else
                System.out.println("Bilangan Terbesar : " + bil3);
        else
            if (bil2 > bil3)
                System.out.println("Bilangan Terbesar : " + bil2);
            else 
                System.out.println("Bilangan Terbesar : " + bil3);
    }
}
