#include <stdio.h>

void main() {
    int centsOwed = -1;

    //gets cents owed from scanf
    while (centsOwed <0) { // cannot input below zero
        printf("How much cents do we owe you\n");
        scanf("%i", &centsOwed);
    }

    // total coins is least amount of coins a cashier needs to pay a debt of x cents considering
    // the coins are in denominations of 1, 5, 10 and 25
    int totalCoins = 0;
    int q = centsOwed / 25; // this division and other divisions with centsOwed return an integer 
    printf("%i\n", q);      // therefore we can subtract the integer result times the denomination 
    totalCoins += q;        // value to find the remaining debt. If its zero, then the rest of the 
    centsOwed = centsOwed - (q*25); // calculation flows with zeroes and the end result is still
    int d = centsOwed / 10;         // accurate.
    printf("%i\n", d);
    totalCoins += d;
    centsOwed = centsOwed - (d*10);
    int n = centsOwed /5;
    printf("%i\n", n);
    totalCoins += n;
    centsOwed = centsOwed - (n*5);
    int p = centsOwed;
    printf("%i\n", p);
    totalCoins += p;
    printf("%i\n", totalCoins); //prints out total coins after having printed the amounts needed of 
                                // every specific denomination. 

}