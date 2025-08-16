package persegipanjang;

public class balok extends persegipanjang {
    private int tinggi;
    public void setTinggi (int t){
        tinggi = t;
    }
    public int getTinggi(){
        return tinggi;
    }
    public int Volume(){
        int v = getPanjang()*getLebar()*tinggi;
        return v;
    }
}
