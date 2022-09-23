import java.util.Scanner;

public class chinaPilot {

    public static void main(String[] args) {
    
        chinaPilotCalc c =  new chinaPilotCalc("x"); // kotu koddan oturu string ile obje yaratip 
        // constructordan islem gerceklestiriliyor
    }

    public static class chinaPilotCalc{
        

        public chinaPilotCalc() {

            System.out.println("no inputs given");
        }

        public chinaPilotCalc(String a) {

            Scanner s = new Scanner(System.in);
            String b = s.nextLine(); // string komutu al

            b = b.toLowerCase();

            String[] args = b.split(" ");

            String tamsayi = args[0]; // ilk komut kac sayi ile islem yapilacagi
            String islem = args[2]; // ikinci komut ise islemin ne oldugu

            double tamsayi_d = 0;
            // ilk komutu stringden sayisal degere ceviriyoruz
            if (tamsayi.equals("bir") ) {tamsayi_d = 1;}
            if (tamsayi.equals("iki")) {tamsayi_d = 2;}
            if (tamsayi.equals("uc")) {tamsayi_d = 3;}
            if (tamsayi.equals("dort")) {tamsayi_d = 4;}
            if (tamsayi.equals("bes")) {tamsayi_d = 5;}

            // ikinci komuta gore islemler yapiliyor
            // loop hepsinde ayni mantigini videoda acikliyorum
            if (islem.equals("bol")) {
                double x = s.nextDouble();
                for (int i = 1; i < tamsayi_d; i++) {
                    double y = s.nextDouble();
                    x /= y; }
                s.close();
                System.out.println(x); }
            
            if (islem.equals("carp")) {
                double x = s.nextDouble();
                for (int i = 1; i < tamsayi_d; i++) {
                    double y = s.nextDouble();
                    x *= y; }
                s.close();
                System.out.println(x); }
                    
            if (islem.equals("topla")) {
                double x = s.nextDouble();
                for (int i = 1; i < tamsayi_d; i++) {
                    double y = s.nextDouble();
                    x += y; }
                s.close();
                System.out.println(x); }
            
            if (islem.equals("cikart")) {
                double x = s.nextDouble();
                for (int i = 1; i < tamsayi_d; i++) {
                    double y = s.nextDouble();
                    x -= y; }
                s.close();
                System.out.println(x); }
        }
    }    
}
