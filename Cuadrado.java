/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_figuras;

/**
 *
 * @author Jordi
 */
public class Cuadrado extends Figura{
    protected double ancho;
    
    //getters y setters
    public double setCuadrado(){
        return this.ancho;
    }
    public void getCuadrado(double Ancho){
        this.ancho=Ancho;
    }
    
    //Constructor 1 de la clase
    public Cuadrado(Punto origen){
        super(origen);
        this.ancho=0;
    }
    //Constructor 2 de la clase
    public Cuadrado(Punto origen,double Ancho){
        super(origen);
        this.ancho=Ancho;
    }
    public double Area(){
        return this.ancho*this.ancho;
    }
    public double Perimetro(){
        return this.ancho*4;
    }
    public void Escalar(double porc){
        this.ancho=this.ancho+this.ancho*porc/100;
    }

    @Override
    public String toString() {
        return "Figura "+Figura.numFigura()+" de tipo cuadrado {"+super.toString() + ", ancho=" + ancho + '}';
    }
    
}
