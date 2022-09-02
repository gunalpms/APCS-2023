public class exercises {

    public static void main(String[] args) {

        // Q1

        int b = 5;
        int a = 3;

        int t = a;
        b = t;
        b = a;

        System.out.printf("%d%d%d", a, b, t);

        // this yields a result where t is set to be 3,
        // b becomes 3 and b becomes three again

        /*
         * Q4: Suppose that a and b are int values. Simplify the following expression:
         * (!(a < b) && !(a > b))
         * 
         * It says that a needs to be bigger than or equal to b while not being bigger
         * than b. Therefore
         * a and b are EQUAL (a==b)
         * 
         * Q5: The exclusive or operator ^ for boolean operands is defined to be true if
         * they are different,
         * false if they are the same. Give a truth table for this function.
         * 
         * FALSE FALSE -> FALSE
         * TRUE FALSE -> TRUE
         * FALSE TRUE -> TRUE
         * TRUE TRUE -> FALSE
         * 
         * Q6 Why does 10/3 give 3 and not 3.33333333
         * 
         * Both 10 and 3 are defined as integers therefore Java performs integer
         * division and omits the
         * decimal part.
         * 
         * Q7 What do each of the following print?
         * 
         * System.out.println(2 + "bc"); 2bc
         * System.out.println(2 + 3 + "bc"); 5bc
         * System.out.println((2+3) + "bc"); 5bc
         * System.out.println("bc" + (2+3)); bc5
         * System.out.println("bc" + 2 + 3); bc23
         * 
         * Q8: Explain how to use Quadratic.java to find the square root of a number.
         * 
         * Finding the square root of a is as simple as finding the roots of x^2-a
         * 
         * Q16: A physics student gets unexpected results when using the code
         * double force = G * mass1 * mass2 / r * r; 
         * to compute values according to the formula F = Gm1m2 / r2. 
         * Explain the problem and correct the code.
         * 
         * r * r needs to be in paranthesis due to order of operations
         * 
         *
         * 
         */

    }
}