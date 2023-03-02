public class BasicRecursion {

    public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        // print up to ith fib number
        for (int i = 1; i<=lim; i++) {
            System.out.println(fib(i));
        }
    }
    public static int fib(int n) {
        // two base cases needed since n-1 and n-2 will hit 1 and 0 respectively
        if (n == 0) {
            return 0;
        }

        else if (n == 1) {
            return 1;
        }

        // trace back and add the results recursively
        else {
            return fib(n-1) + fib(n-2);
        }
    }
}