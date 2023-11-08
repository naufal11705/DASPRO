import java.util.Scanner;

public class StudiKasusNo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] temps = new String[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Hari ke-" + (i+1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Nama ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.next();
            }
            System.out.println();
        }
        
        int i = 1;
        for (String nama[] : temps) {
            System.out.print("Hari ke-" + i + ": ");
            for (String temp : nama) {
                System.out.print(temp + " ");
            }
            System.out.println();
            i++;
        }
    }
}
