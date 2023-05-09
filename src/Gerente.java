import java.util.ArrayList;

public class Gerente extends Funcionario implements Autenticavel {

    private String setor;
    private int senha;


    public Gerente(String nome, String cpf, double salario, String setor, int senha) {
        super(nome, cpf, salario);
        this.setor = setor;
        this.senha = senha;
    }

    public Gerente() {
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public double bonificacao() {
        return this.salario * 0.15;

    }


    @Override
    public boolean autentica(int senha) {
        ArrayList<String> setores = new ArrayList<String>();
        setores.add("RH");
        setores.add("ADN");

        if (this.senha == senha && setores.contains(setor)) {
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Gerente{" +
                "setor='" + setor + '\'' +
                ", senha=" + senha +
                "} " + super.toString();
    }
}
