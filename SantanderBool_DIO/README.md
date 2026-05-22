# Sistema de Saudação Bancária em Java

##  Objetivo

Este exercício simula um sistema simples de boas-vindas de um banco digital.

O programa:
- lê o nome do cliente;
- lê o tipo de conta;
- verifica se o tipo é válido;
- exibe uma mensagem personalizada;
- ou mostra erro caso a conta não exista.

---


#  Coisas importantes aprendidas

## 1️⃣ Comparar String em Java

Em Java NÃO usamos:

```java
tipoConta == "corrente"
```

Usamos:

```java
tipoConta.equals("corrente")
```

Porque `.equals()` compara o conteúdo do texto.

---

# 2️⃣ Escopo de variável

Variáveis criadas dentro de `{ }`
só existem naquele bloco.

Exemplo:

```java
if (true) {
    int numero = 10;
}

System.out.println(numero); // ERRO
```

O `numero` não existe fora do `if`.

---

# 3️⃣ Boolean

Boolean guarda:
- `true`
- `false`

Sempre minúsculo em Java.

```java
boolean contaValida = true;
```

---

# 4️⃣ printf e `%s`

`printf` serve para formatar texto.

Exemplo:

```java
System.out.printf(
    "Olá %s",
    nome
);
```

Se `nome = "Ana"`:

```text
Olá Ana
```

---

# 5️⃣ Operador OU (`||`)

Usado quando basta UMA condição ser verdadeira.

```java
if (a || b || c)
```

Significa:

> "se a OU b OU c forem verdadeiros"

---

#  Resultado Final

## Entrada

```text
Ana corrente
```

## Saída

```text
Bem-vindo(a), Ana! Sua conta corrente esta pronta para uso.
```

---

#  Evolução importante nesse exercício
Pratiquei:
- `if`
- `else`
- boolean
- escopo
- comparação de String
- `printf`
- operadores lógicos (`||`)
- separação da lógica do programa

