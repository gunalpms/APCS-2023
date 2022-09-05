public class ex28 {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i<n+1; i++) {
            String si = String.valueOf(i);
            System.out.println(" ".repeat(n-i) + si.repeat(i));
        }
    }
    
}
