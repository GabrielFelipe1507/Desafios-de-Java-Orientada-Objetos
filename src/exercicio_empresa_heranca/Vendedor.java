package exercicio_empresa_heranca;

public class Vendedor extends Funcionario{

    private int quantidade;
    private double valorVenda;
    private String nomeLoja;


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }


    public String toString() {
        return super.toString() + "\nCargo: Vendedor \nquantidade=" + quantidade + ", \nvalorVenda=" + valorVenda + ", \nnomeLoja=" + nomeLoja;  
    }

}
