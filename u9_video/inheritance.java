import java.util.*;

public class inheritance {

    public static void main(String[] args) {

        // birkac tane favori hocalarimizdan yaratalim
        // sayisalci sedat sayisalci objesidir
        Sayisalci sedat = new Sayisalci("hisar", "cs");
        // sayisalci objesi olmak icin hoca tipinde de olabiliriz
        Hoca resat = new Sayisalci("hisar", "cs1");
        // bariz bir sekilde hoca objesi olmak icin hoca tipinde olmamiz lazimdir
        Hoca utku = new Hoca("hisar");

        // Sayisalci zeynel = new Hoca("Hisar", "mat");
        // Tum sayisalcilar hocadir ama tum hocalar sayisalci degildir
        // o yuzden sayisalci bir zeynel hoca istiyorsak Hoca objesi seklinde
        // yaratamayiz. bugunluk zeynel hocayi yaratmiyoruz belki sonra yaratiriz.
        System.out.println(sedat.toString());
        System.out.println(resat.toString());
        System.out.println(utku.toString());
        System.out.println(sedat.deneme());
        System.out.println(sedat.deneme("kazik"));
        // resat hoca deneme yazamaz cunku tipi hocadir ve deneme sadece sayisalci
        // tipine ait bir metottur. ne var ki hem superde hem subda tanimli
        // metod varsa instance tipine gore cagrilir, referans degil
        System.out.println(resat.benNeyim());
        System.out.println("=================");

        // sadece sayisalci tutmak icin bir liste yarattim
        ArrayList<Sayisalci> sayisalcilar = new ArrayList<Sayisalci>();

        // bu listeye sedati ekleyebiliriz:

        sayisalcilar.add(sedat);
        System.out.println(sayisalcilar.toString());

        // resat bir sayisalci objesi olmasina ragmen tipi hoca oldugu icin eklenemez
        // sayisalcilar.add(resat);
        // System.out.println(sayisalcilar.toString());

        // resati eklemek icin Sayisalci tipine downcasting yapabiliriz

        sayisalcilar.add((Sayisalci) resat);
        System.out.println(sayisalcilar.toString());

        // maalesef utku bu listeye giremez cunku hoca tipinde hoca objesidir
        // ve tum hocalar sayisalci olmadigi icin sayisalci olarak davranilamaz

        // sayisalcilar.add((Sayisalci) utku); runtime error verir
    }
}

class Hoca {

    private String okul;

    public Hoca(String o){
        this.okul = o;
    }

    public String toString(){
        return this.okul;
    }

    public String benNeyim() {
        return "ben hocayim";
    }
}

class Sayisalci extends Hoca {

    private String ders;

    public Sayisalci(String o, String d) {
        super(o);
        this.ders = d;
    }

    public String toString() {
        return super.toString() + " " + this.ders;
    }

    public String deneme() {
        return "ogrencilerime deneme hazirladim";
    }

    public String deneme(String z) {
        return "ogrencilerime " + z + " bir deneme hazirladim";
    }
}

