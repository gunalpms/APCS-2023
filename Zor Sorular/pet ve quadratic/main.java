public class main {
    public static void main(String[] args) {
    
        Pet muhammed = new Pet("muhammed", "cat");
        muhammed.printTypeInfo();
        Pet ahmad = new Pet("ahmad", "dog");
        ahmad.printTypeInfo();
        Pet.printPetNumbers();
        Pet.Greeting();

        Quadratic solver = new Quadratic(1, -7, 9);
        System.out.println(solver.solveEquation());

    }
}
