public class ex9 {

    public static void main(String[] args) {
        
        for (int i = 1000; i<=2000; i++) { // for all int from 1000 to 2000 inclusive
            if (i%5 == 0 || i%5 == 5) { // if it is a multiple of 5 or 10
                System.out.println(); // add a newline char
            }          
            System.out.print(i + " "); // print the i number and a space
        }
    }
    
}
