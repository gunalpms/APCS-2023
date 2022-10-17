public class scenariounit4 {

    public static void main(String[] args) {

        System.out.println("for");
        for (int i = 0; i < 10; i++) {
            // 10 defa calisir
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("while 1");
        int j = 0;
        while (j < 10) {
            // 10 defa calisir
            System.out.print(j + " ");
            j++;
        }
        System.out.println();
       
       
        System.out.println("while 2");
        j = 0;
        while (j < 10) {
            // 10 defa calisir ama 1den baslar 
            j++;
            System.out.print(j + " ");
        }
        System.out.println();
        
        
        System.out.println("ic ice donguler");

        for (int a = 0; a < 5; a++) { // dis dongu 5 defa calisir
            for (int b = 0; b < 7; b++) { // ic dongu 7 defa calisir
                System.out.print("ic dongu ");
            }
            System.out.println("dis dongu");
        }
        System.out.println();

        // while ile de ayni sekilde yapilabiliyor 
        // while kullanmanin esprisi maksimum kac kere donecegi belli olmayan dongulerde
        // belli bir kosul degisene kadar kullanabilmesi

        // mesela buna bir ornek bir stringin icindeki bir karakterin ilk indexi
        // bulunana kadar her indexe bakilmasi olabilir
        
    }    
}
