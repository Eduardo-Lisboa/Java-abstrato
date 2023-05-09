import java.util.ArrayList;

public class testeFunc {
    public static void main(String[] args) {
        Gerente f1 = new Gerente("Jose", "4343242", 1000);
        Presidente f2 = new Presidente("Marcelo", "4343242", 1000);
        Diretor f3 = new Diretor("Eduardo", "4343242", 1000);

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        funcionarios.forEach(funcionario -> System.out.println(funcionario.toString() + "Bonificaçãp: " + funcionario.bonificacao()));
    }
}
