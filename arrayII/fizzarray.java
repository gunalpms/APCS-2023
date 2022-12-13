import java.util.Arrays;

public class fizzarray {

    public static void main(String[] args) {
        // expected output is an array with elements 0, 1, 2, 3, 4

        System.out.println(Arrays.toString(f_fizzarray(5)));

    }
    // creates array with elements from 0 to n-1 with length n
    public static int[] f_fizzarray(int n) {
        int[] a = new int[n];
        for (int i = 0; i<n; i++) {
            a[i] = i;
        }
        return a;
    }
    
}
