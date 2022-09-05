public class ex211 {   
    public static void main(String[] args) {

        int range = 5;
        int rep= 7;
        StringBuilder s = new StringBuilder();
        
        for (int i = 1; i<range; i++) {
            s.append(i);
        }

        s.append(0);

        String a = s.toString();

        for (int i = 1; i<rep+1; i++) {
            System.out.print(" ".repeat(range-1) + "|");
        }

        System.out.println("\n" + a.repeat(rep));


    }    
}
