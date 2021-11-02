package Inheritance;
public class PersegiPanjang extends BangunDatar{
    public float panjang, lebar;
    public float luas(){
        float luas = panjang*lebar;
        return luas;
    }
    public float keliling(){
        float keliling = panjang+lebar*2;
        return keliling;
    }
}
