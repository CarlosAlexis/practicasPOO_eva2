/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_pract9;

/**ds
 *
 * @author Carlitoos
 */
public class Cliente extends Persona{
    
    public Cliente(){
        
    }
    
    
    
    @Override
    public void muestraDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("RFC: ");
    }
    
}
