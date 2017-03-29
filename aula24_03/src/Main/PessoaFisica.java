package Main;

public class PessoaFisica extends Pessoa {
    private String nome;
    private String cpf;

    public PessoaFisica(String nome, String cpf, String data, String email, Endereco endereco) {
        super(data, email, endereco);
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String getInfo() {
        return "PessoaFisica(nome=" + nome + ", cpf=" + cpf + ")";
    }
}
 
