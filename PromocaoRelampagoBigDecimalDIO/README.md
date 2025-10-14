# 💥 Desafio - Promoção Relâmpago

### 🛍️ Descrição
Na loja de departamentos **SuperCompras**, o gerente decidiu fazer uma promoção especial.  
Dependendo do valor da compra, os clientes receberão **diferentes descontos**.

Este programa lê o valor da compra e determina qual desconto deve ser aplicado, conforme as regras:

| Faixa de Valor | Desconto |
|-----------------|-----------|
| Menor que R$ 50,00 | 0% |
| De R$ 50,00 até R$ 100,00 (inclusive) | 10% |
| Acima de R$ 100,00 | 20% |

---

### 🧩 **Entrada**
- Uma **string** representando o valor da compra, com duas casas decimais.
- Exemplo: `75.00`

### 🧾 **Saída**
- Uma string informando o desconto aplicado.
- Exemplo: `Desconto de 10%`

---

### 💡 **Exemplos**

| Entrada | Saída Esperada |
|----------|----------------|
| `49.99` | Desconto de 0% |
| `75.00` | Desconto de 10% |
| `150.00` | Desconto de 20% |

---

### ⚙️ **Lógica do Programa**
O código usa a classe **`BigDecimal`** para tratar os valores monetários com precisão,  
evitando erros de arredondamento que poderiam acontecer com o tipo `double`.

1. O valor digitado é lido como **string**.  
2. É convertido para um **BigDecimal**.  
3. O programa compara esse valor com os limites de desconto (`50.00` e `100.00`) usando o método `.compareTo()`.  
4. Por fim, retorna a mensagem com o desconto correspondente.

---

### 🧠 **Aprendizados**
- Uso da classe `BigDecimal` para representar valores decimais.  
- Comparações usando o método `compareTo()`.  
- Estrutura condicional (`if`, `else if`, `else`).  
- Leitura de entrada com `Scanner`.  

---

### ▶️ **Execução**

Compile o programa com:
```bash
javac PromocaoRelampago.java
