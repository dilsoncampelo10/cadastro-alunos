
package cadastrar;

import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author dilson
 */
public class Cadastro {
    private String matricula;
    private String nome;
    private String email;
    private String senha;
    private String cpf;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
  
    public String salvar(){
        try {
            FileWriter escrever= new FileWriter("cadastros.txt", true);
            escrever.write(this.getMatricula()+"\n"+this.getNome()+"\n"+this.getEmail()+"\n"+this.getCpf()
            +"\n+"+this.getSenha()+"\n");
            escrever.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return "Salvo com sucesso";
    }
}
