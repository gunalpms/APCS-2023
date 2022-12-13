import java.util.Arrays;

public class fizzarray3 {

    public static void main(String[] args) {
        // expected output is an array with elements 5, 6, 7, 8, 9, 10

        System.out.println(Arrays.toString(f_fizzarray3(5, 11)));

    }
    // creates array with elements from s to e-1 with length e-s
    public static int[] f_fizzarray3(int s, int e) {
        int[] a = new int[e-s];
        for (int i = s; i<(e); i++) {
            a[i-s] = i;
        }
        return a;
    }
    
}
