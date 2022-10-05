import java.util.*;


// Ramanjuan cube problem
// It is best to avoid lists in problems with such context

// Solution is the same with the one on the website because I got stuck and noticed that
// I was failing to see a mistake where I was keep checking the same numbers for a and c 
// such that I was getting duplicate values. 
public class ex34 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();

        for (int a = 1; a<=k; a++) { // start at a until a is k because 
            int ac = a*a*a;          // if a is k we can't add any number to it
            if (ac > k) { break; }   // we break off if the cube is greater than k due to the same principle
            
            for (int b = a; b<=k; b++) { // start at a for b because if we start at 1, we are going to get 
                int bc = b*b*b;          // a^3 + b^3 and b^3 + a^3 (theyre the same essentially)
                if (ac+bc > k) {break; } // again, we go until they are larger than k

                for (int c = a+1; c<=k; c++) { // c is 1 greater than a because for every a, c needs
                    int cc = c*c*c;            // to be different than a and we don't check below
                    if (cc > ac + bc) { break ;} // because it is already "checked" in the previous iter

                    for (int d = c+1; d<=k; d++) { // start d at c+1 because we want to avoid the same
                        int dc = d*d*d;            // duplicate trap mentioned above
                        if (dc + cc > ac + bc) { break; }

                        if (ac + bc == cc + dc) { // messy string down below but works as intended
                            System.out.println(a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                            System.out.println(ac + bc);
                        }
                    }
                }       
            }
        }
    }  
}
