package latihan2;

public class kendaraan {
    String Merek;
    int kecepatan;
    String Jenis;

    void Melaju (int kecepatan){
        this.kecepatan = kecepatan;
        System.out.println("===== Melaju =====");
        System.out.println("Kecepatan: " + kecepatan + "Km/Jam");
    }
    //method untuk mengubah atau memberi nilai merk
    void setAtribut (String Merek, String Jenis){
        this.Merek = Merek;
        this.Jenis = Jenis;
    }
    //get untuk mengambil nilai
    String getMerek(){
        return Merek;
    }
    String getJenis(){
        return Jenis;
    }
}
