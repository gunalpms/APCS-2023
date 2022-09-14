public class textualdata33 {
    
    public static void main(String[] args) {

        String custName = "mehmet";
        String itemDesc = "ekmek";
        double cost = 5.0;
        int amount = 3;
        double tax = 1.18;

        String message = custName + " wants to purchase " + amount + " " + itemDesc;
        String message2 = "the total cost including tax is " +(amount*cost*tax);
        System.out.println(message);
        System.out.println(message2);
        
    }

}