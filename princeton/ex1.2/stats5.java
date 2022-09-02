public class stats5 {

    public static void main(String[] args){

        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();

        System.out.println((a+b+c+d+e)/5);
        System.out.println(Math.min(a, Math.min(b, Math.min(c, Math.min(d, e)))));
        System.out.println(Math.max(a, Math.max(b, Math.max(c, Math.max(d, e)))));



    }
    
}
