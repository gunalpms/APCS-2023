public class q14 {

    public static void main(String[] args) {
        
        int[][] test_arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int len = test_arr.length;
        int holder;

        // selects every row and every column "one off" from the diagonal
        for(int r = 0; r < len; r++) {
            for(int c = r+1; c < len; c++) {
                holder = test_arr[c][r]; // holds the value thats going to be swapped
                test_arr[c][r] = test_arr[r][c]; // takes the iterated value and assigns it to the transposition
                test_arr[r][c] = holder; // assigns the value at the transposed index to the iterated index
            }

        } 

        displayarray(test_arr);
    }
    
    public static void displayarray(int arr[][]) {

        for (int i = 0; i<arr.length; i++) {
            for (int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }  
    }
}
