package abstraksi;

public class triangle extends shape{
    private float base;
    private float height;

    public triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    float getArea(){
        return 0.5f * base * height;
    }
}
