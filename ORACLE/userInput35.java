import javax.swing.JOptionPane;
import java.util.Scanner;

public class userInput35 {

    public static void main(String[] args) {
        
        // exercise 1 icin java dialog box kullanarak aldigimiz stringi tek satirda inte cevirip
        // bir fazlasini yazmamiz gerekiyor
        System.out.println(Integer.parseInt(JOptionPane.showInputDialog("give me an input"))+1);
        
        // ozel bir mesaj diyalogu yaratmamiz istenmis

        String input = (String)JOptionPane.showInputDialog(null, "selam?", 
                    "naber", 2, null, null, "iyiyim");
    
        System.out.println(input);

        // scanner yaratmamiz istenmis 

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();
        System.out.println(x+y+z);

        // input4.java elimde yok o yuzden inceleyemiyorum
    
    }

    
}
