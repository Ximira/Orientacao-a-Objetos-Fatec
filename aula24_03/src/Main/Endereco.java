package Main;

public class Endereco {
    private String cep;
    private int numero;

    public Endereco(String cep, int numero) {
        this.cep = cep;
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
 
