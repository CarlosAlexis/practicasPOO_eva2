/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_pract9;

/**
 *
 * @author Carlitoos
 */
public abstract class Persona implements MostrarDatos {
    private String nombre;
    private int edad;
    
    
    public Persona(){
        this.nombre = "";
        this.edad = 0;
    }
    

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
