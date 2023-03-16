public class inheritance_types {

    public static void main(String[] args) {

        superclass sup = new superclass(5);
        superclass sub = new subclass(10, 15);

        sup.printer("deneme");
        System.out.println(sup.getint());

        sub.printer("deneme");
        System.out.println(sub.getint()); 
        // NOT DEFINED FOR TYPE superclass System.out.println(sub.getsuperint()); 
        System.out.println(((subclass)sub).getsuperint());
        
    }
    
}

class superclass {

    int superint;

    public superclass(int a) {
        this.superint = a;
    }

    public void setint(int a) {
        this.superint = a;
    }
    
    public int getint() {
        return superint;
    }

    public void printer(String s) {
        System.out.println(s + " printed from superclass");
    }


}


class subclass extends superclass {

    int subint;

    public subclass (int a, int b) {
        super(a);
        this.subint = b;
    }

    public void setint(int a) {
        super.setint(a);
    }

    public int getsuperint() {
        return super.getint();
    }

    public int getint() {
        return subint;
    }

    public void printer(String s) {
        System.out.println(s + " printed from subclass");
    }


}