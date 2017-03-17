package associacao;

public class Pessoa {
    private String nome;
    private String sobrenome;
    Endereco endereco;
    Rg rg;
    Cpf cpf;

    public Pessoa(String nome, String sobrenome, Endereco endereco, Rg rg, Cpf cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
