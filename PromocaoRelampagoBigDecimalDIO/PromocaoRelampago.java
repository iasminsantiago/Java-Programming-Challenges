// Importa a classe BigDecimal — usada para trabalhar com valores decimais de forma precisa
// (evita erros de arredondamento que podem ocorrer com tipos como double ou float)
import java.math.BigDecimal;

// Importa a classe Scanner — usada para ler entradas do teclado
import java.util.Scanner;

// Declaração da classe pública PromocaoRelampago
public class PromocaoRelampago {

    // Método principal — ponto de entrada do programa
    public static void main(String[] args) {

        // Cria um objeto Scanner para capturar o que o usuário digitar
        Scanner scanner = new Scanner(System.in);

        // Lê a linha digitada pelo usuário (ex: "75.00") e armazena na variável valorCompra
        String valorCompra = scanner.nextLine();

        // Chama o método calcularDesconto e imprime o resultado na tela
        System.out.println(calcularDesconto(valorCompra));

        // Fecha o Scanner (boa prática para liberar recursos)
        scanner.close();
    }

    // Método que recebe o valor da compra como String e retorna a mensagem do desconto
    public static String calcularDesconto(String valorCompra) {

        // Converte o texto digitado ("75.00") em um número decimal usando BigDecimal
        BigDecimal valor = new BigDecimal(valorCompra);

        // Variável que vai armazenar o percentual de desconto (0, 10 ou 20)
        BigDecimal descontoPercentual;

        // Se o valor for menor que 50.00, o desconto é 0%
        // compareTo retorna:
        // -1 → se valor < 50.00
        //  0 → se valor == 50.00
        //  1 → se valor > 50.00
        if (valor.compareTo(new BigDecimal("50.00")) < 0) {
            descontoPercentual = new BigDecimal("0");
        }

        // Se o valor estiver entre 50.00 e 100.00 (inclusive), o desconto é 10%
        else if (valor.compareTo(new BigDecimal("50.00")) >= 0 &&
                 valor.compareTo(new BigDecimal("100.00")) <= 0) {
            descontoPercentual = new BigDecimal("10");
        }

        // Caso contrário (ou seja, valor > 100.00), o desconto é 20%
        else {
            descontoPercentual = new BigDecimal("20");
        }

        // Retorna a mensagem formatada para o usuário, ex: "Desconto de 10%"
        // toPlainString() garante que o número seja exibido sem notação científica
        return "Desconto de " + descontoPercentual.toPlainString() + "%";
    }
}
