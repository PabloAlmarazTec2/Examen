
import java.util.Arrays;
import java.util.Scanner;

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
        Scanner sc = new Scanner (System.in);
        TicTacToe tic = new TicTacToe ();
        Ahorcado aho = new Ahorcado();
        aho.capturarEntradaJugador();
       
        int lol = 1;
        System.out.println("Iniciaremos el programa");
        do{
          System.out.println("Elige una opción: "
        + "\n1) Ahorcado"
        + "\n2) TIC TAC TOE"
        + "\n3) Salir");
        int op = sc.nextInt();
        switch(op){
            case 1:
                System.out.println("Solo puedes fallar 5 veces, se te perdona una vida si atinas una letra");
        String [] palabras = { "conalep", "tecnologico", "programacion", "irving", "luisa","pablo","ponganos 100"};
        int posicionale = (int) Math.floor(Math.random() * palabras.length);
        String palabra = palabras[posicionale];
                
        
        System.out.println("Adivina la palabra :3 ");
        
        char [] letra = palabra.toCharArray();
        char [] letrasconguiones = new char[letra.length];    
        
        for (int i = 0; i < letra.length; i++) {
            letrasconguiones[i]='_';              //Cambiamos cada letra por guion por medio del char
        }
        
        System.out.println(letrasconguiones);
        boolean ganamos = false;
        int x=0;
        while(x <= 5){
            
                
            
        System.out.println("Introduce una letra");
        
        char letraintro = sc.next().charAt(0);
        for(int i = 0; i < letra.length; i++) {
            if(letra[i]==letraintro){
                //Sustituimos el guion con la letra que se encontro
                letrasconguiones[i]= letraintro;
                x=x-1;
               
            }    
        }
        
        if(Arrays.equals(letra, letrasconguiones)){
            System.out.println("Exito, ganaste :D");
            ganamos = true;  //Se sale del programa      
            x=10;
        }
        System.out.println(letrasconguiones);
       x=x+1;
            
        }
        if(x==6){
            System.out.println("Perdiste");
            System.out.println("-------");
            System.out.println("|     |");
            System.out.println("|     0");
            System.out.println("|    -|-"       + "        La palabra era " +palabra);  
            System.out.println("|     |");
            System.out.println("|    | |");
            System.out.println("|     ");
            System.out.println("|_________     ");
        }
        break;
            case 2:
                System.out.println("Yolo");
                
        String x1="",x2="",x3="",x4="",x5="",x6="",x7="",x8="",x9="";
        for (int i = 0; i <=9; i++) {
            
        
        System.out.println("Del 1 al 9 que posición escoges");
        int op1 = sc.nextInt();
        if(op1 == 1){
            System.out.println("X u O");
        x1=sc.next();
        }else if(op1 == 2){
        System.out.println("X u O");
        x2=sc.next();
        }else if(op1 == 3){
        System.out.println("X u O");
        x3=sc.next();
        }else if(op1 == 4){
        System.out.println("X u O");
        x4=sc.next();
        }else if(op1 == 5){
        System.out.println("X u O");
        x5=sc.next();
        }else if(op1 == 6){
        System.out.println("X u O");
        x6=sc.next();
        }else if(op1 == 7){
        System.out.println("X u O");
        x7=sc.next();
        }else if(op1 == 8){
        System.out.println("X u O");
        x8=sc.next();
        }else if(op1 == 9){
        System.out.println("X u O");
        x9=sc.next();
        }else{
            System.out.println("Deja de jugar :3");
        }
       
        
        System.out.println("");
        System.out.println(x1+"|"+x2+"|"+x3);
        System.out.println("_____");
        System.out.println(x4+"|"+x5+"|"+x6);
        System.out.println("_____");
        System.out.println(x7+"|"+x8+"|"+x9);
        if(x1.equals("X")&&x2.equals("X")&&x3.equals("X")){
        i=10;
            System.out.println("Ganaste :D");
        }if(x4.equals("X")&&x5.equals("X")&&x6.equals("X")){
        i=10;
            System.out.println("Ganaste :D");
        }
        if(x7.equals("X")&&x8.equals("X")&&x9.equals("X")){
        i=10;
            System.out.println("Ganaste :D");
        }
        if(x1.equals("X")&&x5.equals("X")&&x9.equals("X")){
        i=10;
        }
        if(x3.equals("X")&&x5.equals("X")&&x7.equals("X")){
        i=10;
        }
        if(x1.equals("O")&&x2.equals("O")&&x3.equals("O")){
        i=10;
            System.out.println("Ganaste :D");
        }if(x4.equals("O")&&x5.equals("O")&&x6.equals("O")){
        i=10;
            System.out.println("Ganaste :D");
        }
        if(x7.equals("O")&&x8.equals("O")&&x9.equals("O")){
        i=10;
            System.out.println("Ganaste :D");
        }
        if(x1.equals("O")&&x5.equals("O")&&x9.equals("O")){
        i=10;
        }
        if(x3.equals("O")&&x5.equals("O")&&x7.equals("O")){
        i=10;
        }
        }
                break;
            default:
                aho.salidaconsola();
    }
        
            System.out.println("Quieres seguir jugando 1.- si 2.- no");
            lol = sc.nextInt();
        }while(lol == 1);
}
}



    
    
    
class TicTacToe extends juego implements CapturaTicTacToe, apturaGato {

    @Override
    public void jugar() {
        System.out.println("Jugar");
    }

    @Override
    public void salidaconsola() {
        System.out.println("Bye xd");
    }

    @Override
    public void capturarEntradaJugador() {
        System.out.println("Jugador Irving");
    }

   

}

class Ahorcado extends juego implements CapturaTicTacToe, apturaGato{

    @Override
    public void jugar() {
        System.out.println("Jugar ahora");
    }

    @Override
    public void salidaconsola() {
        System.out.println(" Bye xd");
    }

    @Override
    public void capturarEntradaJugador() {
        String nom;
        
        System.out.println(" Jugadora Luisa ");
    }

   

}








abstract class juego{
abstract public void jugar();
abstract public void salidaconsola();
}

interface CapturaTicTacToe{
public void capturarEntradaJugador ();

}
interface apturaGato{
public void capturarEntradaJugador ();
}