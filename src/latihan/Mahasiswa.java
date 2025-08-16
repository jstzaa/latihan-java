package latihan;

public class Mahasiswa {
    private String nama;
    private int nomorID;
    private Jurusan jurusan;
    private String alamat;
    private int nomorTLP;

    public Mahasiswa(String nama, int nomorID, String alamat, int nomorTLP){
        this.nama = nama;
        this.nomorID = nomorID;
        this.alamat = alamat;
        this.nomorTLP = nomorTLP;
        jurusan = null;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getNomorID(){
        return nomorID;
    }
    public void setNomorID(int nomorID){
        this.nomorID = nomorID;
    }
    public void setJurusan(Jurusan jurusan){
        this.jurusan = jurusan;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public int getNomorTLP(){
        return nomorTLP;
    }
    public void setNomorTLP(int nomorTLP){
        this.nomorTLP = nomorTLP;
    }
}
