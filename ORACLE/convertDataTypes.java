public class convertDataTypes {

    public static void main(String[] args) {

       // byte a = 128; // cannot convert from int to byte
        short b = 128;
        b = (byte)b;
        System.out.println(b); // b is -128 due to overflow

        byte c = 127;
        System.out.println(c);
        c++;
        System.out.println(c);
        c++;
        System.out.println(c);
        // overflow situation continues

        // exercise 2 icin gerekli dosya yok o yuzden exercise 3:

        String shirtPrice = "15";

        int shirtPriceNew = Integer.parseInt(shirtPrice);

        String taxRate = "0.05";

        double taxRateNew = Double.parseDouble(taxRate);

        String gibberish = "uyfdghfbkjnkm";

        double gibberishNew = Double.parseDouble(gibberish); // EXCEPTION FOR INPUT STRING ERR

        System.out.println(gibberishNew);

    }

}
