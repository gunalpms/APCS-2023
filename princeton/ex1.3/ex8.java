import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        for (int i = 1; i<=a; i++) {
            String pfx = ""; // prefix
            if (i%10 == 1) pfx = "st"; // last num 1, first
            else if (i%20 == 2) pfx = "nd"; // last num 2, second
            else if (i%20 ==3) pfx = "rd"; // last num 3, third
            else if (i%100 >= 11 && i%100 <= 20) pfx = "th"; 
            // if last 2 digit is 11-20 inclusive then it is th
            else pfx = "th"; // th for everything else

            System.out.println(i + pfx + " hello");
        }
    }
    
}
