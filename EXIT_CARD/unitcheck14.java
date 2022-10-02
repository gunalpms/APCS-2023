public class unitcheck14 {

    public static void main(String[] args) {
        
        // 1 
        int a = 5;
        double b = 5.0;
        double c = (double) a;
        int d = (int) b;

        // 2
        int e = 1;
        e++; // e 2 oldu
        e--; // e yine 1 oldu
        e+= e; // e 2 oldu cunku kendisini ekledik
        e%=e; // e 0 oldu cunku kendisine bolumunden kalanini kendisine deger olarak verdik
        
        // 3
        // Yazili bir class dogru constructor kullanilarak yeni bir degiskene atandigi ve new keywordu
        // kullanildigi zaman bir obje yaratir. Objeler classlari birden cok kez kullanmak icin vardir

        // 4 5 6 7 8 9 
        /* 
            public static class deneme{
                public deneme() {
                    System.out.println(parametresiz construct);
                }
    
                public deneme(int arg) {
                    System.out.println(parametreli construct);
                }
    
                private void allah(int a);
                // parametreli method
                private void peygamber();
                // parametresiz method
                private int kutsalkitap();
                // returnlu method
                private int mekke(String hacet);
                // returnlu ve parametreli method   }

                deneme d = new deneme();
                deneme de = new deneme(1);
                d.allah(1);
                de.peygamber();
                vs vs.
                */
        // 10
        String g = new String("b");
        // 11
        String h = g.substring(0);
        // 12
        // substring cagrildigi zaman g degismez

        // 13 (hepsini gostermeye gerek yok)
        String j = h + g;

        // 14
        String k = Integer.toString(10);

        // 15
        String l = Character.toString(k.charAt(0));

        // 16
        // yukarida gosterdim zaten

        // 17
        int m = l.length();

        // 18, 19
        // substring (i, j) i ve j-1 indexi arasindaki charlari dondurur (dahili)
        // substring (i) ise i'den sonra kadar dondurur (dahili)

        // 20
        // indexOf(str) cagrildigi stringde str objesi arar ve basladigi indexi dondurur,
        // bulamazsa -1 dondurur

        // 21
        // equals metodu stringler icin kullanildiginda degerleri ayniysa true degilse false dondurur

        // 22
        // compareTo gereksiz karisik bir method ama alfabetik siraya gore negatif veya pozitif bir sayi dondurur
        // eger 0 dondururse equals'in true dondurmesine esdegerdir

        // 23, 26
        // type var_name = new type(value) 

        // 27
        // statik metod cagirmanin 4-9 arasi anlatilan olaydan bir farki yok

        // 28-29
        int o = Math.abs(-20); // double da olur
        double p = Math.pow(2.0, 3.0); // = 8.0
        double r = Math.sqrt(16.0);
        double s = Math.random(); // 0 1 arasi sayi ama 1 dahil degil

        // 30
        // burada cok bir sey yazmaya gerek yok && and || or demek kalani standart

        // 31
        // if fonksiyonu sadece argumani true iken calisir
        // else if fonksiyonu hiyerarside uzerinde gelen diger if veya else ifler false iken calisir
        // else ise hiyerarside uzerinde gelen butun kosulsal fonskiyonlar false iken calisir

        // 32
        // 1. if
        // 2 . if
        // 2. if calismasi icin ilk if dogru olmak zorundadir, yoksa 2. if degerlendirmeye girmez

        // 33
        // burasi da pek karisik degil ancak short circuit eval eger bir mantiksal operator 
        // ilk teriminden sonucu belli ediyorsa ikinci terime bakmaz. bu da eger ikinci terimde
        // run time error olusturabilecek bir unsur varsa belli bir sure kontrol edilmeden orada 
        // kalabilecegi anlamina gelir
        // ornegin
        // boolean t = (1>2) || (1/0 > 5); // burada ilk kosul dogru oldugundan ikinciye java bakmaz
        // ancak herhangi bir sekilde ilk kosul yanlis oldugunda program sekteye ugrar
        // ONEMLI: eger kodda hardcoded 0 varsa (runtimeda sifir olmasi beklenmeyen bir sifir)
        // o zaman uyari verir. syntax olarak 0a bolundugu barizse uyari var, degisken olmasi ihtimalse
        // yok


        // 34
        // de morgan yasasi der ki disaridaki not icerideki her seyi tersine cevirmek suretiyle dagitilir

        // 35
        // while (sart)
        // kod calisir

        // 36 for (baslangic; kosul; guncelle)
        // kosul gecersiz olana kadar calisir

        // 37 do
        // calis
        // while (sart)
        // while loop gibi ama her turlu en az 1 defa calisir kod

        // 38
        // nested iterativein esprisi bir isi baska bir tekrarli isin icinde birden cok 
        // kez yapmak istedigimizde kullanisli olmasi
        // mesela 1'den 10a kadar sayilar ve bu sayilarin her birinin 1'den 3e kadar olan sayilarla carpimini
        // bulmak icin 1 while 1 for veya 2 while veya 2 for kullanilabilir

        for (int u = 1; u<11; u++) {
            for (int v = 1; v<4; v++) {
                System.out.println(u*v);
            }
        }
    }
}
