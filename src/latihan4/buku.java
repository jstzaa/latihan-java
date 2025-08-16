package latihan4;

public class buku {
    public String jdlBk;
    public String pngrg;
    public String jjgKls;
    public int jmlHlm;
    public int thnTrbt;

    public void tampilJdlBk(){
        System.out.println("judul buku: " + this.jdlBk);
    }
    public void tampilPngrg(){
        System.out.println("pengarang: " + this.pngrg);
    }
    public void tampilJjgKls(){
        System.out.println("jenjang kelas: " + this.jjgKls);
    }
    public void tampilJmlHlm(){
        System.out.println("jumlah halaman: " + this.jmlHlm);
    }
    public void tampilThnTrbt(){
        System.out.println("tahun terbit: " + this.thnTrbt);
        System.out.println(" ");
    }
}
