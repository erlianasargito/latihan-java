package sisadmikmhs;

import sisadmikmhs.services.Administration;

public class Student extends Person implements Administration {
    private int cardIdentity, sks;
    private String courseName, room;
    //private (private udah termasuk encapsulation krn tidak bisa sembarangan diakses)

    public Student() {

    }
    
    public Student(int cardIdentity){
        this.cardIdentity = cardIdentity;
    }

    public Student(String domicile, String courseName, int sks, String room){
        super(domicile);
        this.courseName = courseName;
        this.sks = sks;
        this.room = room;
    }

    //methods
    public void setCardIdentity(int cardIdentity) {
        this.cardIdentity = cardIdentity;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setSKS(int sks) {
        this.sks = sks;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getFullName() {
        return super.getFullName();
    }

    public int getCardIdentity() {
        return this.cardIdentity;
    }

    public void getStudent() {
        System.out.println("Your id: " + getCardIdentity());
    }

    public String getCourseName(){
        return this.courseName;
    }

    public int getSks(){
        return this.sks =+ this.sks;
    }

    public String getRoom(){
        return this.room;
    }

    @Override
    public void learningPlan(String courseName, int sks, String room) {
        // TODO Auto-generated method stub
        System.out.println("Your course name: " + getCourseName());
        System.out.println("Your currently SKS in total: " + getSks());
        System.out.println("Your course room: " + getRoom());
    }

    public String result() {
        return "Your course name: " + getCourseName() + "Your currently SKS in total: " + getSks() +  "Your course room: " + getRoom();
    }
}