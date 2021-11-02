/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_soal;

/**
 *
 * @author Amelia
 */
public class Anjing extends Mamalia{
    private String tinggal;
    private String jenis;
    private String warna;
    
    public Anjing(String tinggal, String jenis, String warna){
        this.tinggal = tinggal;
        this.jenis = jenis;
        this.warna = warna;
    }
    
    public void menggonggong(){
        System.out.println("Anjing dapat menggonggong");
    }
    
    @Override
    public void info(){
        System.out.println("\n===ANJING===");
        super.info();
        menggonggong();
        System.out.println("Tempat tinggal : " +this.tinggal);
        System.out.println("Jenis          : " +this.jenis);
        System.out.println("Warna          : " +this.warna);
    }
}
