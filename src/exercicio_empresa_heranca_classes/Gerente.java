package exercicio_empresa_heranca_classes;

public class Gerente extends Funcionario{

    private String setor;
    private int codeGerencia;
    private double salario;


    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public int getCodeGerencia() {
        return codeGerencia;
    }
    public void setCodeGerencia(int codeGerencia) {
        this.codeGerencia = codeGerencia;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String toString() {        
        return super.toString() + "\nCargo: Gerente \nsetor=" + setor + ", \ncodeGerencia=" + codeGerencia + ", \nsalario=" + salario;
    }

}
