# ☁️ Identificação de Serviços AWS a partir de Texto (Java)
## 🧠 Contexto
Este repositório contém a resolução de um desafio prático em Java, proposto em um contexto de migração de sistemas para a nuvem utilizando AWS.

O desafio simula um cenário real de atendimento inicial de suporte técnico, no qual solicitações dos clientes são recebidas em texto livre e precisam ser classificadas automaticamente para indicar qual serviço AWS é mais adequado, tornando o processo mais ágil e eficiente.

## 📋 Descrição do Problema
O sistema deve receber uma solicitação do cliente em formato de texto simples e, com base em palavras-chave presentes nessa solicitação, indicar qual serviço AWS corresponde à demanda informada.

Os serviços considerados no desafio são:
EC2 → demandas relacionadas a servidores virtuais
S3 → armazenamento de arquivos
RDS → bancos de dados relacionais
Lambda → execução de código sob demanda

Caso a solicitação não se encaixe em nenhuma dessas categorias, o programa deve retornar:
Servico desconhecido

A solução deve ser implementada utilizando apenas estruturas básicas de controle e sintaxe simples, sem uso de bibliotecas externas.

## ⌨️ Entrada
Uma única string, representando a solicitação do cliente em texto livre.
A entrada pode variar quanto ao uso de letras maiúsculas e minúsculas, devendo ser tratada de forma consistente pelo programa.
Exemplo de entrada:
Preciso de um servidor para rodar aplicacoes

## 📤 Saída
Uma única string, indicando o serviço AWS correspondente à solicitação recebida.

Possíveis saídas:
EC2
S3
RDS
Lambda
Servico desconhecido

🧪 Exemplos
Entrada	-- Saída
Preciso de um servidor para rodar aplicacoes	-- EC2
Quero armazenar imagens e videos	-- S3
Necessito de um banco de dados relacional	-- RDS
Preciso executar funcoes sem servidor	-- Lambda
Solicito um servico de inteligencia artificial	-- Servico desconhecido


## 🛠️ Tecnologias Utilizadas
- Linguagem: Java

- Estruturas utilizadas:
Condicionais (if / else if / else)
Manipulação de strings

- Biblioteca padrão: java.util.Scanner

## 📝 Anotações e Decisões de Implementação
Durante a implementação da solução, algumas decisões técnicas foram tomadas para garantir clareza, robustez e aderência ao enunciado:

### 🔤 Padronização da entrada
A solicitação do cliente é convertida para letras minúsculas antes das comparações.
Isso evita falhas causadas por diferenças de capitalização, já que o método contains() é sensível a maiúsculas e minúsculas.

### 🧠 Uso de if / else if / else
Foi utilizada a estrutura condicional sequencial para garantir que apenas um serviço AWS seja retornado por solicitação, respeitando a lógica de exclusividade proposta no problema.

### 🔍 Identificação por palavras-chave
O método contains() foi utilizado para verificar a presença de frases-chave na solicitação, conforme orientado pelo enunciado, sem recorrer a bibliotecas externas ou estruturas avançadas.
Essas decisões priorizam simplicidade, legibilidade e fidelidade às regras do desafio.

## 🎯 Objetivo do Projeto
Praticar lógica condicional em Java
Trabalhar com manipulação básica de strings
Simular um cenário real de suporte em ambientes de nuvem
Consolidar fundamentos importantes para desafios técnicos e entrevistas em nível júnior

# 🌱 Observações Finais

Este projeto faz parte do meu processo de aprendizado em Java e computação em nuvem.
As anotações presentes no código e neste README refletem decisões conscientes de implementação, visando não apenas resolver o problema, mas também documentar o raciocínio por trás da solução.
