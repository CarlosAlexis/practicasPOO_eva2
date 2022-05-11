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
public class triangulo extends Figura {
    private double base;
    private double altura;

    
    //CONSTRUCTORES 
    public triangulo() {
    }

   

    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    //METODOS GET Y SET 
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    
    public double calcularArea(){
    
    double area = base*altura/2;
    
    return area;
    }
    
}
