# 📌 Sistema de Consultores – Programação Orientada a Objetos (Java)
## 📖 Descrição do Projeto

Este projeto implementa um sistema simples de geração de relatórios para consultores de uma empresa fictícia chamada TechConsult.
Cada consultor pertence a uma especialidade diferente — Developer, Analyst ou Manager — e cada uma possui uma forma específica de apresentação.
Obs.: No arquivo _Anotacoes_..., você encontrará uma versão comentada em detalhes, de modo que meu aprendizado em POO fique registrado.

O sistema foi desenvolvido utilizando Programação Orientada a Objetos (POO), aplicando os conceitos de:

Encapsulamento

Herança

Polimorfismo

Classes abstratas

Coleções (List)

## 🎯 Objetivo

Ler uma lista de consultores a partir da entrada padrão, identificar automaticamente sua especialidade e imprimir um relatório personalizado para cada um, respeitando as regras:

Developer → Dev: nome

Analyst → Analyst: nome

Manager → Manager: nome

A ordem de saída deve ser a mesma da entrada.

## 🧠 Conceitos de POO Utilizados
🔹 Classe Abstrata

Consultant é uma classe abstrata que define os atributos e comportamentos comuns a todos os consultores.

🔹 Herança

Developer, Analyst e Manager herdam de Consultant.

🔹 Polimorfismo

Todos os objetos são armazenados em uma List<Consultant>.

O método present() é chamado de forma genérica, mas cada objeto responde corretamente conforme sua especialidade.

### 📥 Entrada

Uma única linha contendo os consultores separados por ponto e vírgula (;), no formato:

[Especialidade] [Nome]

Especialidades válidas:

Developer

Analyst

Manager

Exemplo:
Developer Alice;Analyst Bob;Manager Carol

### 📤 Saída

Para cada consultor, uma linha contendo sua apresentação personalizada.

Exemplo de saída:
Dev: Alice
Analyst: Bob
Manager: Carol

## 🛠️ Estrutura do Código

Consultant → classe abstrata base

Developer → subclasse de Consultant

Analyst → subclasse de Consultant

Manager → subclasse de Consultant

Main → classe principal responsável por:

Ler a entrada

Instanciar os objetos corretos

Armazenar em uma lista

Imprimir o relatório final

## ▶️ Como Executar

Compile o código:

javac Main.java


Execute o programa:

java Main


Digite a entrada conforme o formato especificado.

## ✅ Exemplo Completo

Entrada:

Analyst Eve;Developer Max


Saída:

Analyst: Eve
Dev: Max

## 📌 Observações

Não são utilizadas bibliotecas externas.

A decisão sobre qual classe instanciar ocorre em tempo de execução.

O código foi estruturado para facilitar manutenção e extensões futuras.

✨ Conclusão:
Este projeto demonstra de forma prática e clara como aplicar Programação Orientada a Objetos em Java, utilizando herança e polimorfismo para resolver um problema real de forma elegante e organizada.
