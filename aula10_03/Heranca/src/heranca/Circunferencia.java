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
public class Circunferencia extends Poligono {
    
    private float raio;
    private final float pi = 3.14f;

    public Circunferencia(int id, float raio) {
        super.id = id;
        this.raio = raio;
    }
    
    
    
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    
    @Override
    public float getArea() {
        return pi*raio*raio;
    }

    @Override
    public float getPerimetro() {
        return 2*pi*raio;
    }
    
    public float getDiametro(){
        return 2*raio;
    }

    @Override
    public String getInfo() {
        return "ID: " + super.id + "Raio: " + this.getRaio();
    }
    
}
