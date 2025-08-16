package KARNIVORA;

public class karnivora {
    public static void main(String[] args) {
        System.out.println("-----KUCING-----");
        HEWAN k = new kucing();
        k.setNama();
        k.setSuara();
        k.setJmlKaki();

        System.out.println("-----AYAM-----");
        HEWAN s = new ayam();
        s.setNama();
        s.setSuara();
        s.setJmlKaki();
    }
}
