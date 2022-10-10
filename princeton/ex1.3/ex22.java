import java.util.Scanner;

public class ex22 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        String s = "";

        for (int i = a; i>0; i/=2) { // for every "digit" we divide by two: digit in terms of binary digit
            s = (i%2) + s; // if it is a multiple of 2, it exists as 1 in the binary world, if not then 2
        }
        System.out.println(s);
    }   
}
