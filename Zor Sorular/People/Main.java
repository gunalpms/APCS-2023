public class Main {

    public static void main(String args[]) {

        // barb'ı bu şekilde yaratarak soyisim kullanma gereksiniminden kurtuluyoruz çünkü isim ve yaşlı constructor yok
        People barb = new People();
        barb.changeAge(14);
        barb.changeFirstName("Barb");

        People steph = new People("Steph", "Smith", 21);
        People steph2 = new People("Steph", "Jones", 25);
        People steph3 = new People("Steph", "Smith", 21);

        System.out.println(barb.canDrive());
        System.out.println(steph.canDrive());

        System.out.println(steph.getLicense());
        System.out.println(barb.getLicense());

        System.out.println(steph.sameFirstName(steph2));
        System.out.println(steph.sameLastName(steph2));

        System.out.println(steph.dups(steph2));
        System.out.println(steph.dups(steph3));
    }
    
}
