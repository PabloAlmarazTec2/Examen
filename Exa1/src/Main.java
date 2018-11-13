
import java.util.Scanner;
import newpackage.Cadenatexto;
import newpackage.Superclase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author escritorio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner xd = new Scanner(System.in);
        Superclase cl = new Superclase();
        cl.getTexto(); // Constructor sin argumentos
         System.out.println("Ingrese un nuevo texto para comprobar");
        cl.setTexto(xd.nextLine());
        System.out.println("El nuevo texto es = " + cl.getTexto());
        System.out.println("");
        
        
        System.out.println("");
        Cadenatexto ct = new Cadenatexto();
        
        System.out.println("Se inicializa con " +ct.getVal() + " De forma " +ct.getTe());
        for (int i = 0; i < ct.getVal(); i++) {
            cl.imprimeCadena();
        }
        System.out.println("");
        System.out.println("Ingrese un nuevo texto para imprimir");
        cl.setTexto(xd.nextLine());
        System.out.println("Quieres imprimirlo vertical u horizontalmente ");
        ct.setTe(xd.nextLine());
        System.out.println("Cuantas veces?");
        ct.setVal(xd.nextInt());
     
        
        
        if( ct.getTe().equals("V") || ct.getTe().equals("v") || ct.getTe().equals("Vertical") ){
            for (int i = 0; i < ct.getVal(); i++) {
                System.out.println("");
            cl.imprimeCadena();
                
         
            }
            
        }else if( ct.getTe().equals("H") || ct.getTe().equals("h") || ct.getTe().equals("Horizontal")){
            for (int i = 0; i < ct.getVal(); i++) {
           cl.imprimeCadena();
            }
        }
        else{
            System.out.println("No juegues");
        }
    }
    
}
