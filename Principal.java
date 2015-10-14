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
public class Principal {

    public static void main(String[] args) {
        
         //Figura 1 Circulo A
         Punto p1=new Punto(2, 6);
         Circulo c1=new Circulo(p1,4);
         System.out.println(c1);
         System.out.println("Area="+c1.Area()+"\nPerimetro="+c1.Perimetro());
        
         //Figura 2 Circulo B
         Punto pun2=new Punto(6,4);
         Circulo c2=new Circulo(pun2,4);
         System.out.println(c2);
        
         //Distancia entre figuras
         System.out.println("La distancia entre figuras es: "+c1.distancia(c2));
        
         //Figura 3 Triangulo
         Punto p3=new Punto(3,9);
         Triangulo tr1=new Triangulo(p3,8,12);
         System.out.println(tr1);
         System.out.println("Area="+tr1.Area()+"\nPerimetro="+tr1.Perimetro());
         tr1.Escalar(12);
         System.out.println("Figura modificada: "+tr1);
         
         //Figura 4 Cuadrado
         Punto p4=new Punto(1,4);
         Cuadrado cuad=new Cuadrado(p4,8);
         System.out.println(cuad);
         System.out.println("Area="+cuad.Area()+"\nPerimetro="+cuad.Perimetro());
         cuad.Escalar(8);
         System.out.println("Figura modificada: "+cuad);
         
         //Figura 5 Rectangulo
         Punto p5=new Punto();
         Rectangulo rec=new Rectangulo(p5,4,7);
         System.out.println(rec);
         System.out.println("Area="+rec.Area()+"\nPerimetro="+rec.Perimetro());
         rec.Escalar(4);
         System.out.println("Figura modificada: "+rec);
    }
}