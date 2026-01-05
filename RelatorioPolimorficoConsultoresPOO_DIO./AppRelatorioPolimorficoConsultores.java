import java.util.*;

// Classe abstrata base que representa um consultor genérico.
// Não pode ser instanciada diretamente, apenas herdada.
abstract class Consultant {

    // Atributos comuns a todos os tipos de consultores.
    // protected permite acesso pelas subclasses.
    protected String name;
    protected String role;

    // Construtor da classe base.
    // Responsável por inicializar o estado comum do objeto.
    public Consultant(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Método que define o comportamento padrão de apresentação.
    // Pode ser reutilizado por todas as subclasses (polimorfismo).
    public String present() {
        return role + ": " + name;
    }
}

// Subclasse concreta que representa um Desenvolvedor.
// Define implicitamente o papel como "Dev".
class Developer extends Consultant {

    // Recebe apenas o nome, pois o papel é fixo para essa especialidade.
    public Developer(String name) {
        super(name, "Dev");
    }
}

// Subclasse concreta que representa um Analista.
class Analyst extends Consultant {

    public Analyst(String name) {
        super(name, "Analyst");
    }
}

// Subclasse concreta que representa um Gerente.
class Manager extends Consultant {

    public Manager(String name) {
        super(name, "Manager");
    }
}

public class Main {

    // Ponto de entrada da aplicação.
    public static void main(String[] args) {

        // Leitor de entrada padrão (stdin).
        // A variável é local e referencia um objeto Scanner no heap.
        Scanner scanner = new Scanner(System.in);

        // Lê a linha completa contendo todos os consultores.
        // trim() remove espaços extras no início e no fim.
        String inputLine = scanner.nextLine().trim();

        // Coleção polimórfica:
        // a lista armazena referências do tipo Consultant,
        // permitindo tratar todas as especialidades de forma uniforme.
        List<Consultant> consultantList = new ArrayList<>();

        // Divide a entrada em múltiplos consultores usando ";" como separador.
        String[] entries = inputLine.split(";");

        for (String entry : entries) {
            entry = entry.trim();

            // Ignora entradas vazias por segurança.
            if (entry.isEmpty()) continue;

            // Divide a entrada em dois blocos:
            // [0] especialidade | [1] nome
            // O limite 2 garante que nomes com espaços não sejam quebrados.
            String[] parts = entry.split(" ", 2);
            String jobTitle = parts[0];
            String personName = parts[1];

            // Instancia dinamicamente a subclasse correta
            // com base na especialidade informada.
            if (jobTitle.equals("Developer")) {
                consultantList.add(new Developer(personName));
            } else if (jobTitle.equals("Analyst")) {
                consultantList.add(new Analyst(personName));
            } else if (jobTitle.equals("Manager")) {
                consultantList.add(new Manager(personName));
            }
        }

        // Iteração polimórfica:
        // independentemente da especialidade concreta,
        // o método present() é chamado via referência Consultant.
        for (Consultant consultant : consultantList) {
            System.out.println(consultant.present());
        }
    }
}
