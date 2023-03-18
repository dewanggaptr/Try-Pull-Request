package TeoriMinggu6;

public class BangunDatar {

    private float sisiA;
    private float sisiB;

    public BangunDatar() {
    }

    public BangunDatar(float sisiA, float sisiB) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
    }

    public float luas() {
        float luas = sisiA * sisiB;
        return luas;
    }

    public float keliling() {
        float keliling = sisiA + sisiB;
        return keliling;
    }
}
