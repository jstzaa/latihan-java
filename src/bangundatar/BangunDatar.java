package bangundatar;
public class BangunDatar {
    float luas() {
        System.out.println("Menghitung luas bangun datar");
        return 0;
    }
    float kll() {
        System.out.println("Menghitung keliling bangun datar");
        return 0;
    }

    public static void main (String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        Persegi persegi = new Persegi();
        persegi.sisi = 4;

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 15;

        Segitiga segitiga = new Segitiga();
        segitiga.a = 5;
        segitiga.t = 10;
        segitiga.s = 5;
        
        bangunDatar.luas();
        persegi.luas();
        lingkaran.luas();
        segitiga.luas();
        
        bangunDatar.kll();
        persegi.kll();
        lingkaran.kll();
        segitiga.kll();
    }
}