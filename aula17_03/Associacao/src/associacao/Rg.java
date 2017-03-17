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
public class Rg {
    private String numero;
    private String digito;
    private String emissor;
    private String dataDeEmissao;

    public Rg(String numero, String digito, String emissor, String dataDeEmissao) {
        this.numero = numero;
        this.digito = digito;
        this.emissor = emissor;
        this.dataDeEmissao = dataDeEmissao;
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

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public String getDataDeEmissao() {
        return dataDeEmissao;
    }

    public void setDataDeEmissao(String dataDeEmissao) {
        this.dataDeEmissao = dataDeEmissao;
    }
}
