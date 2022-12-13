import java.util.Arrays;

public class without10{

    public static void main(String[] args) {
        // expected output: {1, 2, 0}
        int[] a = {1, 10, 2};

        System.out.println(Arrays.toString(f_without10(a)));

    }


    // returns a new int array b with the elements valued 10 removed from the original array arr
    // returns the same array if there are no 10s. the values shifted to the left leave zeros in their
    // previous spaces 
    public static int[] f_without10(int[] arr) { 
        int l = arr.length;
        int[] b = new int[l];
        int j = 0;
        for (int i = 0; i<l; i++) {
            if (arr[i] != 10) {
                b[j] = arr[i];
                j++;
            }
        }

        return b;
    }
    
}
