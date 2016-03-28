/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobicicleta;

/**
 *
 * @author Estudiante
 */
public class EjercicioBicicleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo_1 c1 = new Circulo_1("verde",1);
        Circulo_1 c2 = new Circulo_1("verde",1);
        Circulo_1 plato = new Circulo_1("verde",1);
    System.out.println(c1.area());
    
    Triangulo[] marco = new Triangulo[3];
    marco[0] = new Triangulo("b" , 2);
    marco[1] = new Triangulo("b" , 2);
    marco[2] = new Triangulo("b" , 2);
    
    Circulo_1[] ruedas = new Circulo_1[2];
    
   
    
    }
    
}
