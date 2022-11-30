public class People {

    private String firstName;
    private String lastName;
    private int age;
    // default constructor isim, soyisim ve yaş bilgilerini boş string / 0 olarak yaratır 
    public People() {

        firstName = "";
        lastName = "";
        age = 0;
    }

    public People(String fn, String ln, int a) {

        firstName = fn;
        lastName = ln;
        age = a;
    }

    public void changeAge(int newAge) {
        age = newAge;
    }
    // incAge metodu overloading'e maruz kalmıştır, ama argüman almadığında incAge(1) gibi davrandığını söylemek mümkündür.
    public void incAge() {
        age++;
    }

    public void incAge(int years) {
        age += years;
    }
    // main'de olduğu gibi isimsiz (defaulttan) bir people objesi yaratılırsa bu fonksiyonlarla isimlendirilebilir
    public void changeFirstName(String newFirstName) {
        firstName = newFirstName;
    }

    public void changeLastName(String newLastName) {
        lastName = newLastName;
    }

    public String returnFirstName() {
        return firstName;
    }

    public String returnLastName() {
        return lastName;
    }

    public int returnAge() {
        return age;
    }

    public boolean canDrive() {
        if (age >= 16) return true;
        else return false;
    }

    public String getLicense() {
        if (canDrive()) { // yani burada buna ne kadar gerek var bilmiyorum ama örnekte böyleydi
            return (firstName + " " + lastName + ", You can get your driver's license");
        }
        else {
           return (firstName + " " + lastName + ", You are not eligible to apply for a driver's license");
        }
    }

    public boolean sameFirstName(People other) {
        if (firstName.equals(other.returnFirstName())) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean sameLastName(People other) {
        if (lastName.equals(other.returnLastName())) {
            return true;
        }
        else {
            return false;
        }
    }
    // burada yaşı da hesaba katıyor muyduk hatırlamadım. senaryoda yaş yoktu ama yaşın katılmaması bence mantıksız
    public String dups(People other) { // burada doğrudan objenin fieldlarına erişim sağlayabiliriz sanırım bazı dillerde self keywordü gerekiyor bunun için
        if (firstName.equals(other.returnFirstName()) && lastName.equals(other.returnLastName())) {
            return (firstName + " " + lastName + " and " + other.returnFirstName() + " " + other.returnLastName() + " are duplicates.");
        }
        else {
            return (firstName + " " + lastName + " and " + other.returnFirstName() + " " + other.returnLastName() + " are NOT duplicates.");
        }

    }
}
