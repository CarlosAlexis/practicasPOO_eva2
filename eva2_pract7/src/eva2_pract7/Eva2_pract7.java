/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_pract7;

/**
 *
 * @author Carlitoos
 */
public class Eva2_pract7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Prueba implements B{
   @Override 
    public void metodoB(){
        
    }
    
   @Override
   public void metodoA(){
       
   }
}
interface A{
    public void metodoA();
    
}

interface B extends A{
    public void metodoB();
}