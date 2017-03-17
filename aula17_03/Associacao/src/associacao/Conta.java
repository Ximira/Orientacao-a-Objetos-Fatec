package associacao;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private int agencia;
    private int conta;
    private int digito;
    private List<Pessoa> listaPessoas;
    
    public Conta(int agencia, int conta, int digito) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.listaPessoas = new ArrayList<>();
    }

    public List<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public void setListaPessoas(List<Pessoa> listaPessoas) {
        this.listaPessoas = listaPessoas;
    }
    
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }
}
