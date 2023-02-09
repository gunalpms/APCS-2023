public class q41 {

    public static void main(String[] args) {
        
        int n = 5;

        // create n+2 rows because gives out of bounds if n or n+1 I dont know why
        double[][] binomial = new double[n+2][];
        // row 0 must be empty in order to access the i-1th row for the real first row.
        binomial[1] = new double[1 + 2];
        binomial[1][1] = 1.0;

        // calculate coefficients of the binomial distribution and print them
        for (int i = 2; i <= n+1; i++) {
            binomial[i] = new double[i+2];
            for (int k = 1; k < binomial[i].length - 1; k++) {
                binomial[i][k] = 0.5 * (binomial[i-1][k-1] + binomial[i-1][k]);
            }
            for (int j = 1; j < binomial[i].length - 2; j++) {
                System.out.print(binomial[i-1][j] + " ");
            }
            System.out.println();
        }
    }
}
