# Gerenciamento de Equipes de Consultores – Java (POO)

Este projeto implementa um sistema simples para gerenciamento de equipes de consultores em uma consultoria fictícia chamada **TechConsult**.  
O objetivo é aplicar conceitos de **Programação Orientada a Objetos (POO)** utilizando Java, como classes, herança, polimorfismo, encapsulamento e coleções.

---

## 📌 Objetivo do projeto

Criar um programa que:

- Cadastre equipes de consultores
- Permita que cada equipe possua consultores de diferentes especialidades
- Liste os consultores de uma equipe em **ordem alfabética pelo nome**
- Informe quando uma equipe não for encontrada

---

## 🧠 Conceitos Utilizados

- **Classe abstrata**
- **Herança**
- **Polimorfismo**
- **Interface Comparable**
- **Coleções (List, Map)**
- **Ordenação com Collections.sort**
- **Entrada padrão com Scanner**

---

## 🏗 Estrutura do Projeto

### 🔹 Classe `Consultor` (abstrata)
Representa um consultor genérico, contendo:
- `nome`
- `nivel`
- `especialidade`

Implementa `Comparable<Consultor>` para permitir ordenação alfabética pelo nome.

---

### 🔹 Especializações de Consultor
Cada especialidade herda de `Consultor`:

- `ConsultorBackend`
- `ConsultorFrontend`
- `ConsultorDados`

Essas classes utilizam **herança** e definem a especialidade automaticamente.

---

### 🔹 Classe `Equipe`
Responsável por:
- Armazenar o nome da equipe
- Manter uma lista de consultores
- Adicionar consultores à equipe
- Retornar os consultores ordenados pelo nome

---

### 🔹 Classe `Main`
- Cria equipes e consultores
- Armazena as equipes em um `Map<String, Equipe>`
- Lê o nome da equipe via entrada padrão
- Imprime os consultores da equipe solicitada ou uma mensagem de erro

---

## ⌨ Entrada

Uma string contendo o nome da equipe a ser consultada.

**Exemplo:**
Alpha
---

## 📤 Saída
- Se a equipe existir:  
  Uma linha por consultor no formato:
nome especialidade nivel
- Se a equipe não existir:
nome especialidade nivel
- Se a equipe não existir:
Equipe nao encontrada
---

## 🧪 Exemplos

### Entrada
Alpha
### Saída
Bruno Backend Senior
Lucas Dados Pleno
Maria Frontend Junior
---

### Entrada
Gamma
### Saída
Equipe nao encontrada
---

## ✅ Observações

- A ordenação é feita automaticamente com base no nome do consultor
- O projeto não utiliza bibliotecas externas
- Todo o comportamento solicitado pela questão foi implementado

---

## 🚀 Conclusão

Este projeto demonstra o uso prático de Programação Orientada a Objetos em Java, aplicando conceitos fundamentais de forma clara e organizada, seguindo exatamente o que foi solicitado no enunciado da questão.
