import java.util.Scanner;

public class fahr{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        sc.close();

        System.out.println((c*9/5)+32);
    }
}