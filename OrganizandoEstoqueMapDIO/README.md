# 🧠 Organizando Estoque | Organizing Inventory

🇧🇷 **PT**

Este projeto foi desenvolvido como parte de um desafio em Java.  
O objetivo é ler uma lista de lojas com suas quantidades de produtos e calcular o total por loja, **mantendo a ordem original**.

O código também faz uma **ponte com Python**, mostrando como conceitos como *Map* (Java) e *dict* (Python) têm funções parecidas.

---

## ⚙️ **Como Funciona**

1. O usuário digita algo como:  
LOJA1:10,LOJA2:5,LOJA1:3
2. O programa:
- Separa os pares loja:quantidade.  
- Usa um `LinkedHashMap` para somar os valores de lojas repetidas.  
- Monta uma string de saída no formato `LOJA1:13,LOJA2:5`.

---

## 📘 **Detalhes do Código**

🔹 **`Scanner`**  
Usado para ler a entrada do usuário (linha digitada no console).

🔹 **`LinkedHashMap<String, Integer>`**  
Armazena o nome da loja (chave) e o total de produtos (valor).  
Mantém a **ordem de inserção**, o que é essencial para preservar a ordem das lojas na saída.

🔹 **`split(",")` e `split(":")`**  
Dividem a entrada em partes menores:
- `,` separa as lojas.  
- `:` separa o código da loja e a quantidade.

🔹 **`getOrDefault(codigo, 0)`**  
Verifica se o código já existe no mapa.  
Se não existir, retorna `0` para evitar erro ao somar.

🔹 **`StringBuilder`**  
Usado para montar a saída final de forma eficiente (melhor desempenho do que concatenar com `+` em loops).

🔹 **`setLength(sb.length() - 1)`**  
Remove a última vírgula da string antes de exibir o resultado.

---

## 🧩 **Comparação Java × Python**

| Conceito | **Python** | **Java** |
|-----------|-------------|-----------|
| Estrutura | `dict` | `Map<K, V>` |
| Exemplo | `estoque = {}` | `Map<String, Integer> estoque = new HashMap<>();` |
| Inserir | `estoque["LOJA1"] = 10` | `estoque.put("LOJA1", 10);` |
| Acessar | `estoque["LOJA1"]` | `estoque.get("LOJA1");` |
| Verificar chave | `"LOJA1" in estoque` | `estoque.containsKey("LOJA1");` |
| Remover | `del estoque["LOJA1"]` | `estoque.remove("LOJA1");` |
| Iterar | `for codigo, qtd in estoque.items():` | `for (Map.Entry<String, Integer> entry : estoque.entrySet())` |

---

## 🧮 **Exemplo**

| Entrada | Saída |
|----------|--------|
| `LOJA1:10,LOJA2:5,LOJA1:3` | `LOJA1:13,LOJA2:5` |
| `LOJA3:20,LOJA3:15,LOJA4:7` | `LOJA3:35,LOJA4:7` |

---

💡 *Este projeto me ajudou a entender melhor estruturas de dados em Java e como elas se relacionam com os dicionários em Python.*
