public class Pet {
    private String name;
    private String type;
    private static int numCats;
    private static int numDogs;
    private static int numOtherPets;

    public Pet(String n, String t) {
        t = t.toLowerCase();
        name = n;
        type = t;

        if (t.equals("cat")) {numCats++;}
        else if (t.equals("dog")) {numDogs++;}
        else {numOtherPets++;}
    }

    public static void Greeting() {
        System.out.println("Welcome to the pet object class (?)");
    }

    private static int totalNumPets() {
        return numCats + numDogs + numOtherPets;
    }

    public static void printPetNumbers() {
        System.out.println("Number of dogs: " + numDogs + 
        " Number of cats: " + numCats + " Number of other pets: " + numOtherPets
        + " Total number of pets: " + totalNumPets());
    }
    public void printTypeInfo() {
        System.out.print("The name of this pet is " + name + ", ");
        if (type.equals("cat")) 
        {System.out.println(" and its type is " + type + " and the number of cats is " + numCats) ;}
        else if (type.equals("dog")) 
        {System.out.println(" and its type is " + type + " and the number of dogs is " + numDogs) ;}
        else
        {System.out.println(" and its type is other and the number of other pets is " + numOtherPets) ;}
    } 

}
