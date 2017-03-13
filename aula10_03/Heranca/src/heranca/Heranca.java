/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;
import java.util.*;
/**
 *
 * @author lab3aluno
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Retangulo r = new Retangulo(1, 3.0f, 3.0f);
        
        System.out.println("ID: " + r.getId());
        System.out.println("Lado A: " + r.getLadoA());
        System.out.println("Lado B: " + r.getLadoB());
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimetro: " + r.getPerimetro());
        System.out.println("Quadrado: " + r.isQuadrado());
        
        Circunferencia c = new Circunferencia(2, 3.5f);
        
        System.out.println("ID: " + c.getId());
        System.out.println("Raio: " + c.getRaio());
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimetro: " + c.getPerimetro());
        System.out.println("Diametro: " + c.getDiametro());
        
        
        ArrayList<IPoligono> lista = new ArrayList<IPoligono>();
        
        lista.add(c);
        lista.add(r);
        
        for(IPoligono p : lista){
            System.out.println(p.getInfo());
        }
        
    }
    
}
