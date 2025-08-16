package latihan4;

public class main {
    public static void main(String[] args) {
        buku1 bk1 = new buku1();
        bk1.jdlBk = "Teknologi Jaringan Berbasis Luas";
        bk1.pngrg = "Rudi Setiawan";
        bk1.jjgKls = "XI Program Keahlian RPL";
        bk1.jmlHlm = 320;
        bk1.thnTrbt = 2018;
        bk1.tampilData();
        bk1.tampilJdlBk();
        bk1.tampilPngrg();
        bk1.tampilJjgKls();
        bk1.tampilJmlHlm();
        bk1.tampilThnTrbt();

        buku2 bk2 = new buku2();
        bk2.jdlBk = "Pendidikan Kewarganegaraan";
        bk2.pngrg = "Istiana Nen Arienti";
        bk2.jjgKls = "XI SMA/SMK/MA";
        bk2.jmlHlm = 312;
        bk2.thnTrbt = 2018;
        bk2.tampilData();
        bk2.tampilJdlBk();
        bk2.tampilPngrg();
        bk2.tampilJjgKls();
        bk2.tampilJmlHlm();
        bk2.tampilThnTrbt();
    }
}
