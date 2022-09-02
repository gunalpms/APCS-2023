public class sumSines {

    public static void main(String[] args) {

        double a = Integer.parseInt(args[0]);

        double c = Math.sin(2*a) + Math.sin(3*a);

        System.out.println(c);
    }
    
}
