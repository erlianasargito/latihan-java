package hitungbangun;

public class Segitiga {
    private double alas, tinggi, sisi;

    public Segitiga(){}
    
    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setSisi1(double one) {
        this.alas = one;
    }

    public void setSisi2(double two) {
        this.tinggi = two;
    }

    public double getAlas() {
        return this.alas;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public void setSisi3(double three) {
        this.sisi = three;
    }

    public double getLuasSegitiga() {
        return  0.5 * this.alas * this.tinggi; 
    }

    public double getKelilingSegitiga() {
        return alas + tinggi + sisi;
    }

    public void getSegitiga() {
        System.out.println("Hasil luas dan keliling segitiga");
        System.out.println("==================================");
        System.out.println("Luas segitiga: " + getLuasSegitiga());
        System.out.println("Keliling segitiga: " + getKelilingSegitiga());
    }
}
