package persegipanjang;

public class persegi_panjang {
    public static void main(String[] args) {
        persegipanjang a = new persegipanjang();
        a.setPanjang (5);
        a.setLebar (5);
        System.out.println("Kelas utama : Persegi panjang");
        System.out.println("Panjang :" + a.getPanjang());
        System.out.println("Lebar :" + a.getLebar());
        System.out.println("Luas :" + a.Luas());
        System.out.println("");

        balok b = new balok();
        b.setPanjang(7);
        b.setLebar(5);
        b.setTinggi(3);
        System.out.println("Kelas turunan : Balok");
        System.out.println("Panjang :" + b.getPanjang());
        System.out.println("Lebar :" + b.getLebar());
        System.out.println("Tinggi :" + b.getTinggi());
        System.out.println("Volume :" + b.Volume());
        System.out.println("");
    }
}
