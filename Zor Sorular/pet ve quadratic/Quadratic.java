public class Quadratic {
    private double a;
    private double b;
    private double c;

    public Quadratic(double x, double y, double z) {
        a = x;
        b = y;
        c = z;
    }

    public String solveEquation() {
        double d = (Math.pow(b, 2)) - (4*a*c);
        double x1 = ((-1*b)-Math.sqrt(d))/(2*a);
        double x2 = ((-1*b)+Math.sqrt(d))/(2*a);
        return ("The roots are " + x1 + " and " + x2);

    }
    
}
