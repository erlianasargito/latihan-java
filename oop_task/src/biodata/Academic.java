package biodata;

public class Academic {
    private String namaSD, namaSMP, namaSMA, namaUniversitas = "";

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

    public String getAcademicHistory() {
        return this.namaSD + ", " + this.namaSMP + ", " + this.namaSMA + ", " + this.namaUniversitas;
    }

    public void getPerson() {
        System.out.println("Biodata Pribadi");
        System.out.println("================");
        System.out.println("Riwayat Pendidikan: " + getAcademicHistory());
    }
}
