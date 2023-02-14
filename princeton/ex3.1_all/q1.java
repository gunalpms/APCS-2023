public class q1 {

    // this program outputs a reversed string
    public static void main(String[] args) {
        
        // Takes the string from the args
        String s = args[0];
        String ans = "";
        int len = s.length();

        // takes every character beginning from the end of the source string and appends it to the target 
        for(int i = len-1; i>=0; i--) {
            ans += s.charAt(i);
        }

        System.out.println(ans);
    }
}