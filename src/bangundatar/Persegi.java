package bangundatar;
public class Persegi extends BangunDatar{
    float sisi;

@Override
    float luas(){
        float luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
        return luas;
    }

@Override
    float kll(){
        float kll = 4 * sisi;
        System.out.println("Keliling Persegi: " + kll);
        return kll;
    }
}
