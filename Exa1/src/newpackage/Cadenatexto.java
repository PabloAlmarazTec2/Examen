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
public class Cadenatexto {
    private int val;
    private String te;
    
     //Constructor por defecto
    public Cadenatexto() {
        this.val = 10;
        this.te = "H";
    }
//Constructor para meter datos:3 
    public Cadenatexto(int val, String te) {
        this.val = val;
        this.te = te;
    }

    
    
    
    
    
     //Get y set del valor
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
   //Get y set del texto
    public String getTe() {
        return te;
    }

    public void setTe(String te) {
        this.te = te;
    }

   
        public void imprimeCadena()
{
    

    System.out.println("Las veces que se imprimira son " + this.getVal() );
System.out.println(" Forma en imprimirlo " + this.getTe());

}
}
