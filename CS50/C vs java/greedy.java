import java.util.Scanner;

public class greedy {

    // c dosyasindakiyle ayni algoritma yorumlar icin oraya bakiniz
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int centsOwed = -1;

        while (centsOwed < 0) {
            System.out.println("Enter how much cents we owe you");
            centsOwed = sc.nextInt();
        }

        int totalCoins = 0;
        int q = centsOwed / 25;
        totalCoins += q;
        centsOwed = centsOwed - (q*25);
        int d = centsOwed / 10;
        totalCoins += d;
        centsOwed = centsOwed - (d*10);
        int n = centsOwed / 5;
        totalCoins += n;
        centsOwed = centsOwed - (n*5);
        int p = centsOwed;
        totalCoins += p;
        System.out.println(totalCoins);

        sc.close();

    }
    
}
