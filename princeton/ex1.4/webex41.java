public class webex41 {

    public static void main(String[] args) {
        int[][] test_arr = {
            {0, 2, 3, 4},
            {2, 6, 7, 0},
            {9, 10, 11, 12},
            {13, 14, 0, 16}
        };

        // status of the first row and column
        boolean fr = false;
        boolean fc = false;

        for(int c = 0; c<test_arr.length; c++) {
            if(test_arr[0][c] == 0) {
                fr = true;
            }
        }

        for(int r = 0; r<test_arr.length; r++) {
            if(test_arr[r][0] == 0) {
                fc = true;
            }
        }

        // sets the first row and column as an indicator for the future iteration
        for(int r = 0; r<test_arr.length; r++) {
            for(int c = 0; c<test_arr[0].length; c++) {
                if (test_arr[r][c] == 0) {
                    test_arr[r][0] = 0;
                    test_arr[0][c] = 0;
                }
            }
        }

        // for every element that is not in the first index or the first column should their
        // row or column be zero they are now going to be zero
        for(int r = 1; r<test_arr.length; r++) {
            for(int c = 1; c<test_arr[0].length; c++) {
                if (test_arr[0][c] == 0 || test_arr[r][0] == 0) {
                    test_arr[r][c] = 0;
                }
            }
        }

        // transforms the first row with the boolean at the beginning
        // this is to ensure that "false zeros" are eliminated
        if (fr) {
            for (int c = 0; c<test_arr.length; c++) {
                test_arr[0][c] = 0;
            }
        }   

        // same as above but for the first column
        if (fc) {
            for (int r = 0; r<test_arr.length; r++) {
                test_arr[r][0] = 0;
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
