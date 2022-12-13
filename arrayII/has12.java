public class has12 {

    public static void main(String args[]) {
        int a [] = {2, 1, 3 ,4}; // expected output false since 2 comes before 1
        System.out.println(f_has12(a));

    }

    // returns true if and only if an element with value 2 comes after an element with value 1
    public static boolean f_has12(int[] arr) {

        boolean has1 = false;

        for (int i : arr) {
            if (has1 == true) { 
                if (i == 2) {return true;}
            }

            else if (i == 1) { has1 = true;}
        }
        return false;
    }
    
}
