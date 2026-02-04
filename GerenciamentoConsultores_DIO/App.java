import java.util.*;
// Importa todas as classes utilitárias do Java
// (List, ArrayList, Map, HashMap, Collections, Scanner, etc.)

// =======================
// CLASSE ABSTRATA CONSULTOR
// =======================

// Classe abstrata: não pode ser instanciada diretamente
// Serve como "modelo base" para todos os tipos de consultores
abstract class Consultor implements Comparable<Consultor> {

    // Atributos comuns a todos os consultores
    public String nome;
    public String nivel;
    public String especialidade;

    // Construtor da classe Consultor
    // É chamado pelas subclasses usando super(...)
    public Consultor(String nome, String nivel, String especialidade) {
        this.nome = nome;
        this.nivel = nivel;
        this.especialidade = especialidade;
    }

    // Método da interface Comparable
    // Define como dois consultores devem ser comparados
    // Aqui: comparação alfabética pelo nome
    @Override
    public int compareTo(Consultor outro) {
        return this.nome.compareTo(outro.nome);
    }
}

// =======================
// SUBCLASSES DE CONSULTOR
// =======================

// Especialização de Consultor para Backend
class ConsultorBackend extends Consultor {

    // Construtor chama o construtor da classe pai
    // A especialidade é fixa como "Backend"
    public ConsultorBackend(String nome, String nivel) {
        super(nome, nivel, "Backend");
    }
}

// Especialização de Consultor para Frontend
class ConsultorFrontend extends Consultor {

    public ConsultorFrontend(String nome, String nivel) {
        super(nome, nivel, "Frontend");
    }
}

// Especialização de Consultor para Dados
class ConsultorDados extends Consultor {

    public ConsultorDados(String nome, String nivel) {
        super(nome, nivel, "Dados");
    }
}

// =======================
// CLASSE EQUIPE
// =======================

class Equipe {

    // Nome da equipe (ex: Alpha, Beta)
    public String nome;

    // Lista de consultores da equipe
    // Usa polimorfismo: pode guardar Backend, Frontend ou Dados
    public List<Consultor> consultores = new ArrayList<>();

    // Construtor da equipe
    public Equipe(String nome) {
        this.nome = nome;
    }

    // Método para adicionar um consultor à equipe
    public void adicionar(Consultor c) {
        consultores.add(c);
    }

    // Retorna uma lista NOVA de consultores ordenada pelo nome
    public List<Consultor> ordenados() {
        // Cria uma cópia da lista original
        List<Consultor> lista = new ArrayList<>(consultores);

        // Ordena usando o compareTo definido em Consultor
        Collections.sort(lista);

        // Retorna a lista ordenada
        return lista;
    }
}

// =======================
// CLASSE PRINCIPAL
// =======================

public class Main {
    public static void main(String[] args) {

        // Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);

        // Map que associa o nome da equipe à equipe em si
        // Ex: "Alpha" -> objeto Equipe Alpha
        Map<String, Equipe> equipes = new HashMap<>();

        // -----------------------
        // Criando a equipe Alpha
        // -----------------------
        Equipe alpha = new Equipe("Alpha");
        alpha.adicionar(new ConsultorDados("Lucas", "Pleno"));
        alpha.adicionar(new ConsultorBackend("Bruno", "Senior"));
        alpha.adicionar(new ConsultorFrontend("Maria", "Junior"));
        equipes.put("Alpha", alpha);

        // -----------------------
        // Criando a equipe Beta
        // -----------------------
        Equipe beta = new Equipe("Beta");
        beta.adicionar(new ConsultorBackend("Joao", "Junior"));
        beta.adicionar(new ConsultorDados("Ana", "Senior"));
        equipes.put("Beta", beta);

        // Lê o nome da equipe que o usuário quer consultar
        String nomeEquipe = sc.nextLine();

        // Busca a equipe no Map
        // Se não existir, retorna null
        Equipe equipe = equipes.get(nomeEquipe);

        // -----------------------
        // Verificação final
        // -----------------------

        // Se a equipe não existir
        if (equipe == null) {
            System.out.println("Equipe nao encontrada");
        } 
        // Se a equipe existir
        else {
            // Percorre os consultores já ordenados
            for (Consultor c : equipe.ordenados()) {
                // Imprime no formato exigido pela questão
                System.out.println(c.nome + " " + c.especialidade + " " + c.nivel);
            }
        }
    }
}
