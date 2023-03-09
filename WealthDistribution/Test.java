import java.util.*;


public class Test {

    public static void main(String[] args) {

        Data d = new Data("data.csv");
        
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("q for quit enter country then year for gini data");
            String c = sc.nextLine();
            if (c.equals("q")) {
                System.exit(-1);
            }
            String y = sc.nextLine();

            countryData cd = new countryData(d, c, Integer.parseInt(y));
            System.out.println("The gini coefficient for the given info is:");
            System.out.println(cd.giniIndex());
        }
        }    
            
        /* 
        Data d = new Data("data.csv");
        String[][] data = d.getFormattedData();
        System.out.println(Arrays.toString(data[4540]));
        System.out.println(d.getRow("Turkey", 2011));

        countryData cd = new countryData(d, "Japan", 2014);
        System.out.println(cd.totalIncome(10));
        System.out.println(cd.giniIndex()); */
}
    

