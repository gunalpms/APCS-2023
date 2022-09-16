// kedi objesi yaratarak constructor, method, attirbute nasil calisir gorecegiz

public class exitClass {

    public static void main(String[] args) {
        
        System.out.println("Class example");
    }

    public class kedi {

        private int yas;
        private int kilo;
        private String isim;

        public kedi() {
            yas = 0; // birtakim attributelarin standart degeri
            kilo = 0;
            isim = "kilcik";
        }

        public kedi(int y, int k, String i) { // paremetreye gore bu attributelarin verilmesi
            yas = y;
            kilo = k;
            isim = i;
        }

        private void zipla(double m) {
            // kediyi m metre kadar ziplat
        }

        private void miyavla(double db) {
            // kediyi db siddetinde miyavlat
        }

        private boolean uyuyorMu() {
            // kedinin uyuyup uyumadigini kontrol etmek icin birtakip operasyonlar yap
            // mesela nabzina bak, gozu kapali / acik vs.
            return false;
        }       
    } // kedi bitis
    
    kedi misty = new kedi(); // instance yaratildi
}
