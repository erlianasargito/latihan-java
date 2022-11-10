package hitungbangun;

public class Persegi {
    private double sisi;

    public Persegi(){}
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuasPersegi() {
        return  this.sisi * this.sisi; 
    }

    public double getKelilingSegitiga() {
        return 4 * sisi;
    }

    public void getPersegi() {
        System.out.println("Hasil luas dan keliling segitiga");
        System.out.println("==================================");
        System.out.println("Luas segitiga: " + getLuasPersegi());
        System.out.println("Keliling segitiga: " + getKelilingSegitiga());
    }
}
