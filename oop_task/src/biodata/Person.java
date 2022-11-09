package biodata;

public class Person {
    private String firstName, lastName, domicile = "";
    int birthYear = 0;
    int currentYear = 2022;

    public Person(String firstName, String lastName, String domicile, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.domicile = domicile;
        this.birthYear = birthYear;
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

    public void setBirthYear(int year) {
        this.birthYear = year;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getDomicile() {
        return this.domicile;
    }

    public int getUsia() {
        return currentYear - this.birthYear;
    }

    public void getPerson() {
        System.out.println("Biodata Pribadi");
        System.out.println("================");
        System.out.println("Nama Lengkap: " + getFullName());
        System.out.println("Domisili: " + getDomicile());
        System.out.println("Usia: " + getUsia());
    }


}
