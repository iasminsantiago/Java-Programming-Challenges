# 🚕 Desafio Escolha de Táxi

Este projeto contém uma solução em **Java** para o problema de decisão entre duas empresas de táxi, baseado em custos de taxa fixa e valor por quilômetro rodado.

## 📝 O Problema

O objetivo é ajudar um usuário a decidir qual empresa de táxi escolher (Empresa 1 ou Empresa 2). 
O cálculo do custo segue a fórmula:
**Custo = Taxa Fixa + (Valor por KM × Distância)**

### Possíveis Retornos:
1.  **"Tanto faz"**: Se os valores forem iguais para qualquer distância.
2.  **"Empresa 1"**: Se a Empresa 1 for sempre a mais barata.
3.  **"Empresa 2"**: Se a Empresa 2 for sempre a mais barata.
4.  **Frase de transição**: Se a escolha depender da distância percorrida (exemplo: Empresa 1 até 10km, Empresa 2 após 10km).

## 🚀 Lógica Aplicada

A solução utiliza **Funções de Primeiro Grau**. Para encontrar o momento exato em que os preços se igualam (Ponto N), igualamos as funções das duas empresas:

`TF1 + VQR1 * N = TF2 + VQR2 * N`

A distância de equilíbrio é dada por:
`N = (TF2 - TF1) / (VQR1 - VQR2)`

## 🛠️ Tecnologias
* **Java 8+**
* **Manipulação de Strings e Doubles**
* **Lógica Matemática e Arredondamento**

## 📖 Como usar
Basta chamar o método estático `escolheTaxi` passando os valores como strings:

```java
String resultado = Challenge.escolheTaxi("2.50", "1.00", "5.00", "0.75");
System.out.println(resultado);
// Saída: Empresa 1 quando a distância < 10.0, Tanto faz quando a distância = 10.0, Empresa 2 quando a distância > 10.0
