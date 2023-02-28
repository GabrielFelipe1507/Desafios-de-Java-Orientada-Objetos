package exercicio_empresa_heranca;

public class RodarAplicacao {
    public static void main(String[] args) {

        //aqui foi criado um objeto funcionário e foi guardado na variavel "funcionário"

        //exemplos de upcasts:
        /*
        Funcionario gerente1 = new Gerente();
        Funcionario vendedor1 = new Vendedor();
        Funcionario faxineiro1 = new Fachineiro();
        */

        //exemplo de downcasts:
        //Gerente gerente = new Funcionario();
        //Vendedor vendedor_ = (Vendedor) new Funcionario();

        Funcionario f1 = new Funcionario();

        Gerente g1 = new Gerente();
        Vendedor v1 = new Vendedor();
        Fachineiro fa1 = new Fachineiro();

        System.out.println("\n***Gerente:***");
        //atributos da classe funcionario:
        g1.setNome("Gabriel");
        g1.setCpf("123.213.123-99");
        g1.setRg("20.999.756-90");  
        g1.setTempoServico("30 anos");
        //atributos da classe gerente:
        g1.setCodeGerencia(14);
        g1.setSalario(30000);
        g1.setSetor("Fabricação");
        System.out.println(g1);

        System.out.println("\n***Vendedor:***");
        //atributos da classe funcionario:
        v1.setNome("Paulo");
        v1.setCpf("120.900.700-80");
        v1.setRg("55.765.234-80");
        v1.setTempoServico("20 anos");     
        //atributos da classe vendedor:
        v1.setNomeLoja("Luzitana");
        v1.setQuantidade(3);
        v1.setValorVenda(100);
        System.out.println(v1);

        System.out.println("\n***Fachineiro:***");
        //atributos da classe funcionario:
        fa1.setNome("João");
        fa1.setCpf("120.900.700-88");
        fa1.setRg("55.765.234-89");
        fa1.setTempoServico("10 anos");
        //atributos da classe fachineiro:
        fa1.setCorRoupa("Branca");
        fa1.setMaterial("Vassoura");
        fa1.setTipoLimpeza("Residencial");
        System.out.println(fa1);
        
    }
}
