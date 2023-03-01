package exercicio_empresa_heranca_classes;

import java.sql.Date;

public class Funcionario {
    
    private String nome;
    protected String cpf;
    private String rg;
    private String tempoServico;
    

    public String getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(String tempoServico) {
        this.tempoServico = tempoServico;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String toString() {
        return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", tempoServico=" + tempoServico + "]";
    }
 
}
