package bangundatar;

public class Segitiga extends BangunDatar {
    float a;
    float t;
    float s;

@Override
    float luas(){
        float luas = a * t / 2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }
@Override
    float kll(){
        float kll = s + s + s;
        System.out.println("Keliling Segitiga: " + kll);
        return kll;
    }
}

