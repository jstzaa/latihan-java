package abstraksi;

public class circle extends shape{
    private float r;

    public circle(float r){
        this.r = r;
    }

    @Override
    float getArea(){
        return (float) (Math.PI * r * r);
    }
}
