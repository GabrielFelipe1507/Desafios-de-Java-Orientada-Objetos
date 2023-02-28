package exercicio_empresa_heranca;

public class Fachineiro extends Funcionario{
    private String material;
    private String corRoupa;
    private String tipoLimpeza;

    
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getCorRoupa() {
        return corRoupa;
    }
    public void setCorRoupa(String corRoupa) {
        this.corRoupa = corRoupa;
    }
    public String getTipoLimpeza() {
        return tipoLimpeza;
    }
    public void setTipoLimpeza(String tipoLimpeza) {
        this.tipoLimpeza = tipoLimpeza;
    }
    
    public String toString() {
        return super.toString() + "\nCargo: Fachineiro \nmaterial=" + material + ", \ncorRoupa=" + corRoupa + ", \ntipoLimpeza=" + tipoLimpeza;
    }

}
