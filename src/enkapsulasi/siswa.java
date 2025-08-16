package enkapsulasi;

public class siswa {
    private String Kelas;
    private String Mapel;
    private String Nama;
    private String NIS;

    public void setKelas (String newValue) {
        Kelas = newValue;
    }
    public void setMapel (String newValue) {
        Mapel = newValue;
    }
    public void setNama (String newValue) {
        Nama = newValue;
    }
    public void setNIS (String newValue) {
        NIS = newValue;
    }
    public String getKelas(){
        return Kelas;
    }
    public String getMapel(){
        return Mapel;
    }
    public String getNama(){
        return Nama;
    }
    public String getNIS(){
        return NIS;
    }
}
