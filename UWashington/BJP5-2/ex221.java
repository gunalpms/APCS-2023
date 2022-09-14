public class ex221 {

    public static void main(String[] args){ 

        window(6);

    }

    public static void window(int n) {

        for (int i = 1; i < n+1; i++) {

            for (int j = 0; j < (4*n)-4*i; j++) {
                System.out.print("/");
            }
            for (int j = 0; j < 8*i-8; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < (4*n)-4*i; j++) {
                System.out.print("\\");
            }
            System.out.print("\n");
        }
    }
    
}
