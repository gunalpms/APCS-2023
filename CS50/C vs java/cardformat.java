import java.util.Scanner;
public class cardformat {

    public static void main(String[] args) {
        
        // to check whether a credit number is valid or not, the luhn algorithm is used
        // https://en.wikipedia.org/wiki/Luhn_algorithm

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();

        int edt = 0, odt = 0; // even indexed digits total and odd indexed digit totals

        String rn = new StringBuffer(n).reverse().toString(); // creates a reverse string
        
        for (int i = 0; i < rn.length(); i++) {
            
            int d = Character.digit(rn.charAt(i), 10); // returns the integer digit value of each index
            if (i % 2 == 0) { edt += d; } // if it is an even index add the digit value to the edt var
            
            else { odt += 2*d; // if it is an odd digit add twice the value of the digit
                if (d >= 5){ odt -= 9;} // but add the total of the digits if the result is larger than or 
            }                           // equal to 10 (e.g. 7*2 = 14, add 5 since 1+4 = 5)
        }
        System.out.println((odt + edt) % 10 == 0); // returns true if the mod 10 of the sums' sum is 0, 
                                                   // false if not
    }    
}
