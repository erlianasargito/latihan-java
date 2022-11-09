package biodata;

public class Person {
    private String firstName, lastName, domicile, birthYear = "";

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

    public void setBirthYear(String year) {
        this.birthYear = year;
    }


}
