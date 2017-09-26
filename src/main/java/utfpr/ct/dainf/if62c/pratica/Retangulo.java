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
public class Retangulo implements FiguraComLados {
    
    double ladoX, ladoY;// ladoX = base; ladoY = altura;
    
    public Retangulo(){}
    
    public Retangulo(double lX, double lY){
        this.ladoX = lX;
        this.ladoY = lY;
    }
    
    @Override
    public double getLadoMenor() {
        if(this.ladoX < this.ladoY){
            return this.ladoX;
        }
        else{
            return this.ladoY;
        }
    }

    @Override
    public double getLadoMaior() {
        if(this.ladoX > this.ladoY){
            return this.ladoX;
        }
        else{
            return this.ladoY;
        }
    }

    @Override
    public String getNome() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getPerimetro() {
        double resultado;
        
        resultado = (this.ladoX + this.ladoY) * 2;
        
        return resultado;
    }

    @Override
    public double getArea() {
        double resultado;
        
        resultado = this.ladoX * this.ladoY;
        
        return resultado;
    }
    
}
