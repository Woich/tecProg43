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
public interface FiguraComLados extends Figura{
    public double getLadoMenor();
    public double getLadoMaior();
    
    @Override
    public String getNome();
    @Override
    public double getPerimetro();
    @Override
    public double getArea();
    
}
