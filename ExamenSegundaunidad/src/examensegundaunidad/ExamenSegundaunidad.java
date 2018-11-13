/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensegundaunidad;

import java.util.Scanner;

/**
 *
 * @author Pablo Aaron Almaraz Avalos
 */
public class ExamenSegundaunidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        //creamo variables de "a" a la "j"
        double a, b, c, d, a1, a2, b2, c2, d2, a3, b3, c3,d3;
        //creamos un objeto para cada formula
        Formula1 form1=new Formula1();
        Formula2 form2=new Formula2();
        Formula3 form3=new Formula3();
        
        //pedimos la aceleración
        System.out.println("Digite la aceleración");
        form1.setAceleracion(input.nextDouble());
        form2.setAceleracion(form1.getAceleracion());
        form3.setAceleracion(form2.getAceleracion());
        
        //pedimos el tiempo
        System.out.println("Digite tiempo en segundos");
        form1.setTiempo(input.nextDouble());
        form2.setTiempo(form1.getTiempo());
        form3.setTiempo(form2.getTiempo());
        
        //pedimos la velocidad inicial
        System.out.println("Digite la velocidad inicial en km/h");
        form1.setVelInicial(input.nextDouble());
        form2.setVelInicial(form1.getVelInicial());
        form3.setVelInicial(form2.getVelInicial());
        
        //pedimos la velocidad final
        System.out.println("Digite la velocidad final en km/h");
        form1.setVelFinal(input.nextDouble());
        form2.setVelFinal(form1.getVelFinal());
        form3.setVelFinal(form2.getVelFinal());
        
        //guardamos los datos en las variables de la "a" a la "l"
        a=form1.getAceleracion();
        b=form1.getTiempo();
        c=form1.getVelInicial();
        d=form1.getVelFinal();
        a2=form2.getAceleracion();
        b2=form2.getTiempo();
        c2=form2.getVelInicial();
        d2=form2.getVelFinal();
        a3=form3.getAceleracion();
        b3=form3.getTiempo();
        c3=form3.getVelInicial();
        d3=form3.getVelFinal();
        //imprimimos lo solicitado
        System.out.println("La distancia de la formula 1 es: "+form1.calcularDistancia(a, b, c, d));
        System.out.println("La distancia de la formula 2 es: "+form2.calcularDistancia(a2, b2, c2, d2));
        System.out.println("La distancia de la formula 3 es: "+form3.calcularDistancia(a3, b3, c3, d3));
    
    }
    
}
    


abstract class Movimiento implements Captura
{
    private double aceleracion, tiempo, velInicial, velFinal;
    Movimiento()
    {
        aceleracion=2.0;
        tiempo=5.0;
        velInicial=30.1;
        velFinal=50.9;
    }
    Movimiento(double aceleracion, double tiempo, double velInicial, double velFinal)
    {
        this.aceleracion=aceleracion;
        this.tiempo=tiempo;
        this.velInicial=velInicial;
        this.velFinal=velFinal;
    }
    public double calcularDistancia(double aceleracion, double tiempo, double velInicial, double velFinal)
    {
        double distancia=0;
        
        return distancia;
    }
    @Override
    public void setAceleracion(double aceleracion)
    {
        this.aceleracion=aceleracion;
    }
    @Override
    public void setTiempo(double tiempo)
    {
        this.tiempo=tiempo;
    }
    @Override
    public void setVelInicial(double velInicial)
    {
        this.velInicial=velInicial;
    }
    @Override
    public void setVelFinal(double velFinal)
    {
        this.velFinal=velFinal;
    }
    @Override
    public double getAceleracion()
    {
        return aceleracion;
    }
    @Override
    public double getTiempo()
    {
        return tiempo;
    }
    @Override
    public double getVelInicial()
    {
        return velInicial;
    }
    @Override
    public double getVelFinal()
    {
        return velFinal;
    }
}
class Formula1 extends Movimiento
{
    @Override
    public double calcularDistancia(double aceleracion, double tiempo, double velInicial, double velFinal)
    {
        double distancia;
        distancia=(getVelInicial()*getTiempo())+((getAceleracion()*Math.pow(getTiempo(), 2.0))/2);
        return distancia;
    }
    
}
class Formula2 extends Movimiento
{
    @Override
    public double calcularDistancia(double aceleracion, double tiempo, double velInicial, double velFinal)
    {
        double distancia;
        distancia=((getVelInicial()+getVelFinal())/2)*(getTiempo());
        return distancia;
    }
    
}
class Formula3 extends Movimiento
{
    @Override
    public double calcularDistancia(double aceleracion, double tiempo, double velInicial, double velFinal)
    {
        double distancia;
        distancia=(getVelFinal()-getVelInicial())/(2*getAceleracion());
        return distancia;
    }
    
}


interface Captura
{
    public void setAceleracion(double aceleracion);
    public void setTiempo(double tiempo);
    public void setVelInicial(double velInicial);
    public void setVelFinal(double velFinal);
    public double getAceleracion();
    public double getTiempo();
    public double getVelInicial();
    public double getVelFinal();
}