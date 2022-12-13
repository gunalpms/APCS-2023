public class sum13 {

    public static void main(String[] args) {
        int [] a = new int[4];
        a[0] = 5; // in the sum
        a[1] = 4; // in the sum
        a [2] = 13; // is 13 so not in the sum
        a [3] = 6; // is after an index with 13 so not included in the sum
        int b = f_sum13(a);
        System.out.println(b);
    }
    // the function sum 13 returns the sum of the integers in an array until an element with value 13 is found
    // if such element is found, that index and the following indices are not included in the sum
    public static int f_sum13(int[] arr) {
        int s = 0;
        for (int i : arr) {
            if (i == 13) {return s;}
            s +=i;            
        }
        return s;
    }  
}