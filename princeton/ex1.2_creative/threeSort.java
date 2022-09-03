public class threeSort {

    public static void main(String[] args) {
        
        //Take 3 integers as a cmd line argument
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);


        //Determine the minimum and maximum numbers, all numbers' total minus the minimum and maximum
        //will give the middle number
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int med = a + b + c - min + max;

        //Print them out in ascending order
        System.out.printf("%d%d%d", min, med, max);

    }
    
}
