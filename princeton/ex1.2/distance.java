public class distance {
    
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        double c = Math.sqrt(a*a + b*b);

        System.out.println(c);
    }
}
