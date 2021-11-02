/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_soal;

/**
 *
 * @author Amelia
 */
public class Paus extends Mamalia{
    private String tinggal;
    private String jenis;
    private String warna;
    
    public Paus(String tinggal, String jenis, String warna){
        this.tinggal = tinggal;
        this.jenis = jenis;
        this.warna = warna;
    }
    
    public void berenang(){
        System.out.println("Paus dapat berenang di air");
    }
    
    @Override
    public void info(){
        System.out.println("\n===PAUS===");
        super.info();
        berenang();
        System.out.println("Tempat tinggal : " +this.tinggal);
        System.out.println("Jenis          : " +this.jenis);
        System.out.println("Warna          : " +this.warna);
    }
}
