public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("Mia");    // firstName is set to John
        person.setAge(2);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Luna");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }

/*  Expected Result
    fullName=
    teen= false
    fullName= Mia
    teen= true
    fullName= Mia Lina*/

}
