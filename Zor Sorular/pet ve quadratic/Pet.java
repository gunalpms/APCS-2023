public class Pet {
    private String name;
    private String type;
    private static int numCats; // kedi kopek ve diger tur sayisi class ozelligi oldugundan static tuttum
    private static int numDogs;
    private static int numOtherPets;

    public Pet(String n, String t) {
        t = t.toLowerCase(); // case olaylarindan hic hoslanmam
        name = n;
        type = t;

        if (t.equals("cat")) {numCats++;}
        else if (t.equals("dog")) {numDogs++;}
        else {numOtherPets++;}
    }
    // alttaki 3 fonksiyon instancelarla isi olmadigi icin staticler
    public static void Greeting() {
        System.out.println("Welcome to the pet object class (?)");
    }

    private static int totalNumPets() { // toplam evcil hayvan sayisini verir
        return numCats + numDogs + numOtherPets;
    }

    public static void printPetNumbers() { // her turden ne kadar oldugunu ve toplam ne kadar hayvan oldugunu terminale yazar
        System.out.println("Number of dogs: " + numDogs + 
        " Number of cats: " + numCats + " Number of other pets: " + numOtherPets
        + " Total number of pets: " + totalNumPets());
    }
    // her bir pet objesi icin ismi, turu ve o turden kac uyesinin oldugunu terminale yazan bir fonksiyon
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
