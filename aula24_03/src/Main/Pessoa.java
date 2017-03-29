package Main;

import java.util.Arrays;

public class Pessoa implements InterfacePessoa {
    private String data;
    private String email;
    private final Endereco endereco;

    public Pessoa(String data, String email, Endereco endereco) {
        this.data = data;
        this.email = email;
        this.endereco = endereco;
    }

    public String getDate() {
        return data;
    }

    public void setDate(String data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getInfo() {
        return "Pessoa(data=" + data + ", email=" + email + ", endereco=" + endereco + ")";
    }
}
 
