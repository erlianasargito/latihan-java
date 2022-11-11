package geometri;

import geometri.services.BangunDatarService;

public class Lingkaran implements BangunDatarService {
    private double jarijari;

    public Lingkaran(){}
    
    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public void setJariJari(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getJarijari() {
        return this.jarijari;
    }

    public void menggambarBangun(){
        System.out.println("BANGUN LINGKARAN");
    }

    public void karakteristikBangunan() {
        System.out.println("Karakteristik: Memiliki sudut 180 derajat, memiliki diameter dan jari-jari");
    }

    public double hitungLuasLingkaran(double jarijari) {

        return 3.14 * this.jarijari * this.jarijari;
    }

    public double hitungKelilingLingkaran(double jarijari) {

        return 3.14 * this.jarijari * 2;
    }

    // public double getLuasLingkaran() {
    //     return  3.14 * this.jarijari * this.jarijari; 
    // }

    // public double getKelilingLingkaran() {
    //     return 3.14 * this.jarijari * 2;
    // }

    public void getLingkaran() {
        //declare di sini karena kalau di sout, abstract methods tidak bisa digunakan untuk arguments
        double luasLingkaran = hitungLuasLingkaran(getJarijari());
        double kelilingLingkaran = hitungKelilingLingkaran(getJarijari());

        System.out.println("Hasil luas dan keliling lingkaran");
        System.out.println("==================================");
        karakteristikBangunan();
        System.out.println("Luas lingkaran: " + luasLingkaran);
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
    }
}
