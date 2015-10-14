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
public class Rectangulo extends Cuadrado{

    private double alto;

    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }
        
    //Constructor de la clase
    public Rectangulo(Punto origen, double ancho, double alto){
        super(origen,ancho);
        this.alto=alto;
    }
    
    @Override
    public double Area() {
        return this.ancho*this.alto;
    }

    @Override
    public double Perimetro() {
    return 2*this.ancho+2*this.alto;
    }

    @Override
    public void Escalar(double E) {
    super.Escalar(E);
    this.alto=this.alto*E;
    }

    @Override
    public String toString() {
        return "Figura "+Figura.numFigura()+" de tipo rectagulo {Datos de la figura: "+super.origen+ ", ancho=" + this.ancho + ", alto=" + this.alto+"}";
    }
    
    
}
