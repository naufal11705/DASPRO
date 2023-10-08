import java.util.Scanner;
public class PemilihanPercobaan204 {
    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);

        System.out.println("Nilai uas : ");
        float uas = input00.nextFloat();
        System.out.println("Nilai uts : ");
        float uts = input00.nextFloat();
        System.out.println("Nilai kuis : ");
        float kuis = input00.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input00.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = 80 < total && total <= 100 ? "Sangat baik"
            : 73 < total && total <= 80 ? "Lebih dari Baik"
            : 65 < total && total <= 73 ? "Baik"
            : 60 < total && total <= 65 ? "Lebih dari Cukup"
            : 50 < total && total <= 60 ? "Cukup"
            : 39 < total && total <= 50 ? "Kurang"
            : "Gagal";

        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
}
