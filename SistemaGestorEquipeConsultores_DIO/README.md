# Sistema de Gerenciamento de Equipes da TechConsult

Este projeto em **Java** implementa um sistema orientado a objetos para gerenciar equipes de consultores da empresa **TechConsult**.  
Cada equipe pode conter consultores de diferentes especialidades, e o sistema permite listar os consultores de uma equipe em **ordem alfabética pelo nome**.

---

## 📌 Objetivo do Exercício

Criar um programa orientado a objetos que:

- Modele consultores de diferentes especialidades
- Organize consultores em equipes
- Permita consultar uma equipe pelo nome
- Liste os consultores da equipe em ordem alfabética
- Informe quando a equipe não existir

---

## 🧠 Conceitos Utilizados

- Programação Orientada a Objetos (POO)
- Encapsulamento
- Herança
- Polimorfismo
- Classe abstrata
- Interface `Comparable`
- Coleções (`List`, `Map`)
- Ordenação com `Collections.sort()`

---

## 🧩 Estrutura do Projeto

O código é composto pelas seguintes classes:

- `Consultor` (classe abstrata)
- `ConsultorBackend`
- `ConsultorFrontend`
- `ConsultorDados`
- `Equipe`
- `Main`

---

## 👤 Classe `Consultor`

A classe `Consultor` é **abstrata** e representa um consultor genérico.

Ela contém os atributos comuns a todos os consultores:
- `nome`
- `especialidade`
- `nivel`

Além disso, implementa a interface `Comparable`, permitindo que os consultores sejam ordenados **alfabeticamente pelo nome**.

---

## 👩‍💻 Especialidades de Consultores

As classes:

- `ConsultorBackend`
- `ConsultorFrontend`
- `ConsultorDados`

herdam da classe `Consultor`, caracterizando o uso de **herança**.

O **polimorfismo** acontece porque todos os consultores são tratados como `Consultor`, independentemente da especialidade.

---

## 👥 Classe `Equipe`

A classe `Equipe` representa um grupo de consultores e contém:

- O nome da equipe
- Uma lista de consultores (`List<Consultor>`)

Ela possui métodos para:
- Adicionar consultores à equipe
- Retornar a lista de consultores ordenada alfabeticamente

---

## 🚀 Classe `Main`

A classe `Main` é responsável por:

- Criar as equipes (`Alpha` e `Beta`)
- Adicionar consultores às equipes
- Armazenar as equipes em um `Map`
- Ler do usuário o nome da equipe a ser consultada
- Exibir os consultores ordenados ou informar que a equipe não foi encontrada

---

## 📌 Conclusão

Este exercício demonstra, de forma prática, o uso de:

- Orientação a objetos em Java
- Herança e polimorfismo
- Organização de dados com coleções
- Ordenação de objetos

É um exemplo claro e didático de modelagem de sistemas em Java para gerenciamento de equipes.
