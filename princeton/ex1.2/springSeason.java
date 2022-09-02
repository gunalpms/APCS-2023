public class springSeason {

    public static void main(String[] args) {

        int d = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        boolean isSpring = false;

        if (m == 4 || m == 5) { isSpring = true; }

        else if (m == 3) {
            if (d>=20) { isSpring = true; }
        }

        else if (m == 6){
            if (d<=20) {isSpring = true; }
        }

        System.out.println(isSpring);
    }
}
