import java.util.Scanner;

public class ComparadorSenhas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura das senhas
        String senhaDigitada = sc.nextLine();
        String senhaConfirmada = sc.nextLine();

        // Comparação de conteúdo das senhas
        if (senhaDigitada.equals(senhaConfirmada)) {
            System.out.println("Senha valida");
        } else {
            System.out.println("Senhas nao conferem");
        }

        sc.close();
    }
}
