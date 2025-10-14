Verificador de Campos Obrigatórios
## Descrição

Este projeto é uma pequena aplicação em Java que simula a validação de um cadastro de cliente em um sistema bancário. O programa verifica se os campos obrigatórios — nome, CPF e email — foram preenchidos corretamente.

Se algum campo estiver vazio, o sistema informa que o cadastro está incompleto. Caso todos os campos sejam preenchidos, o sistema confirma que o cadastro foi validado com sucesso.

### Entrada

O programa lê três valores do tipo String, representando:

Nome do cliente

CPF do cliente

Email do cliente

Os campos podem ser deixados em branco.

### Saída

Cadastro incompleto: se algum campo estiver vazio.

Cadastro validado com sucesso: se todos os campos estiverem preenchidos.

### Exemplos

Exemplo 1:
Entrada:

Carlos
12345678900
c@email.com


Saída:

Cadastro validado com sucesso


Exemplo 2:
Entrada:

987654322
fab@email.com



Saída:

Cadastro incompleto


Exemplo 3:
Entrada:

Ana

ana@email.com


Saída:

Cadastro incompleto
