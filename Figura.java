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
public abstract class Figura {
    protected Punto origen;
    private static int numFiguras=0;
    
    //----Getters y setters
    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }
    
    //constructor de la clase
    public Figura(Punto origen){
        this.origen=origen;
        Figura.numFiguras++;
    }
    
    //Metodos de la clase
    public void Desplazar(int dx,int dy){
        this.origen.Desplazar(dx, dy);
    }
    
    public static int numFigura(){
        return Figura.numFiguras;
    }
    
    public abstract double Area();
    public abstract double Perimetro();
    public abstract void Escalar(double E);
    
    public String toString(){
        return "Datos de la figura: "+this.origen.toString();
    }
    
    public double distancia(Figura f){
        return this.origen.distancia(f.getOrigen());
    }
}
