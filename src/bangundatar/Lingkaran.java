package bangundatar;
public class Lingkaran extends BangunDatar{
    float r;

@Override
    float luas(){
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas Lingkaran: " + luas);
        return luas;
    }
@Override
    float kll(){
        float kll = (float) (2 * Math.PI * r) ;
        System.out.println("Keliling Lingkaran: " + kll);
        return kll;
    }
}