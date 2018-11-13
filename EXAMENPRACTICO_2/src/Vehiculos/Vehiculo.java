/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author Luisa
 */


final class Sedan extends Vehiculo implements Tunneable{
    private int sonido, bocinas;
    @Override
    public int getSonido() {
        return sonido;
    }

    @Override
    public void setSonido(int sonido) {
        this.sonido = sonido;
    }

    @Override
    public int getBocinas() {
        return bocinas;
    }

    @Override
    public void setBocinas(int bocinas) {
        this.bocinas = bocinas;
    }
}

final class Moto extends Vehiculo{
    
}

public class Vehiculo{
    private int numRuedas, velocidad, sonido, bocinas, pasajeros;
    private String tipoTransmision;
    private boolean estaEncendido;

    
   
    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    
    public void prender(){
        estaEncendido = true;
    }
    
    public void apagar(){
        estaEncendido = false;
    }
    
    public void acelerar(){
        if(estaEncendido){
            velocidad = velocidad + 10;
        }
    }
    
    public void frenar(){
        if(estaEncendido){
            if(velocidad >=10)
                velocidad = velocidad-10;
        }
    }
    
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }
    
    public int acelerarVelo(int velocidad){
        do{
            acelerar();
            acelerometro();

        }
        while(getVelocidad()<velocidad);
        return velocidad;
    }
    
    public int detener(int velocidad){
        do{
            frenar();
            acelerometro();
        }
        while(getVelocidad()>0);
        return velocidad;
    }
    
    public void acelerometro(){
        if(getVelocidad()>0){
            System.out.println("Vehiculo en movimiento a "+getVelocidad()+" km/h");
        }
        else{
        System.out.println("Vehiculo en movimiento a "+getVelocidad()+" km/h");
        }
    }
}

interface Tunneable{
    public int getSonido();
    public void setSonido(int sonido);
    public int getBocinas();
    public void setBocinas(int bocinas);
    
}
