public class Diretor extends Gerente {


    private String filial;


    public Diretor() {
    }

    public Diretor(String nome, String cpf, double salario, String setor, int senha, String filial) {
        super(nome, cpf, salario, setor, senha);
        this.filial = filial;
    }


    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    @Override
    public double bonificacao() {
        return this.salario * 0.18;
    }


    @Override
    public boolean autentica(int senha) {
        if (getSenha() == senha) {
            return true;

        }
        return false;

    }


    @Override
    public String toString() {
        return "Diretor{" +
                "filial='" + filial + '\'' +
                "} " + super.toString();
    }
}
