public class ex23 {

    public static int fib(int n){

        if (n <= 1) {
            return n;
        }

        else {
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
        int n = 12;
        
        for (int i = 1; i<n+1; i++) {
            System.out.println(fib(i));
        }        
    }    
}
