import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class reader {

    static void readfile(String filename) {
        keygen k = new keygen(); // keygen fonksiyonunu buradan cagiriyorum ki her okunan satira 
                                 // islem yapabileyim
        try {
            FileInputStream fs = new FileInputStream(filename); // file io girdisini acar
            DataInputStream in = new DataInputStream(fs); // file'dan data almak icin girdi acar
            BufferedReader br = new BufferedReader(new InputStreamReader(in)); 
            // hafiza yonetimini vs kolaylastirmak icin buffered reader, input stream reader objesini 
            // arguman olarak alir. 
            String sline; // okunan satir degiskeni 

            while ((sline = br.readLine())!= null) { // satir yoksa durmasi lazim yoksa sonsuz dongu
                System.out.println(k.generate_key(sline)); // okudugu her satiri dogrudan string
            }                                              // olarak islenmesi icin yollar 

            in.close(); } // input kapaninca program gereksiz kaynak yememis olur
            
            catch (Exception e) {
            System.err.println("error is:" + e.getMessage()); }    // bunu ben degil kodu ornek aldigim yer
                                                            // akil etmis ama mantikli diye biraktim
    }
}
