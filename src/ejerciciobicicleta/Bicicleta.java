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
public class Bicicleta {
    private Circulo_1[] ruedas;
    private Circulo_1   plato;
    private Triangulo[]   marco;

    public Bicicleta(Circulo_1[] ruedas, Circulo_1 plato, Triangulo[] marco) {
        this.ruedas = ruedas;
        this.plato = plato;
        this.marco = marco;
    }
    
    public double area(){
        double resultado = 0;
        resultado += this.plato.area();
        for(Circulo_1 c:this.ruedas){
            
            
        }
    }
  
    
    
}
