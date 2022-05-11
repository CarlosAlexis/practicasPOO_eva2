/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_prac1;

/**
 *
 * @author Carlitoos
 */
public class Eva2_prac1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estu1 = new Estudiante("Juana", 22, "00112255");
        
        Maestro mtro1 = new Maestro();
        
    }
    
}

class Maestro extends Persona{
   
}
class Estudiante extends Persona{
   private String numeroControl ;
   public Estudiante (){
       super();
       System.out.println("Clase estudiante");
   }
   public Estudiante (String nombre, int edad, String numeroControl){
       super(nombre, edad);
       this.numeroControl = numeroControl;
   }
   
   @override
   public void imprimirdatos(){
       super.imprimirdatos();
       System.out.println("No. de control: " + numeroControl);
   }
}

class persona {
private String nombre;
private int edad;

}