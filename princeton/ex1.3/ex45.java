import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        String isbn = "";
        int checksum = 0;

        for (int i = 2; i<=10; i++) { // first digit is zero
            int d = n % 10; // take last digit 
            if (i == 2 || i ==7 || i==10) isbn = "-" + isbn; // add hyphen in necessary places
            isbn = d + isbn; // add the digit number to the isbn string before the isbn
            checksum += i*d; // add the digit number and the index multiplication to the sum
            n = n / 10; // cut off last digit
        }
        // standart process to calculate checksum
        if (checksum % 11 == 1) isbn += "X";
        else if (checksum % 11 == 0) isbn += 0;
        else isbn += (11 - checksum % 11);
        
        System.out.println(isbn);
    }
}