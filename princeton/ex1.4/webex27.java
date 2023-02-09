public class webex27 {

    public static void main(String[] args) {
        
        int[][] test_arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // HAS NOT BEEN TESTED FOR ODD LENGTH MATRICES!

        // I don't even know how this works but I will do my best
        // To do a spiral, for every length, one less of that length must be iterated
        int a = test_arr.length - 1; // will change every iteration to set bounds
        int l = a; // length var for iterator
        int z = (test_arr.length + 1) / 2; // determines the number of "roundabouts"

        // for every roundabout
        for (int d = 0; d<z; d++, a--) {
            // top side
            for(int t = d; t<a; t++) {
                System.out.print(test_arr[d][t]+ " ");
            }
            // right side
            for(int r = d; r<a; r++) {
                System.out.print(test_arr[r][a]+ " ");
            }
            // bottom side
            for(int b = l-d; b>0+d; b--) {
                System.out.print(test_arr[a][b]+ " ");
            }
            // left side
            for(int le = l-d; le>0+d; le--){
                System.out.print(test_arr[le][d]+ " ");
            }
        }


    }    
}
