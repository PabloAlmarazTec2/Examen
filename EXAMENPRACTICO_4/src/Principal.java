/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luisa
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    
}

class Manufactura extends Empleado{
    
}

class Apoyo extends Empleado{
    
}

class Jefe extends Empleado{
    
}

abstract class Empleado implements Capturando{
    private String nombre, apellido;
    private int edad;
    private double salario;

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}

interface Capturando{
    public String getNombre();

    public void setNombre(String nombre);

    public String getApellido();

    public void setApellido(String apellido);

    public int getEdad();

    public void setEdad(int edad);

    public double getSalario();

    public void setSalario(double salario);
}