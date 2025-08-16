package KARNIVORA;

public class kucing extends HEWAN {
    @Override
    void setNama () {
        String kucing = "Monie";
        System.out.println("Nama Kucing : " + kucing);
    }

    @Override 
    void setSuara () {
        String suara = "miaw";
        System.out.println("Suara Kucing : " + suara);
    }

    @Override
    void setJmlKaki () {
        double kaki = 4;
        System.out.println("Jumlah Kaki : " + kaki);
    }
}
