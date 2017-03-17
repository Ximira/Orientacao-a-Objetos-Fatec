/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associacao;

/**
 *
 * @author lab3aluno
 */
public class Cpf {
    private String numero;
    private String digito;

    public Cpf(String numero, String digito) {
        this.numero = numero;
        this.digito = digito;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }
}
