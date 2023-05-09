public class Presidente extends Funcionario {

    public Presidente() {
    }

    public Presidente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double bonificacao() {
        return this.salario * 0.2;
    }
}
