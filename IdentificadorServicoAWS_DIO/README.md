------------------- bootcamp CI&T + DIO

Este projeto resolve um desafio prático em Java cujo objetivo é identificar automaticamente o serviço AWS mais adequado a partir de uma solicitação escrita em linguagem natural.
A ideia central é simular um cenário de atendimento inicial de suporte técnico, no qual o sistema recebe uma mensagem do cliente e, com base em palavras-chave, retorna o serviço correspondente.

O mapeamento esperado é:
EC2 → demandas relacionadas a servidores virtuais

S3 → armazenamento de arquivos

RDS → bancos de dados relacionais

Lambda → execução de funções sem servidor

Caso a solicitação não se encaixe em nenhuma dessas categorias → Servico desconhecido


⌨️ Entrada
Uma única string, representando a solicitação do cliente em texto livre.

A entrada pode variar em termos de capitalização (maiúsculas e minúsculas) e forma de escrita, devendo ser tratada de maneira consistente pelo programa.
Exemplo de entrada:
Preciso de um servidor para rodar aplicacoes


📤 Saída
Uma única string, indicando qual serviço AWS é o mais adequado para a solicitação recebida.

Possíveis saídas:
EC2
S3
RDS
Lambda
Servico desconhecido



📝 Anotações e Decisões de Implementação
Durante a implementação da solução, algumas decisões técnicas foram tomadas com o objetivo de tornar o código mais robusto, legível e fiel ao enunciado:

Padronização da entrada para letras minúsculas
A solicitação do cliente é convertida para minúsculas antes das comparações, garantindo que diferenças de capitalização não afetem o funcionamento do método contains().

Uso de if / else if / else
Essa estrutura garante que apenas um único serviço AWS seja retornado por solicitação, respeitando a lógica de exclusividade exigida pelo problema.

Uso do método contains()
A identificação do serviço é feita a partir da presença de frases-chave na solicitação, conforme orientado pelo enunciado, sem uso de bibliotecas externas ou estruturas avançadas.

*Como contains é case sensitive, as strings em if/else foram digitadas em minúsculo, diferente do que os exemplos da questão mostram, para garantir que o que foi armazenado em _texto_ (minúsculo) seja corretamente lido no bloco de decisão.*

Essas escolhas priorizam clareza, simplicidade e aderência às regras do desafio, além de facilitarem a leitura e manutenção do código.

🎯 Objetivo do Projeto
Praticar lógica condicional em Java
Trabalhar com manipulação básica de strings
Simular um cenário real de suporte em ambientes de nuvem
Consolidar fundamentos importantes para desafios técnicos e entrevistas em nível júnior
