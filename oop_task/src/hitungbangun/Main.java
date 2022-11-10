package hitungbangun;

import java.util.Scanner;

public class Main {
    Scanner inp = new Scanner(System.in);
    String terpilih;
    double alas, tinggi, sisi;
    double jarijari;
    double tprisma;

    public void menu() {
        System.out.println("Hitung Bangunan");
        System.out.println("==================");
        System.out.println("");
        System.out.println("Silakan input menu untuk melanjutkan:");
        System.out.println("1. Hitung luas dan keliling bangun datar Segitiga");
        System.out.println("2. Hitung luas dan keliling bangun datar Lingkaran");
        System.out.println("3. Hitung luas dan keliling bangun datar Persegi");
        System.out.println("4. Hitung volume bangun ruang Prisma");
        System.out.println("5. Hitung volume bangun ruang Bola");
        System.out.println("6. Hitung volume bangun ruang Kubus");
        System.out.print("Menu yang dipilih:");
        terpilih = inp.nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();
        Persegi persegi = new Persegi();
        Prisma prisma = new Prisma();

        do {
            main.menu();
            switch (main.terpilih) {
                case "1":
                    System.out.println("Hitung luas & keliling segitiga");
                    System.out.println("");
                    System.out.println("Masukkan alas:");
                    main.alas = main.inp.nextInt();
                    System.out.println("Masukkan tinggi:");
                    main.tinggi = main.inp.nextInt();
                    System.out.println("Masukkan sisi:");
                    main.sisi = main.inp.nextInt();
                    main.inp.nextLine();

                    segitiga = new Segitiga(main.alas, main.tinggi, main.sisi);
                    segitiga.getSegitiga();

                    break;

                case "2":
                    System.out.println("Hitung luas & keliling segitiga");
                    System.out.println("");
                    System.out.println("Masukkan jari-jari:");
                    main.jarijari = main.inp.nextInt();
                    main.inp.nextLine();

                    lingkaran = new Lingkaran(main.jarijari);
                    lingkaran.getLingkaran();

                    break;

                case "3":
                    System.out.println("Hitung luas & keliling persegi");
                    System.out.println("");
                    System.out.println("Masukkan sisi:");
                    main.sisi = main.inp.nextInt();
                    main.inp.nextLine();

                    persegi = new Persegi(main.sisi);
                    persegi.getPersegi();

                    break;

                case "4":
                    System.out.println("Hitung luas & keliling prisma");
                    System.out.println("");
                    System.out.println("Masukkan alas:");
                    main.alas = main.inp.nextInt();
                    System.out.println("Masukkan tinggi:");
                    main.tinggi = main.inp.nextInt();
                    System.out.println("Masukkan tinggi prisma:");
                    main.tprisma = main.inp.nextInt();
                    main.inp.nextLine();

                    prisma = new Prisma(main.alas, main.tinggi, main.tprisma);
                    prisma.getSegitiga();

                    break;

                case "5":
                    System.out.println("Hitung luas & keliling segitiga");
                    System.out.println("");
                    System.out.println("Masukkan jari-jari:");
                    main.alas = main.inp.nextInt();
                    main.inp.nextLine();

                    lingkaran = new Lingkaran(main.jarijari);
                    lingkaran.getLingkaran();

                    break;

                case "6":
                    System.out.println("Hitung luas & keliling segitiga");
                    System.out.println("");
                    System.out.println("Masukkan jari-jari:");
                    main.alas = main.inp.nextInt();
                    main.inp.nextLine();

                    lingkaran = new Lingkaran(main.jarijari);
                    lingkaran.getLingkaran();

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
