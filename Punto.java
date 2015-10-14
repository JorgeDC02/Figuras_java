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
public class Punto {
    private double x;
    private double y;
    
    //getters y setters
    public double getX() {
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY(){
        return this.y;
    }
    public void setY(double y){
        this.y=y;
    }
    
    //Constructores de la clase
    public Punto(){//Constructor 1 de la clase
        this.x=0;
        this.y=0;
    }
    public Punto(double x, double y){//Constructor 2 de la clase
        this.x=x;
        this.y=y;
    }
    
  
    public void Desplazar(int dx, int dy){
        this.x=this.x+dx;
        this.y=this.y+dy;
    }
    
    public double distancia(Punto p){ 
         double dx=(this.x-p.getX());
         double dy=(this.y-p.getY());
        return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
    }
    
    public String toString(){
        return("X="+x+"," +" Y="+y);
    }
}