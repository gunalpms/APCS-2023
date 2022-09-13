public class uninit_var {

    public static void main(String[] args) {

        int a; // no error unless you try to use it 
        //System.out.println(a); // the local variable may not have been initialized

        // memory address of int is in the stack memory

        //String b; // no error unless you try to use it
        String c = new String(); // another example
        //System.out.println(b); // the local variable may not have been initialized
        System.out.println(c);

        // memory address of the String object is the same but 


    }
}