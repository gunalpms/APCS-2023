public class no14 {

    public static void main(String[] args) {
        // expected output is true since array does not contain 1 or 4
        int[] a = {2, 3, 5};
        System.out.println(f_no14(a));

    }

    // return false if any element is either 1 or 4 else return true
    public static boolean f_no14(int[] arr) {
        for (int i : arr) {
            if (i == 1 || i == 4) {
                return false;
            }
        }
        return true;
    }
    
}
