/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_soal;

/**
 *
 * @author Amelia
 */
public class Mamalia extends Hewan{
    private String kelenjarSusu = "memiliki";
    
    public void melahirkan(){
        System.out.println("Mamalia berkembang biak dengan cara melahirkan");
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Mamalia " +this.kelenjarSusu+ " kelenjar susu");
        melahirkan();
    }
}
