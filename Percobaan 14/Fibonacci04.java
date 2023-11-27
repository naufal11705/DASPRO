public class Fibonacci04 {
    
    static int fibonacci(int n, int m, int b) {
        if (b > 0){
            if (n == 0){
                System.out.print(n+" ");
            }
            System.out.print(m+" ");
            return fibonacci(m, m+n, b-1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.print(fibonacci(0, 1, 12));
    }
}
