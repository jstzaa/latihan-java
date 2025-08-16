package enkapsulasi;

public class tampilSiswa {
    public static void main(String[] args) {
        siswa data = new siswa();
        data.setKelas("XI RPL");
        data.setMapel("PBO");
        data.setNama("Dzafran Arkha Zulfika");
        data.setNIS("94278234");

        System.out.println("Nama : " + data.getNama());
        System.out.println("NIS : " + data.getNIS());
        System.out.println("Kelas : " + data.getKelas());
        System.out.println("Mapel : " + data.getMapel());
    }
}
