package Main;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PessoaFisica pessoaFisica01 = new PessoaFisica(
            "Ronald Theodoro",
            "12345678910",
            "20-01-2015",
            "ronald@the.com",
            new Endereco("00000-000", 1)
        );
        
        PessoaFisica pessoaFisica02 = new PessoaFisica(
            "Ronald Theodoro",
            "12345678910",
            "20-01-2015",
            "ronald@the.com",
            new Endereco("00000-000", 1)
        );
        
        PessoaJuridica pessoaJuridica01 = new PessoaJuridica(
            "Doceria", 
            "123456789123456", 
            "25-02-2014", 
            "doceria@gmail.com",
            new Endereco("11111-000", 52)
        );
        
        PessoaJuridica pessoaJuridica02 = new PessoaJuridica(
            "Doceria", 
            "123456789123456", 
            "25-02-2014", 
            "doceria@gmail.com",
            new Endereco("11111-000", 52)
        );
        
        List<InterfacePessoa> listaDePessoas = new ArrayList();
        listaDePessoas.add(pessoaFisica01);
        listaDePessoas.add(pessoaFisica02);
        listaDePessoas.add(pessoaJuridica01);
        listaDePessoas.add(pessoaJuridica02);
        
        for(InterfacePessoa pessoa : listaDePessoas) {
            System.out.println(pessoa.getInfo());
        }
    }
}
