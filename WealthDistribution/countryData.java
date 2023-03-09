public class countryData {

    private String name;
    private int year;
    private int population;
    private int meanIncome;
    private int[] incomeDeciles = new int[10];

    public countryData(Data id, String country, int year){

        String[][] data = id.getFormattedData();
        int row = id.getRow(country, year);
        name = data[row][0];
        year = Integer.parseInt(data[row][1]);
        population = Integer.parseInt(data[row][13]);
        meanIncome = Integer.parseInt(data[row][12]);
        for (int i = 2; i<12; i++) {
            incomeDeciles[i-2] = Integer.parseInt(data[row][i]);
        }
  
    }

    private double totalIncome(int it) {

        double ti = 0.0;
        for (int i = 0; i<it; i++) {
            ti += incomeDeciles[i];
        }
        return ti;
    }

    public double giniIndex() {

        double multiplier = 0.0;

        for (int i = 0; i<10; i++) {
            if (i == 0 || i == 9) {
                multiplier += totalIncome(i+1);              
            }
            else {
                multiplier += totalIncome(i+1) *2;
            }
        }

        double coefficient = (0.1 / totalIncome(10));
        return (1-(coefficient*multiplier));

    }
}

