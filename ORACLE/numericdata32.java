public class numericdata32 {

    public static void main(String[] args) {

        /*
         * there are several numeric data types that can be used in java
         * 
         * these are byte, short, int, long (8, 16, 32 and 64 bits)
         * byte and short are only used for devices that have limited RAM/Processing Power
         * 
         * when an integer variable is modified with assignment or mathematical operations the 
         * value in the program changes to the latest modification
         * 
         * shortcuts like %=, +=, -=, /= and *= are valid in Java like they are in other languages
         * 
         * Exercise 1, Part 1
         * 
         */

         int eggsPerChicken = 5; 
         int chickenCount = 3;

         int eggsMonday = eggsPerChicken*chickenCount;
         int eggsTuesday = eggsPerChicken*(chickenCount+1);
         int eggsWednesday = eggsPerChicken*((chickenCount+1)/2);
         System.out.println(eggsMonday + eggsTuesday + eggsWednesday);

         /*
          * Java does not round up numbers when an integer division yields in a result with decimal places
          Considering a and b are integers, 7/2=3.5 would be evaluated as 3

          To use operations with decimal points, we can define variables with the float and double types

          float is 32 bit precision and double is 64. float is almost never used

          Even if double x = 7/3, it would still evaluate to 3 because Java does not want to allocate
          memory for a double unless it is specified. 

          double x = 7.0/3 = 3.5 would be the correct method such that one of the numbers is written
          as a double in order to tell Java to allocate the required memory

          the final keyword makes the value of a variable unchangable (immutable) As a convention, 
          immutable variables have their names written in CAPITAL_LETTERS, with underscores

          Exercise 2, part 1
          */

          double dailyAverage = (100+121+117) / 3.0;
          double monthlyAverage = dailyAverage*30.0;
          double monthlyProfit = monthlyAverage * 0.18;
          System.out.println(monthlyProfit);

          /*
           * The order of operations in java is as follows:
           * 
           * Paranthesis
           * Increment/decrement operators
           * Division / multiplication 
           * Addition / subtraction
           */


    }
}