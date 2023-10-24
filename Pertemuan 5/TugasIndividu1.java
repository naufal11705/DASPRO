import java.util.Scanner;
public class TugasIndividu1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jarakMusuh;
        String tipeSenjata;

        System.out.println("Masukkan jarak: ");
        jarakMusuh = sc.nextInt();

        tipeSenjata = (jarakMusuh <= 5) ? "Senjata Meele" : "Senjata Ranged";
        System.out.println(tipeSenjata);
    }
}