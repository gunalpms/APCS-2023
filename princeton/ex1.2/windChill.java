public class windChill {

    public static void main(String[] args) { 

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        double c = 35.74 + 0.6215*a + (0.4275*a - 35.75) * Math.pow(b, 0.16);

        System.out.println(c);
    }
    
}
