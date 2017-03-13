/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author lab3aluno
 */
public class Retangulo extends Poligono {

    private float ladoA;
    private float ladoB;

    public Retangulo(int id, float ladoA, float ladoB) {
        super.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    
    public float getLadoA() {
        return ladoA;
    }

    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }
    
    
    @Override
    public float getArea() {
        return ladoA*ladoB;
    }

    @Override
    public float getPerimetro() {
        return (ladoA+ladoB)*2;
    }
    
    public boolean isQuadrado(){
        //return ladoA==ladoB;
        return ladoA==ladoB;
    }

    @Override
    public String getInfo() {
        return "ID: " + super.id + "Lado A: " + this.getLadoA() + "Lado B: " + this.getLadoB();
    }
    
}
