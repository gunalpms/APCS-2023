public class ex12 {

    public static void main(String[] args) {
        
        System.out.println("log n \tn \tn log n\tn^2 \tn^3");
        for (long i = 2; i<=2048; i*=2) { // for every n from 2 to 2048 (incl.) where n is a power of 2
            System.out.print((int) Math.log(i));
            System.out.print("\t"); // tabs for alignment
            System.out.print(i);
            System.out.print("\t");
            System.out.print((int) (i * Math.log(i)));
            System.out.print("\t");
            System.out.print(i * i);
            System.out.print("\t");
            System.out.print(i*i*i);
            System.out.println();

        }
    }
    
}
