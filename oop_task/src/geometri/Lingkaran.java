package geometri;

public class Lingkaran {
    private double jarijari;

    public Lingkaran(){}
    
    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public void setJariJari(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getLuasLingkaran() {
        return  3.14 * this.jarijari * this.jarijari; 
    }

    public double getKelilingLingkaran() {
        return 3.14 * this.jarijari * 2;
    }

    public void getLingkaran() {
        System.out.println("Hasil luas dan keliling lingkaran");
        System.out.println("==================================");
        System.out.println("Luas lingkaran: " + getLuasLingkaran());
        System.out.println("Keliling lingkaran: " + getKelilingLingkaran());
    }
}
