/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_pract19;

/**
 *
 * @author Carlitoos
 */
public class Eva2_pract19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mensajes mensaje = new Mensajes (){
            @Override
            public void mostrarMensaje() {
                System.out.println("hola mundo");
            }
        
        };
        mensaje.mostrarMensaje();
    }
    
}

interface Mensajes {
    public void mostrarMensaje();
 }