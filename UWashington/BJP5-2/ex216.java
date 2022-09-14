public class ex216 {

    public static void main(String[] args) {

        for (int i = 1; i<7; i++) {

            for(int j = 0; j < i*2-2; j++) {
                System.out.print("\\");
            }

            for(int j = 0; j<26-4*i; j++) {
                System.out.print("!");

            }

            for(int j = 0; j < i*2-2; j++) {
                System.out.print("/");
            }
        System.out.print("\n");
        }
    }
    
}
