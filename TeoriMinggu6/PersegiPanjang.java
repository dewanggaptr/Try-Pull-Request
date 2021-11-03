package TeoriMinggu6;

public class PersegiPanjang extends BangunDatar {

    public float panjang;
    public float lebar;

    public PersegiPanjang(int sisiA, int sisiB) {

        super(sisiA, sisiB);
        this.panjang = sisiA;
        this.lebar = sisiB;
    }

    public PersegiPanjang() {
        super();
    }

    public float LuasPersegiPanjang() {
        float luas = super.luas();
        return luas;
    }

    public float KelilingPersegiPanjang() {
        float keliling = 2 * (super.keliling());
        return keliling;
    }

}
