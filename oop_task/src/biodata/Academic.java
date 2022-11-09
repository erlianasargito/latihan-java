package biodata;

public class Academic {
    private String namaSD, namaSMP, namaSMA, namaUniversitas = "";

    public Academic(String namaSD, String namaSMP, String namaSMA, String namaUniversitas){
        this.namaSD = namaSD;
        this.namaSMP = namaSMP;
        this.namaSMA = namaSMA;
        this.namaUniversitas = namaUniversitas;
    }

    //methods
    public void setNamaSD(String sd) {
        this.namaSD = sd;
    }

    public void setNamaSMP(String smp) {
        this.namaSMP = smp;
    }
    
    public void setNamaSMA(String sma) {
        this.namaSMA = sma;
    }

    public void setNamaUniversitas(String univ) {
        this.namaUniversitas = univ;
    }

    public String getNamaSD(String namaSD) {
        return this.namaSD;
    }

    public String getNamaSMP(String namaSMP) {
        return this.namaSMP;
    }

    public String getNamaSMA(String namaSMA) {
        return this.namaSMA;
    }

    public String getNamaUniversitas(String namaUniversitas) {
        return this.namaUniversitas;
    }

    public String getAcademicHistory() {
        return this.namaSD + ", " + this.namaSMP + ", " + this.namaSMA + ", " + this.namaUniversitas;
    }

    public void getAcademic() {
        System.out.println("Riwayat Pendidikan");
        System.out.println("================");
        System.out.println("Riwayat Pendidikan: " + getAcademicHistory());
    }
}
