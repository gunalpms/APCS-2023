public class q31creative {

    public static void main(String[] args) {
        
        String key1 = "T H E Q U I C K B R O W N";
        String key2 = "F X J M P S V L A Z Y D G";

        String source = "SEDAT YALCIN";
        String target = "";

        // for every character
        for (int i = 0; i<source.length(); i++) {
            
            String c = Character.toString(source.charAt(i));
            // if the character exists in the first key add the same index in the second key to the target
            if (key1.indexOf(c) > -1) {
                target += key2.charAt(key1.indexOf(c));
            }
            // if it exists in the second key add the same index in the first key to the target
            else if (key2.indexOf(c) > -1) {
                target += key1.charAt(key2.indexOf(c));
            }
            
            // if such a key exists that neither key contains it then insert space
            else {
                target += " ";
            }

        }

        System.out.println(target);
    }
    
}
