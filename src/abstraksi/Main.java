package abstraksi;

public class Main {
    public static void main(String[] args) {
        shape segitiga = new triangle(4, 5);
        shape lingkaran = new circle(5);
        System.out.println("Luas segitiga:" + segitiga.getArea());
        System.out.println("Luas lingkaran:" + lingkaran.getArea());
    }
}
