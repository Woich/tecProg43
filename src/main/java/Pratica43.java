
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woich
 */
public class Pratica43 {
    public static void main(String args[]){
        Elipse eli = new Elipse(2.5 , 3);
        
        System.out.println("Area da Elipse: " + eli.getArea());
        System.out.println("Perimetro da Elipse: " + eli.getPerimetro());
        System.out.println();
        
        Circulo circ = new Circulo(3);
        
        System.out.println("Area do Circulo: " + circ.getArea());
        System.out.println("Perimetro do Circulo: " + circ.getPerimetro());
        System.out.println();
        
        Retangulo retang = new Retangulo(3, 4);
        
        System.out.println("Area do Retangulo: " + retang.getArea());
        System.out.println("Perimetro do Retangulo: " + retang.getPerimetro());
        System.out.println();
        
        Quadrado quad = new Quadrado(4);
        
        System.out.println("Area do Quadrado: " + quad.getArea());
        System.out.println("Perimetro do Quadrado: " + quad.getPerimetro());
        System.out.println();
        
        TrianguloEquilatero tri = new TrianguloEquilatero(3);
        
        System.out.println("Area do Triangulo Equilatero: " + tri.getArea());
        System.out.println("Perimetro do Triangulo Equilatero: " + tri.getPerimetro());
        System.out.println();
    }
}
