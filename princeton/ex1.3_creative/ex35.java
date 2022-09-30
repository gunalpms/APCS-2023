import java.util.Scanner;

public class ex35{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.close();
        int b = a;  // a degisecek o yuzden yazdirmak icin b yarattim
        int s = 0; // basamak toplamlari

        for (int i = 2; i<=10; i++) { // i burada carpan oluyor ayni zamanda 9 basamaga iterator
            int d = a % 10; // 10dan kalani 
            s = s + i * d; // s degiskenine katsayisiyla carpilip ekleniyor
            a = a / 10; // son basamagi atiyoruz
        }
        
        System.out.print(b);
        if (s % 11 == 1) { System.out.println("X");} // 10 ise X diye gosteriliyormus
        else if (s % 11 == 0) { System.out.println("0");} // 11e zaten bolunuyorsa checksum 
        else { System.out.println(11 - (s % 11)); } // 11e bolunmesi icin tamamlanacak sayi hesaplaniyor
        // 11 - kalan cunku kalan 4 ise 7 eklememiz lazim vs mantigindan

    }
}