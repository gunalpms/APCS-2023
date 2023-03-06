public class Main {

    public static void main(String[] args) {
        
        Cipher c = new Cipher(6, 2);
        String e = c.encryptMessage("We sing to thee De Pere, our school, our alma mater.");
        System.out.println(e); 
    }
}