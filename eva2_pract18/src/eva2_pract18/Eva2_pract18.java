/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_pract18;

/**
 *
 * @author Carlitoos
 */
public class Eva2_pract18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        persona.setNombre("Daniel");
        //Mensajes mensaje = new Mensaje();
        Mensajes mensaje = new Mensajes() {
            @Override
            public void mostrarMensaje() {
                
            }
        };
        mensaje.mostrarMensaje();
        
    }
    
}


 interface Mensajes {
    public void mostrarMensaje();
 }

 class Persona {
   private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrarMensaje() {
       System.out.println(nombre);
    }
 
 }