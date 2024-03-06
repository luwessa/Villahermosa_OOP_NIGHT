package villahermosa;

public class Villahermosa {
    private String firstName;
    private String lastName;
    private int age;
    private boolean minor;

    public Villahermosa() {
    }

    public Villahermosa(String firstName, String lastName, int age, boolean minor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.minor = minor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMinor() {
        return minor;
    }

    public void setMinor(boolean minor) {
        this.minor = minor;
    }
    public void increaseAge(){
        age++;
        minor = age < 18;
    }
    public String toString(){
        String status = minor ? "minor" : "adult";
        return lastName + ", " + firstName + " - " + age + " - " + status;
    }
}
