/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_pract5;

/**
 *
 * @author Carlitoos
 */
public class Eva2_pract5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setEdad(18);
        perso.setNombre("Juan Caballo");
        perso.imprimirDatos();
        
       
        
    }
    
}


class Persona  implements MostrarDatos {
    
    private String nombre;
    private int edad;

    public Persona (){
    
}
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Edad = " + edad);
    }
}

interface MostrarDatos{
    //Solo aceptan metodos publicos 
    //Solo acepta declaracion de metodos -----> Solo acepta metodos abstractos
    public void imprimirDatos();
}
