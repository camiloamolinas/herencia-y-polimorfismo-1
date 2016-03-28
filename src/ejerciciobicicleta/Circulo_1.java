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
public class Circulo_1 extends FiguraGeometrica{
        private double radio;

    public void Circulo(String color, double radio) {
        super.(color);                    //super reutiliza el constructor de padre
        this.radio = radio;
    }
 
    @Override                                       //redefine el metodo de padre
    public double area(){
        super.area();                           //llama la funcion de padre
        System.out.println("En hijo");
        return Math.PI*this.radio*this.radio;       //Math llama simbolos matematicos(valor numerico)- this. hace referencia que el atributo es propio de la clase
    }
    
}

