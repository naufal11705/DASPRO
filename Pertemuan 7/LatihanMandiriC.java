public class LatihanMandiriC {
    public static void main(String[] args) {
        //inisialisasi
        int i = 1;
        //kondisi perulangan
        while (i <= 50) {
            //Menampilkan deret bilangan 1 sampai 50, kecuali bilangan kelipatan 3
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }    
}
