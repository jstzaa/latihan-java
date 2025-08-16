package abstraksi;

public abstract class shape {
    String color;
    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
    abstract float getArea();
}
