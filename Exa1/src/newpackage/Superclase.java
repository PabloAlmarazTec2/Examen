/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author escritorio
 */
public class Superclase {
    private String texto;
    
    
     //Constructor
    public Superclase(String texto) {
        this.texto = texto;
    }
    //Constructor por defecto 
    
    public Superclase() {
        System.out.println("Practica");
    }
    

    //Get y Set 
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    public void imprimeCadena()
{
    

    System.out.print(" "+ this.getTexto() +" ");

}
}
