package latihan;

public class TestAsosiasi {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Nesta", 1462, "Cibangun", 1234);
        Jurusan jurusan = new Jurusan("MIPA");
        jurusan.setMahasiswa(mahasiswa);
        mahasiswa.setJurusan(jurusan);
        System.out.println("Nama: " + mahasiswa.getNama() + "\n" + "ID: " + mahasiswa.getNomorID() + "\n" + "Jurusan: " + jurusan.getNamaJurusan()
          + "\n" + "Alamat: " + mahasiswa.getAlamat()  + "\n" + "No Telp: " + mahasiswa.getNomorTLP());
    }
}
