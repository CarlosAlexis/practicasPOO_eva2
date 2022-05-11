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
public class circulo extends Figura {
    private double radio;

    
//CONSTRUCTORES 
    public circulo() {
    }

    public circulo(double radio) {
        this.radio = radio;
    }

    
    
//METODOS GET Y SET    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    public double calcularArea(){
    
    double area = (Math.PI)*Math.pow(radio,2) ;
    
    return area;
    }
    
}
