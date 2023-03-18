package Inheritance;
import static java.lang.Math.sqrt;
public class SegiTiga extends BangunDatar{
    public float alas, tinggi ;
    public float luas(){
        float luas= alas*tinggi*1/2;
        return luas;
    }
    public float keliling(){
        float keliling = alas*alas+tinggi*tinggi;
        return (float) sqrt(keliling);
    }
}
