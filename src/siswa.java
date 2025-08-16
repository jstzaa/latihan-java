public class siswa {
    int nomor_absen;
    String nama;
    String kelas;

    public static void main(String[] args) {
        siswa siswa1 = new siswa();
        siswa siswa2 = new siswa();
        siswa1.nomor_absen = 19;
        siswa1.nama = "Nanda Afrizal";
        siswa1.kelas = "XI RPL 1";
        siswa2.nomor_absen = 10;
        siswa2.nama = "Hendra Ardiansyah";
        siswa2.kelas = "XI RPL 1";
        System.out.println ( "Nama: " + siswa1.nama);
        System.out.println ("No Absen: " + siswa1.nomor_absen);
        System.out.println ("Kelas: " + siswa1.kelas);
        System.out.println (" ");
        System.out.println ( "Nama: " + siswa2.nama);
        System.out.println ("No Absen: " + siswa2.nomor_absen);
        System.out.println ("Kelas: " + siswa2.kelas);
    }
}
