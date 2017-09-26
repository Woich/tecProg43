/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author woich
 */
public class Quadrado extends Retangulo{
    
    public Quadrado(){}
    
    public Quadrado(double lado){
        super(lado, lado);
    }
    
    @Override
    public double getArea(){
        return Math.pow(ladoX, 2);
    }
    
    @Override
    public double getPerimetro(){
        return ladoX*4;
    }
    
}
