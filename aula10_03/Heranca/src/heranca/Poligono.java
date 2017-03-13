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
public abstract class Poligono implements IPoligono {

    protected int id;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public abstract float getArea();
    public abstract float getPerimetro();
    
    
    
}
