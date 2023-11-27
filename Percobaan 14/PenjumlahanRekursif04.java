public class PenjumlahanRekursif04 {
    
    static int penjumlahanRekursif(int n, int m) {
        if (n > 0) {
            System.out.print(m);
            if (n != 1){
                System.out.print("+");
            }else{
                System.out.print(" = ");
            }

            return (n + penjumlahanRekursif(n - 1, m+1));
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(penjumlahanRekursif(8, 1));
    }
}
