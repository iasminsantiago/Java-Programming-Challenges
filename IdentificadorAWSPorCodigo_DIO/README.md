# ☁️ Identificação de Serviço AWS por Código de Operação (Java)
## 🧠 Contexto

Este repositório contém a resolução de um desafio prático em Java, proposto em um cenário de migração de sistemas para a nuvem utilizando AWS.
Durante a transição, a equipe de uma startup precisa identificar rapidamente qual serviço AWS corresponde a um código de operação enviado por outros times. Como esses códigos podem conter erros de digitação, é fundamental que apenas valores válidos e exatos sejam aceitos, evitando falhas, atrasos e custos desnecessários.

## 📋 Descrição do Problema

O programa deve ler um código de operação, representado por uma string, e identificar a qual serviço AWS ele corresponde.
Os códigos válidos são:
"EC2"
"S3"
"Lambda"

Caso o código informado não corresponda exatamente a nenhum desses valores, o programa deve retornar:
Codigo invalido


A solução deve ser implementada utilizando apenas estruturas básicas de controle (if, else if, else) e sem uso de bibliotecas externas.

## ⌨️ Entrada
Uma única string, representando o código de operação enviado pela equipe.
A entrada deve ser considerada sensível a letras maiúsculas e minúsculas, conforme especificado no enunciado.

Exemplo de entrada:
EC2

## 📤 Saída
Uma única string, indicando o serviço AWS correspondente ou informando que o código é inválido.
Possíveis saídas:
EC2
S3
Lambda
Codigo invalido

## 🧪 Exemplos
Entrada	-- Saída
EC2	-- EC2
S3	-- S3
Lambda	-- Lambda
ec2	-- Codigo invalido


## 🛠️ Tecnologias Utilizadas

Linguagem: Java
Biblioteca padrão: java.util.Scanner
Estruturas utilizadas:
- Condicionais (if / else if / else)
- Comparação de strings com equals()

## 📝 Anotações e Decisões de Implementação
### 🔍 Uso de equals() em vez de contains()
Neste projeto, a comparação do código de operação é feita utilizando o método equals().
equals() realiza uma comparação exata entre duas strings
contains() verifica apenas se uma string contém parcialmente outra

Como o desafio exige que o código informado corresponda exatamente a "EC2", "S3" ou "Lambda", o uso de equals() é o mais adequado.
Dessa forma, entradas como "ec2" ou "XEC2" são corretamente classificadas como inválidas.
Em outros desafios que envolvem texto livre, o método contains() pode ser mais apropriado para identificar palavras-chave.
Neste caso, porém, a precisão da comparação é essencial, pois comandos incorretos podem impactar diretamente o processo de migração para a nuvem.

### 🧠 Estrutura if / else if / else
A estrutura condicional encadeada foi utilizada para garantir que apenas uma resposta seja retornada por execução e que todos os casos inválidos sejam corretamente tratados pelo bloco else.

### 🎯 Objetivo do Projeto
Praticar lógica condicional em Java
Trabalhar com comparação de strings
Aprender a diferenciar estratégias de validação conforme o tipo de entrada
Simular um cenário real de validação de comandos em ambientes de nuvem

## 🌱 Observações Finais
Este projeto faz parte do meu processo de aprendizado em Java.
Além da resolução do problema, o foco está em documentar as decisões de implementação, demonstrando entendimento do contexto e escolha consciente das ferramentas utilizadas.
