/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author juan.monsalveh1
 */
public class Person {
    private String nombre;
    private String SuperNombre;
    private String pais;
    //JuanJoseMonsalve
    public Person() {
        System.out.println("Juan Jose Monsalve");
    }
    
    public Person(String nombre, String SuperNombre, String Pais){
        this.nombre = nombre;
        this.SuperNombre = SuperNombre;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSuperNombre() {
        return SuperNombre;
    }

    public void setSuperNombre(String SuperNombre) {
        this.SuperNombre = SuperNombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    @Override
    public String toString(){
        return "Person{" + "nombre=" + nombre + ", superNombre=" + SuperNombre + ", pais=" + pais + '}';
    }
    
}
