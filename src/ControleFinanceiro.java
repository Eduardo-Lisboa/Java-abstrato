import java.util.Scanner;

public class ControleFinanceiro {
    public void login(Autenticavel auth) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a senha...");
        int senha = in.nextInt();
        if (auth.autentica(senha)) {
            System.out.println("Usuario logado...");
        } else {
            System.out.println("Não foi possivel logar");
        }

    }
}
