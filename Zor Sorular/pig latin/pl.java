import java.util.*;
public class pl  {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        a = a.toLowerCase();
        
        String[] words = a.split(" ");
        String[] converted = new String[words.length]; // array with same length as amount of words

        String vrgx = "(a|e|i|o|u).*"; // regex to match vowels
        String crgx = "(b|c|d|f|g|h|j|k|l|m|n|p|r|s|t|v|y|z|q|x|w)"; // regex to match consonants 

        for (int i = 0; i <words.length; i++) { // for every word in our list
            if (words[i].substring(0, 1).matches(vrgx)) { // checks if first char matches a vowel
                converted[i] = words[i] + "way"; // if true, then adds way at the end of the word
            }

            else if (words[i].substring(0, 1).matches(crgx)) { // if it starts with a consonant
                
                if (words[i].substring(1, 2).matches(crgx)) { // if second letter is a consonant
                    // first 2 letters are moved to the end and then ay is added
                    converted[i] = words[i].substring(2) + words[i].substring(0, 2) + "ay";                
                } 
                else { // if second letter is a vowel
                    // first letter is moved to the end and then ay is added
                    converted[i] = words[i].substring(1) + words[i].substring(0 ,1) + "ay";
                }
            }
        }        
        for (int x = 0; x <converted.length; x++) { // for every element in the converted list
            System.out.print(converted[x] + " "); // print the converted word and a space 
        }
    }
}