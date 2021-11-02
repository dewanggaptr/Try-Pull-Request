package Inheritance;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("-----|Lingkarang|------");
        System.out.print("Jari-jari : ");
        float j= sc.nextFloat();
        lingkaran.r = j;
        lingkaran.eLuas();
        System.out.println("Luas      : "+lingkaran.luas());
        lingkaran.eKeliling();
        System.out.println("Keliling  : "+lingkaran.keliling());
        System.out.println("");
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        System.out.println("---|Persegi Panjang|---");
        System.out.print("Panjang   : ");
        float p= sc.nextFloat();
        persegiPanjang.panjang = p;
        System.out.print("Lebar     : ");
        float l= sc.nextFloat();
        persegiPanjang.lebar = l;
        persegiPanjang.eLuas();
        System.out.println("Luas      : "+persegiPanjang.luas());
        persegiPanjang.eKeliling();
        System.out.println("Keliling  : "+persegiPanjang.keliling());
        System.out.println("");
        SegiTiga segitiga = new SegiTiga();
        System.out.println("-----|Segi Tiga|-----");
        System.out.print("Alas      : ");
        float a= sc.nextFloat();
        segitiga.alas = a;
        System.out.print("Tinggi    : ");
        float t= sc.nextFloat();
        segitiga.tinggi = t;
        segitiga.eLuas();
        System.out.println("Luas      : "+segitiga.luas());
        segitiga.eKeliling();
        System.out.println("Keliling  : "+segitiga.keliling());
    }
}