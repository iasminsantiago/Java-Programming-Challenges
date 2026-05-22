import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Cria o scanner para ler dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Lê toda a linha digitada
        String input = scanner.nextLine();

        // Divide a linha em partes usando espaço
        // Exemplo:
        // "Ana corrente"
        // vira:
        // ["Ana", "corrente"]
        String[] partes = input.split(" ");

        // Guarda o nome
        String nome = partes[0];

        // Guarda o tipo da conta
        String tipoConta = partes[1];

        // ---------------------------------------------------
        // IMPORTANTE:
        // A variável boolean foi criada FORA do if.
        //
        // Se ela fosse criada dentro:
        //
        // if (...) {
        //     boolean contaValida = true;
        // }
        //
        // ela só existiria dentro do bloco if.
        //
        // Fora do if o Java daria erro,
        // porque a variável estaria fora do escopo.
        // ---------------------------------------------------

        boolean contaValida;

        // Verifica se o tipo da conta é válido
        if (tipoConta.equals("corrente") ||
            tipoConta.equals("poupanca") ||
            tipoConta.equals("investimento")) {

            contaValida = true;

        } else {

            contaValida = false;
        }

        // ---------------------------------------------------
        // if(contaValida)
        //
        // Se contaValida for true:
        // entra no bloco.
        //
        // Se for false:
        // vai para o else.
        // ---------------------------------------------------

        if (contaValida) {

            // ---------------------------------------------------
            // printf usa placeholders.
            //
            // %s = String/texto
            //
            // A ordem importa:
            //
            // primeiro %s -> nome
            // segundo %s -> tipoConta
            // ---------------------------------------------------

            System.out.printf(
                "Bem-vindo(a), %s! Sua conta %s esta pronta para uso.",
                nome,
                tipoConta
            );

        } else {

            System.out.print("Tipo de conta invalido.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
