/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_pract16;

/**
 *
 * @author invitado
 */
public class Eva2_pract16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        triangulo triangulo1 = new triangulo(10,15);
        circulo circulo1 = new circulo(20);
        rectangulo rectangulo1 = new rectangulo(20,25);
        
        
        System.out.println("Area del triangulo: " + triangulo1.calcularArea());
        System.out.println("Area del circulo: " + circulo1.calcularArea());
        System.out.println("Area del rectangulo: " + rectangulo1.calcularArea());
        
        
        
        imprimirArea(triangulo1);
        imprimirArea(circulo1);
        imprimirArea(rectangulo1);
        
    }
    
    public static void imprimirArea(Figura f){
        System.out.println("Area: " + f.calcularArea());
    }
    
}



