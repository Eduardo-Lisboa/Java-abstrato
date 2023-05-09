public class Diretor extends Gerente {

    public Diretor() {
    }

    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double bonificacao() {
        return this.salario * 0.18;
    }


}
