public class Person {

    private String firstName;
    private String lastName;
    private int age;

    //== public methods

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    public String getFullName() {

        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty() || lastName.isEmpty()) {
            return firstName.isEmpty() ? lastName : firstName;
        }

        return firstName + " " + lastName;
    }

    //== getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
