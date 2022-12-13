public class lucky13 {

    public static void main(String[] args) {

        int[] a = {1, 5, 7}; // expected output is false
        boolean b = f_lucky13(a);
        System.out.println(b);

    }
    // function returns false if any element of arr is either 1 or 3, else true
    public static boolean f_lucky13(int[] arr) {
        for (int i : arr) {
            if(i == 1 || i == 3) {
                return false;
            }          
        }
        return true;
    }
    
}
