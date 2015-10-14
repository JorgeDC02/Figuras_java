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
public class Triangulo extends Figura {

    private double base;
    private double altura;
    
    //setters y getters
    public double setBase(){
        return this.base;
    }
    public void getBase(double Base){
        this.base=Base;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double Altura){
        this.altura=Altura;
    }
    
    //Costructor 1 de la clase
    public Triangulo(Punto origen){
        super(origen);
        this.base=0;
        this.altura=0;
    }
    //Constructor 2 de la clase
    public Triangulo(Punto origen,double A, double B){
        super(origen);
        this.base=B;
        this.altura=A;
    }

    @Override
    public String toString() {
        return "Figura "+Figura.numFigura()+ " de tipo triangulo {" +super.toString() +", base="+ base + ", altura=" + this.altura + '}';
    }
    
    public double Area() {
      return (this.base*this.altura)/2;
    }

    public double Perimetro() {
        return Math.sqrt(Math.pow(this.altura,2)+Math.pow(this.base/2, 2)*2+this.base);
    }

    public void Escalar(double E) {
        this.base=this.base+this.base*E/100;
        this.altura=this.altura+this.altura*E/100;
    }
    
}
