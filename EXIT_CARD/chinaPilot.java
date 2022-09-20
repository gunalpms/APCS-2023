public class chinaPilot {

    public static void main(String[] args) {
        chinaPilotCalc c =  new chinaPilotCalc("allah muhammed");
        // SAYI ARRAYI AL

    }

    public static class chinaPilotCalc{

        public chinaPilotCalc() {

            System.out.println("no inputs given");
        }

        public chinaPilotCalc(String a) {

            a = a.toLowerCase();

            String[] args = a.split(" ");

            String tamsayi = args[0];
            
            String islem = args[2];

            double tamsayi_int = 0;

            if (tamsayi == "bir") {tamsayi_int = 1;}
            if (tamsayi == "iki") {tamsayi_int = 2;}
            if (tamsayi == "uc") {tamsayi_int = 3;}
            if (tamsayi == "dort") {tamsayi_int = 4;}
            if (tamsayi == "bes") {tamsayi_int = 5;}
            
            if (islem == "bolme") { 
                for (int i = 1; i < tamsayi_int +1; i++) {
                    
                }
            }


        }
    }    
}
