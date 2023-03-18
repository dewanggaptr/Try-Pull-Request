/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_soal;

/**
 *
 * @author Amelia
 */
public class Hewan {
    private String kelas = "Mamalia";
    
    public void makan(){
        System.out.println("Hewan makan untuk bertahan hidup ");
    }
    public void bergerak(){
        System.out.println("Hewan bergerak untuk berpindah tempat ");
    }
    
    public void info(){
        System.out.println("Kelas: " +this.kelas);
        makan();
        bergerak();
    }
}
