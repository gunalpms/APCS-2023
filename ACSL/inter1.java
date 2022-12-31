public class inter1 {

    public static void main(String[] args) {
        
        int res = transformnp(19750418, 6);
        System.out.println(res);

    }

    private static int transformnp(int n, int p) {

        // find digit count
        int digitsn=0;
        int n_test = n;
        while (n_test != 0) {
            n_test /= 10;
            digitsn++;
        }

        // find pth digit

        int pth_digit = find_digit_reverse(n, p);
        int bounds = digitsn - p;

        int result = 0;
        // transform left side until p is reached (bounds)
        for (int i = 1; i<= bounds; i++) {
            result += ((int) (Math.pow(10, digitsn-i))) * ((find_digit_reverse(n, digitsn+1-i)+pth_digit)%10);

        }

        // add p 
        result += (int) (Math.pow(10, p-1)*pth_digit);

        // transform right side until all digits are looped
        for (int i = bounds+1; i<= digitsn; i++) {
            result += ((int) (Math.pow(10, digitsn-i))) * ((int) ((Math.abs((find_digit_reverse(n, digitsn+1-i)-pth_digit)))));
        }
        return result;
        




    }

    // finds the given digit d of an integer a, where d denotes the dth digit from the right
    // for example, to find the 2nd digit of 1234, d should be 3
    private static int find_digit_reverse(int a, int d) {

        int digit;
        for (int i = 1; i<d; i++) {
            a = a/10;
        }
        digit = a%10;


        return digit;
    }
}