public class dragonCurves {

    public static void main(String[] args){

// First instruction has to be F
// Then, for instruction n all you need to to is put instruction n-1, an F in the middle and 
// instruction n-1 reversed (For that you need to put an R instead of an L)

// So for example in order 2, it is order 1 (FLF) + F + order 1 reversed (FRF)
// Therefore order 2 is FLFLFRF

        String d0 = "F";
        String r0 = "F";

        String d1 = d0 + "L" + r0;
        String r1 = d0 + "R" + r0;

        String d2 = d1 + "L" + r1;
        String r2 = d1 + "R" + r1;

        String d3 = d2 + "L" + r2;
        String r3 = d2 + "R" + r2;

        String d4 = d3 + "L" + r3;
        String r4 = d3 + "R" + r3;

        String d5 = d4 + "L" + r4;
        String r5 = d4 + "R" + r4;

        System.out.println(d0);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);

    }
    
}
