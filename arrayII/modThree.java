public class modThree {

    public static void main(String[] args) {
        // expected output: true
        int[] a = {1, 2, 4, 6, 7};
        System.out.println(f_modThree(a));

    }
    // returns true if 3 consecutive elements are even or odd else false
    public static boolean f_modThree(int[] arr) {
        int l = arr.length;

        // checks every element except the last 2 to see if that element, the next one and the one after
        // share the same mod2 result (even or odd)
        for (int i = 0; i<l-2; i++) {
            if ((arr[i]%2==arr[i+1]%2) && (arr[i+1]%2==arr[i+2]%2)) {
                return true;
            }
        }
        return false;
    }
    
}
