/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author juan.monsalveh1
 */
public class SuperHumanos extends person implements Poderes{
        private String superNombre;
        Private String Color;
                
                
    public boolean see(String artefacto){
        if(artefacto.isEmpty()){
            System.out.println("No requiere artefacto");
            return false;
        }else{
            System.out.println("Si requiere artefacto");
            return true;
        }
    }
    Public int force(){
        int rango = 10;
        return rango;
    }        
    
}
