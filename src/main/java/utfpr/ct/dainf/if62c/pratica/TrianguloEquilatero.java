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
public class TrianguloEquilatero extends Retangulo{
    
    public TrianguloEquilatero(){}
    
    public TrianguloEquilatero(double lado){
        super(lado, (lado*Math.sqrt(3))/2);
    }
    
    @Override
    public double getArea(){
        return (Math.pow(ladoX, 2)*Math.sqrt(3))/4;
    }
    
    @Override
    public double getPerimetro(){
        return ladoX*3;
    }
    
}
