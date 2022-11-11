package sisadmikmhs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sisadmikmhs.services.Administration;

public class Main {
    Scanner inp = new Scanner(System.in);
    String terpilih;
    String firstName, lastName, domicile, courseName;
    int cardIdentity, sks, totalSks, room;

    public void menu() {
        System.out.println("Welcome!");
        System.out.println("==================");
        System.out.println("");
        System.out.println("Please input one of menu below to continue:");
        System.out.println("1. Personal Data");
        System.out.println("2. Student Data");
        System.out.print("Your choice:");
        terpilih = inp.nextLine();
    }

    public void sks() {
        System.out.println("Plan Learning");
        System.out.println("==================");
        System.out.println("");
        System.out.println("Please choose one of menu to continue:");
        System.out.println("1. Plan Learning");
        System.out.print("Your choice:");
        terpilih = inp.nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Person person = new Person();
        Student student = new Student();
        Administration admin;
        List<Administration> plan = new ArrayList<>(); 

        do {
            main.menu();
            switch (main.terpilih) {
                case "1":
                    System.out.println("Personal Data:");
                    System.out.println("");
                    System.out.println("Input your first name:");
                    main.firstName = main.inp.nextLine();
                    System.out.println("Input your last name:");
                    main.lastName = main.inp.nextLine();
                    System.out.println("Input your domicile:");
                    main.domicile = main.inp.nextLine();

                    person = new Person(main.firstName, main.lastName, main.domicile);
                    person.getPerson();

                    break;

                case "2":
                    System.out.println("Student Data:");
                    System.out.println("");
                    System.out.println("Input your card identity:");
                    main.cardIdentity = main.inp.nextInt();

                    person.getPerson();
                    student = new Student(main.cardIdentity);
                    student.getStudent();

                    do {
                        main.sks();
                        switch (main.terpilih) {
                            case "1":
                                System.out.println("Plan Learning:");
                                System.out.println("");
                                System.out.println("Input your course name:");
                                main.courseName = main.inp.nextLine();
                                System.out.println("Input your sks:");
                                main.sks = main.inp.nextInt();
                                System.out.println("Input your course room:");
                                main.room = main.inp.nextInt();
                                // student.setCourseName(main.courseName);
                                // plan.set(0, student.setCourseName(););

                                break;

                            default:
                                System.out.println("Menu yang dipilih belum tersedia");
                                break;
                        }
                        System.out.println("Do you want to exit the application? (y/n)");
                        main.terpilih = main.inp.nextLine();
                    } while (main.terpilih.equalsIgnoreCase("n"));
                    System.out.println("You've been signed out..");
                    break;

                default:
                    System.out.println("Menu yang dipilih belum tersedia");
                    break;
            }
            System.out.println("Apakah anda ingin keluar aplikasi? (y/n)");
            main.terpilih = main.inp.nextLine();
        } while (main.terpilih.equalsIgnoreCase("n"));
        System.out.println("Anda telah keluar aplikasi, silakan masuk kembali..");
    }
}
