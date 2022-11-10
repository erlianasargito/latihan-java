package biodata;

import java.util.Scanner;

public class Main {
    Scanner inp = new Scanner(System.in);
    String terpilih;
    String firstName, lastName, domicile;
    int birthYear = 0;
    String namaSD, namaSMP, namaSMA, namaUniversitas;
    String tamat;

    public void menu() {
        System.out.println("Selamat Datang di Pusat Data Online");
        System.out.println("====================================");
        System.out.println("");
        System.out.println("Silakan input menu untuk melanjutkan:");
        System.out.println("1. Input data pribadi");
        System.out.println("2. Input data pendidikan");
        System.out.println("3. Menampilkan data pribadi");
        System.out.println("4. Menampilkan data pendidikan");
        System.out.println("5. Menampilkan data keseluruhan");
        System.out.println("Menu yang dipilih:");
        terpilih = inp.nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Person person = new Person();
        Academic academic = new Academic();

        do {
            main.menu();
            switch (main.terpilih) {
                case "1":
                    System.out.println("Input data pribadi");
                    System.out.println("");
                    System.out.println("Masukkan Nama Depan:");
                    main.firstName = main.inp.nextLine();
                    System.out.println("Masukkan Nama Belakang:");
                    main.lastName = main.inp.nextLine();
                    System.out.println("Masukkan Domisili:");
                    main.domicile = main.inp.nextLine();
                    System.out.println("Masukkan Tahun Lahir:");
                    main.birthYear = main.inp.nextInt();

                    System.out.println("Data berhasil tersimpan!");
                    main.inp.nextLine();
                    break;

                case "2":
                    System.out.println("Input data pendidikan");
                    System.out.println("");
                    System.out.println("Apakah anda telah tamat SD? (y/n)");
                    main.tamat = main.inp.nextLine();
                    if (main.tamat.equals("y")) {
                        System.out.println("Masukkan Nama SD:");
                        main.namaSD = main.inp.nextLine();
                        System.out.println("Apakah anda telah tamat SMP? (y/n)");
                        main.tamat = main.inp.nextLine();
                        if (main.tamat.equals("y")) {
                            System.out.println("Masukkan Nama SMP:");
                            main.namaSMP = main.inp.nextLine();
                            System.out.println("Apakah anda telah tamat SMA? (y/n)");
                            main.tamat = main.inp.nextLine();
                            if (main.tamat.equals("y")) {
                                System.out.println("Masukkan Nama SMA:");
                                main.namaSMA = main.inp.nextLine();
                                System.out.println("Apakah anda telah tamat universitas? (y/n)");
                                main.tamat = main.inp.nextLine();
                                if (main.tamat.equals("y")) {
                                    System.out.println("Masukkan Nama Universitas:");
                                    main.namaUniversitas = main.inp.nextLine();
                                }
                            }
                        }
                    } else {
                        System.out.println("Anda belum berhasil menambahkan data pendidikan");
                    }
                    System.out.println("Data pendidikan berhasil tersimpan!");
                    break;

                case "3":
                    System.out.println("Menampilkan data pribadi");
                    // person.setFirstName(main.firstName);
                    person = new Person(main.firstName, main.lastName, main.domicile, main.birthYear);
                    person.getPerson();
                    break;

                case "4":
                    System.out.println("Menampilkan riwayat pendidikan");
                    academic = new Academic(main.namaSD, main.namaSMP, main.namaSMA, main.namaUniversitas);
                    academic.getAcademic();
                    break;

                case "5":
                    System.out.println("Menampilkan data keseluruhan");
                    person.getPerson();
                    academic.getAcademic();
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
