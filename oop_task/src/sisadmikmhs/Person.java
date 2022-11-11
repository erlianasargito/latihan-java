package sisadmikmhs;

public class Person {
    private String firstName, lastName, domicile = "";
    //private (private udah termasuk encapsulation krn tidak bisa sembarangan diakses)

    public Person() {

    }

    public Person(String domicile) {
        this.domicile = domicile;
    }
    
    public Person(String firstName, String lastName, String domicile){
        this.firstName = firstName;
        this.lastName = lastName;
        this.domicile = domicile;
    }

    //methods
    public void setFirstName(String first) {
        this.firstName = first;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }
    
    public void setDomicile(String region) {
        this.domicile = region;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getDomicile() {
        return this.domicile;
    }

    public void getPerson() {
        System.out.println("Welcome, " + getFullName() + " from " + getDomicile());
    }
}
