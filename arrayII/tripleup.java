public class tripleup {

    public static void main(String[] args) {
        // expected output: false
        int[] a = {1, 2, 4, 6, 7};
        System.out.println(f_tripleup(a));

    }
    // returns true if 3 consecutive elements are ascending by 1
    public static boolean f_tripleup(int[] arr) {
        int l = arr.length;

        // checks every element except the last 2 to see if that element, the next one and the one after
        // are equal to 3 times the middle element (3n = n-1 + n + n+1)
        for (int i = 0; i<l-2; i++) {
            if ((arr[i]+arr[i+1]+arr[i+2] == 3*arr[i+1]) && (arr[i+1] - arr[i] == 1)) {
                return true;
            }
        }
        return false;
    }
    
}
