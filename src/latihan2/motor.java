package latihan2;

public class motor extends kendaraan {
    public static void main(String[] args) {
        //membuat objek dari class motor
        motor data = new motor();

        //memasang atribut untuk merk dan jenis
        data.setAtribut("Honda", "Mobil");

        //menampilkan hasil
        System.out.println("Jenis Kendaraan: " + data.getJenis());
        System.out.println("Merk Kendaraan: " + data.getMerek());
        data.Melaju(999);
    }
}
