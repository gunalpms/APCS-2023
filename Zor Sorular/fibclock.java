import java.util.Scanner;

public class fibclock {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String in = sc.nextLine();

sc.close();

int totalsec = 0;
for (int i = 1; i<=in.length(); i++) {
String index = in.substring(i-1, i); // character at the index
int m = fib(i); // coefficient of the side length according to nth fib
// calculate seconds for each color according to their definition
// the definition also says that minutes and seconds are represented in 5x increments
if (index.equals("R")) { // Red gives hours
totalsec += 3600 * m; }
else if (index.equals("G")) { // Green gives minutes
totalsec += 60 * m * 5; }
else if (index.equals("B")) { // Blue gives seconds
totalsec += m * 5; }
else if (index.equals("Y")) { // Yellow gives hours and minutes
totalsec += (3600 * m) + (60 * m * 5); }
else if (index.equals("M")) { // Magenta gives hours and seconds
totalsec += (3600 * m) + (m * 5); }
else if (index.equals("C")) { // Cyan gives minutes and seconds
totalsec += (60 * m * 5) + (m * 5); }
else if (index.equals("W")) { // White is ignored
totalsec += 0; }
} // end for

System.out.println(totalsec);
totalsec %= 3600*12;
System.out.println((totalsec/3600) + " hours " + ((totalsec/60)%60) + " minutes " + (totalsec%60) + " seconds ");
} // end main

public static int fib(int n){
if (n<=2) return 1;
else return fib(n-1) + fib(n-2);
}
}
