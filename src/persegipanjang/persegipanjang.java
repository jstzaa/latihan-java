package persegipanjang;

public class persegipanjang {
    private int panjang;
    private int lebar;
    public void setPanjang(int p){
        panjang = p;
    }
    public void setLebar(int l){
        lebar = l;
    }
    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }
    public int Luas(){
        int luas = panjang * lebar;
        return luas;
    }
}
