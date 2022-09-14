public class ex218 {

    public static void main(String[] args) {

        for (int i = 0; i<2; i++) {
            for (int j = 0; j<2; j++) {
                System.out.print("+");
                for (int l = 0; l<3; l++) {
                    System.out.print("=");
                }
            } System.out.println("+");

            for (int j = 0; j<3; j++) {
                System.out.println("|   |   |");
            }
        }
        for (int j = 0; j<2; j++) {
            System.out.print("+");
            for (int l = 0; l<3; l++) {
                System.out.print("=");
            }
        } System.out.println("+");
    }
    
}
