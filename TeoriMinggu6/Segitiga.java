package TeoriMinggu6;

public class Segitiga extends BangunDatar {

    public float alas;
    public float tinggi;
    public float sisi1, sisi2;

    public Segitiga(int sisiA, int sisiB, int sisiC, int sisiD) {
        super(sisiA, sisiB);
        this.tinggi = sisiA;
        this.alas = sisiB;
        sisi1 = sisiC;
        sisi2 = sisiD;
    }

    public float kelilingSegitiga() {
        float keliling = (super.keliling()) + sisi1 + sisi2 - tinggi;
        return keliling;
    }

    public float luasSegitiga() {
        float luas = 0.5f * (super.luas());
        return luas;
    }
}
