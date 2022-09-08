#include <stdlib.h>
#include <stdio.h>


void printfunction() {
    int value = 0;
    
    while (value <= 0 || value >8){
        printf("Enter an integer between 1 and 8 (inclusive)\n");
        scanf("%i", &value);
    }

    // this loop prints space for value to (1 -> value) and prints # after printing space for 
    // 1 to (value -> 1)
    for (int i = 0; i < value; i++) // first for loop
    {
        for (int j = value - i -1; j > 0; j--)
        {
            printf(" "); //print spaces
        }
        for (int n = 0; n <= i; n++) //print the hashtag
        {
            printf("#");
        }
        printf("\n");
    }
}

void main() {


    printfunction();
}

