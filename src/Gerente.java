public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public Gerente() {
    }

    @Override
    public double bonificacao() {
        return this.salario * 0.15;

    }


}
