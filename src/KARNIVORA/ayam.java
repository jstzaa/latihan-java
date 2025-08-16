package KARNIVORA;

public class ayam extends HEWAN {
    @Override
    void setNama () {
        String ayam = "Jalu";
        System.out.println("Nama Ayam : " + ayam);
    }

    @Override 
    void setSuara () {
        String suara = "kukurunyuk";
        System.out.println("Suara Ayam : " + suara);
    }

    @Override
    void setJmlKaki () {
        double kaki = 2;
        System.out.println("Jumlah Kaki : " + kaki);
    }
}
