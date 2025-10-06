import java.util.Scanner;

public class VerificadorCamposObrigatorios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos campos obrigatórios
        String nome = sc.nextLine();
        String cpf = sc.nextLine();
        String email = sc.nextLine();

        // Verifica se algum campo está vazio
        if (nome.isEmpty() || cpf.isEmpty() || email.isEmpty()) {
            System.out.println("Cadastro incompleto");
        } else {
            System.out.println("Cadastro validado com sucesso");
        }

        sc.close();
    }
}
