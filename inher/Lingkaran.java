package Inheritance;
public class Lingkaran extends BangunDatar{
    public float r;
    public float luas(){
        float luas = (float) (3.14*(r*r));
        return luas;
    }
    public float keliling(){
        float keliling = (float) (2*3.14*r);
        return keliling;
    }
}
