package TeoriMinggu6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int menu;
        Scanner hamami = new Scanner(System.in);
        Scanner zadah = new Scanner(System.in);
        

        do {
            System.out.println("==================================================\n"
                    + "              PROGRAM BANGUN DATAR\n"
                    + "==================================================\n"
                    + "1. PERSEEGI PANJANG\n"
                    + "2. LINGKARAN\n"
                    + "3. SEGITIGA\n"
                    + "4. KELUAR\n"
                    + "--------------------------------------------------\n");

            System.out.print("Masukkan pilihan menu : ");
            menu = hamami.nextInt();
            System.out.println("");
            switch (menu) {
                case 1: {//PersegiPanjang
                    System.out.print("Masukkan panjang PersegiPanjang: ");
                    int panjang = zadah.nextInt();
                    System.out.print("Masukkan lebar PersegiPanjang  : ");
                    int lebar = zadah.nextInt();
                    PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
                    System.out.println("Keliling PersegiPanjang: " + pp.KelilingPersegiPanjang());
                    System.out.println("Luas PergiPanjang      : " + pp.LuasPersegiPanjang() + "\n");
                }
                break;
                case 2: {//Lingkaran
                    System.out.print("Masukkan r: ");
                    int r = zadah.nextInt();
                    Lingkaran l = new Lingkaran(r, r);
                    System.out.println("Keliling Lingkaran  : " + l.kelilingLingkaran());
                    System.out.println("Luas Lingkaran      : " + l.luasLinkaran() + "\n");
                }
                break;
                case 3: { //Segitiga
                    System.out.print("Tinggi segitiga: ");
                    int tinggi = zadah.nextInt();
                    System.out.print("Alas segitiga  : ");
                    int alas = zadah.nextInt();
                    System.out.print("Sisi 1         : ");
                    int sisi1 = zadah.nextInt();
                    System.out.print("Sisi 2         : ");
                    int sisi2 = zadah.nextInt();
                    Segitiga s = new Segitiga(tinggi, alas, sisi1, sisi2);
                    System.out.println("Keliling Segitiga: " + s.kelilingSegitiga());
                    System.out.println("Luas Segitiga    : " + s.luasSegitiga() + "\n");
                }
                break;

            }
        } while (menu > 0 && menu < 4);
    }
}
