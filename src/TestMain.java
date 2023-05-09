import java.util.ArrayList;

public class TestMain {

    public static void main(String[] args) {

        PessoaFisica p1 = new PessoaFisica("Maria da Neves", "Rua do Bobo", "32314332", "923.032.321.21");
        PessoaJuridica p2 = new PessoaJuridica("Empresa T3", "Rua dos Brabo", "3656532", "923.032.321/0001-23");

        ArrayList<PessoaAbstrata> pessoas = new ArrayList<PessoaAbstrata>();

        pessoas.add(p1);
        pessoas.add(p2);

       pessoas.forEach(System.out::println);
    }
}
