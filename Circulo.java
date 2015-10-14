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
public class Circulo extends Figura{
   private double Radio;
   
   //---Setters y getters
   public void setRadio(double Radio){
       this.Radio=Radio;
   }
   public double getRadio(){
       return this.Radio;
   }
   
//---Constructor por defecto de la clase
   public Circulo(Punto origen){
       super(origen);
       this.Radio=0;
   }
   
 //---Constructor de la clase
   public Circulo(Punto origen, double r){
       super(origen);
       this.Radio=r;
   }
   
   //metodos de la clase
   public double Area(){
       return (3.1416*(this.Radio*this.Radio));
   }
   
   public double Perimetro(){
       return (2*3.1416*this.Radio);
   }
   
   public void Escalar(double porc){
       this.Radio=this.Radio+this.Radio*porc/100;
   }

    @Override
    public String toString() {
        return "Figura "+Figura.numFigura()+" de tipo Circulo {" +super.toString()+", Radio=" +this.Radio + '}';
    }
}
