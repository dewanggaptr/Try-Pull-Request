package TeoriMinggu6;

public class Lingkaran extends BangunDatar {

    public float r;

    public Lingkaran(int sisiA, int sisiB) {
        super(sisiA, sisiB);
        this.r = sisiA;
        sisiB = sisiA;
    }
    
    public float kelilingLingkaran() {
        float keliling = 3.14f * (super.keliling());
        return keliling;
    }

    public float luasLinkaran() {
        float luas = 3.14f * (super.luas());
        return luas;
    }

}
