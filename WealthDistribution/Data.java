import java.io.*;


public class Data {
  
  private String[] country = new String[14];
  private String[][] formattedData = new String[4903][14];
  private String line = "";
  private String splitBy = ",";

  public Data(String file) {

    
    try {
        BufferedReader br = new BufferedReader(new FileReader(file));
        int i = 0;
        while ((line = br.readLine()) != null ) {
            country = line.split(splitBy);
            for(int j = 0; j<14; j++) {
                country[j] = country[j].replace("\"", "");
            }
            formattedData[i] = country;
            i++;

        }
        br.close();
        
        
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public String[][] getFormattedData() {
    return formattedData;
  }

  public int getRow(String country, int year){

    for (int i = 0; i<4903; i++) {
        if (formattedData[i][0].equals(country)) {
              if (Integer.parseInt(formattedData[i][1]) == year) {
                return i;
              }           
        }
    } 
    return -1;
  }
}

