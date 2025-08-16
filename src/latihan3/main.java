package latihan3;

public class main {
    public static void main(String[] args) {
        kendaraan kndrn1 = new kendaraan();
        kndrn1.Nama = "Suzuki APV";
        kndrn1.jmlRoda = 4;
        kndrn1.jmlSeat = 8;
        kndrn1.tampilJmlRoda();
        kndrn1.tampilJmlSeat();

        keretaApi kndrn2 = new keretaApi();
        kndrn2.Nama = "KA SANCAKA";
        kndrn2.jmlRoda = 200;
        kndrn2.jmlSeat = 600;
        kndrn2.jmlGrb = 20;
        kndrn2.tampilJmlRoda();
        kndrn2.tampilJmlSeat();
        kndrn2.tampilJmlGrb();
    }
}
