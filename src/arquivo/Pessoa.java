/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

/**
 *
 * @author Amanda
 */
public class Pessoa {
    int CPF;
    String nome;
    String snome;
    String endereco;
    int telefone;

    public Pessoa(int CPF, String nome, String snome, String endereco, int telefone) {
        this.CPF = CPF;
        this.nome = nome;
        this.snome = snome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSnome() {
        return snome;
    }

    public void setSnome(String snome) {
        this.snome = snome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "CPF=" + CPF + ", nome=" + nome + ", snome=" + snome + ", endereco=" + endereco + ", telefone=" + telefone + '}';
    }
    
}
