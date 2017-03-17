package associacao;

public class Associacao {

    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa(
            "Ronald", 
            "Theodoro", 
            new Endereco("00000-000", 450, "viela 10"),
            new Rg("12456789", "8", "ssp", "01012010"),
            new Cpf("12345678910", "10")
        );
        Pessoa pessoa02 = new Pessoa(
            "Thamara",
            "Campos",
            new Endereco("00000-000", 450, "viela 21"),
            new Rg("12456789", "8", "ssp", "01012010"),
            new Cpf("12345678910", "10")
        );
        
        Conta conta = new Conta(111, 12345, 1);
        conta.getListaPessoas().add(pessoa01);
        conta.getListaPessoas().add(pessoa02);
        
        System.out.println("Agencia: " + conta.getAgencia());
        System.out.println("Conta: " + conta.getConta());
        System.out.println("Digito: " + conta.getDigito() + "\n");
        
        for (Pessoa pessoa :  conta.getListaPessoas()) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Sobrenome: " + pessoa.getSobrenome());
            System.out.println("Cep: " + pessoa.endereco.getCep());
            System.out.println("Complemento: " + pessoa.endereco.getComplemento());
            System.out.println("Numero: " + pessoa.endereco.getNumero());
            System.out.println("Rg numero: " + pessoa.rg.getNumero());
            System.out.println("Rg Digito: " + pessoa.rg.getDigito());
            System.out.println("Rg emissor: " + pessoa.rg.getEmissor());
            System.out.println("Rg data: " + pessoa.rg.getDataDeEmissao());
            System.out.println("Cpf numero: " + pessoa.cpf.getNumero());
            System.out.println("Cpf digito: " + pessoa.cpf.getDigito() + "\n");
        }
    }   
}
