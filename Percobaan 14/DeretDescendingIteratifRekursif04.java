public class DeretDescendingIteratifRekursif04 {

    static int deretDescendingIteratif(int n) {
        int bilangan = 0;
            for (int i = n; i > 0; i--) {
                System.out.print(i + ", ");
                bilangan = i-1;
            }
        return bilangan;
    }
    
    static int deretDescendingRekursif(int n) {
        if (n > 0) {
            System.out.print(n + ", ");
            return (deretDescendingRekursif(n - 1));
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(deretDescendingIteratif(10));
        System.out.println(deretDescendingRekursif(10));
    }
}
