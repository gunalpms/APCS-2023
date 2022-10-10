public class ex6 {

    public static void main(String[] args) {
        
        double r = Math.random();

        // gelisiguzel degerin dusecegi araligi 8 birime bolsek 3 birime dusuyorsa 
        // 6 digerlerinden birine dusuyorsa da herhangi bir sayiyi printliyor
        if (r > 5.0/8.0) System.out.println(6);

        else if (r > 4.0/8.0 && r < 5.0/8.0) System.out.println(5);

        else if (r > 3.0/8.0 && r < 4.0/8.0) System.out.println(4);

        else if (r > 2.0/8.0 && r < 3.0/8.0) System.out.println(3);

        else if (r > 1.0/8.0 && r < 2.0/8.0) System.out.println(2);

        else System.out.println(1);
        
    }    
}
