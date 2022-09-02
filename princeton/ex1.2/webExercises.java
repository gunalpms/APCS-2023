public class webExercises {

    public static void main(String[] args){

        System.out.println((Math.sqrt(2) * Math.sqrt(2) == 2));

        // int a = 27 * "three";


        /*
         * Q2 What does the following statement do where grade is a variable of type int?
         * boolean isA = (90 <= grade <= 100);
         * 
         * It gets true value if a grade is above or equal to 90 and below or equal to 100. 
         * Otherwise it evaluates as false
         * 
         * Q5 What does the following code fragment print?
         * double x = (double) (3/5);
         * System.out.println(x);
         * 
         * It prints 1 because the casting (type conversion) is done after the expression is evaluated
         * 
         * Q7 What is the value of (Math.sqrt(2) * Math.sqrt(2) == 2)?
         * 
         * It is false because the sqrt method returns a double which is not of int type, therefore
         * the boolean operator does not see them as equal instances.
         * 
         * Q14 What does the compiler do if you try to write the following expression:
         * int a = 27 * "three";
         * 
         * Operator * is undefined for argument types int and String
         * 
         * Q26 Barring overflow, give a code fragment to compute the maximum of 
         * two integers a and b without using Math.max() or if. */

        // int max = (a+b + Math.abs(a - b) / 2);

        // This works by adding the distance between the numbers to their sum, which always yields
        // in twice the value of the largest number. To find the smallest, you can subtract the 
        // distance between the two numbers instead of adding while keeping the rest of the expression
        // the same.

    }
    
}
