public class countevents {

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4}; // expected output is 2
        int b = f_countevents(a);
        System.out.println(b);

    }
    // function returns the number of even integers in a given array of integers.
    public static int f_countevents(int[] arr) {
        int s = 0;
        for (int i : arr) {
            if (i%2 == 0) {s++;}
        }
        return s;
    }
    
}
