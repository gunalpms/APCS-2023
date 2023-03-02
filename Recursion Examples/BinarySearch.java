public class BinarySearch {

    public static void main(String[] args) {
        int target = Integer.parseInt(args[0]);
        int[] a = {1, 3, 5, 6, 7, 8, 9, 13, 25, 65}; // an arbitrary list

        System.out.println(search(a, 0, a.length-1, target));
    }

    public static int search(int[] a, int l, int h, int t) {
        int m;

        // element not found case
        if (l>h) { return -1;}

        // find midpoint
        else {
            m = l + (h-l) /2; // midpoint

            // if target is below the midpoint the new high is one below the midpoint
            if (t<a[m]) {
                return search(a, l, m-1, t);
            }
            // if target is above the midpoint the new low is one above the midpoint
            else if(t>a[m]) {
                return search(a, m+1, h, t);
            }
            // return m if t is at m, obviously
            else {
                return m;
            }

        }

        

    }
    
}
