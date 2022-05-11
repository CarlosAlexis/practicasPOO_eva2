/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval2_pract3;

/**
 *
 * @author Carlitoos
 */
public class Eval2_pract3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Animal animal = new Animal();
       //animal.movimiento();
       //Vertebrado vert = new Vertebrado();
       //vert.tenerEsqueleto();
       //Mamifero mamifero = new Mamifero();
       //mamifero.tenerPelo();
       //Primate prim = new Primate ();
       //prim.tomarObjetos();
       Humano hum = new Humano();
       hum.pensar();
    }
    
}

class Humano extends Primate{
    public Humano(){
            System.out.println("Humano");
            
}
    public void pensar(){
        System.out.println("Pensar");
    }
}

class Primate extends Mamifero{
public Primate(){
    System.out.println("Primates");
}
public void tomarObjetos(){
    System.out.println("Toman objetos");
}
}

class Mamifero extends Vertebrado{
    public Mamifero(){
        System.out.println("Mamifero");
    }
    public void tenerPelo(){
            System.out.println("Tiene pelo");
}
}

class Vertebrado extends Animal{
    public Vertebrado(){
        super();
        System.out.println("Vertebrado");
    }
    public void tenerEsqueleto(){
        System.out.println("Tiene esqueleto");
    
    }
    }
    


class Animal{
public Animal(){
    System.out.println("Animal");}

public void movimiento(){
    System.out.println("Animal:movimiento");
}
}