# <font color ="red"><center> Java </center></font>
<center> Java </center>
</br>
## HISTORIA
  foi criado pela SUN Microsystems
-- > SUN = Stanford University Network
- Objetivo: rodar código em qualquer sistema operacional. -> foi engavetado por ser muito ambicioso (=distribuível)
Net Scape, navegador, fez parceira com SUN e resgatou o java da gaveta

- devido a sua robustez, pode ser usado em máquinas antigas e atuais, grandes pcs e dispositovos moveis, sistemas grandes e pequenos.

## CARACTERÍSTICAS
- fortemente tipado -> posso criar tipos de dados também -> criando classes e instanciando objetos que tem ela como tipo


## TIPOS DE DAODS
- float: decimal curto
- double: decimal longo
- char: 1 caractere, indicado por aspas simples ''
- string: cadeira de chars, indicado por aspas duplas " "

## BIBLIOTECAS
- funções prontas, para usá-las basta que importemos e as chamemos no código

## COMPILADO VS. INTERPRETADO
- a linguagem de alto padrão é transformada em binária através de um programa conversor. Ele pode ser compilador ou interpretador.
- O Java tem compilador. executamos o programa e ele é compilado apenas 1 vez, gerando código-objeto, que pode ser executado várias vezes.
- o Python tem interpretador, a conversão de linguagem ocorre cada vez que o programa é executado.


## 

## PACOTES JAVA
JRE - só rodar apps java, pacote necessário para rodarmos o JVM.
JDK - rodar e desenvovler kit. Sem ele, não dá para desenvolver programs java. 
SE - para APIs

## CARACTERÍSTICAS
- Distribuível, basta a máquina ter o JRE. O código pode ser distribuido, java.class, para varios SOs.
- Portavel - RORA - Não precisa compilar o programa em cada SO. O bytecode é interpretável a cada JVM de sistema operacional. 
- multi-thread = escalonável
- arquitetura neutra, não se prende a um SO específico
- Distribuível, podemos rodar em pc e celular etc
- Seguro - tem camadas de segurança

## CÓDIGO
### PROCESSAMENTO -  QUANDO CLICAMOS EM RUN, QUE COMANDOS SÃO EQUIVALENTES/O QUE ACONTECE?
Compila e executa o bytecode
1. Após criar e escrever o arquivo programinha.java, digito (no temrinal):
2. ```javac programinha.java```  COMPILA o codigo-fonte -> cria o bytecode programinha.class na pasta bin. Esse arquivo .class é o bytecode! Agora posso enviar esse arquivo par qualuer s.o. que tenha jvm instalado, e este o executará  com o comando abaixo
3. ```java progrmianha``` EXECUTA o bytecode (a JVM do meu windows executa)


### usuário informa valor
- preciso suar biblio chamada Scanner, importarei ela
```java
...
import java.util.Scanner;

// é linguagem OO, então TODO código SEMPRE estará dentro de uma classe. A classe main é a classe principal.
class Main {
  public static void main (String][] args) {
    System.out.print("Hello, World!");

    // criei um objeto do tipo Scanner. Estou instanciando um novo objeto do tipo Scanner
    Scanner leitura = new Scanner(System.in);
    // System.in = uso meu objeto leitura para ler algo da tela

    System.out.print("Digite um número: ");
    int num = leitura.nextInt();
    // captura o digitado no teclado e, ao mesmo tempo, converte para número inteiro
    // usa leitura para ler o numero inteiro, aplicando a funçao nextInt para ler um numero inteiro digitado pelo usuario
    // armazena essa leitura do teclado na variavel num

```
### JVM
- programa que conversa com o SO
- dependente do sistema operacional. Possibiltia código java rodar em qualquer sistema pois cada sistema tem uma JVM específica, a máquina virtual para aquele s.o.
- Como a JVM age:  converte .java em bytecode e depois em binário
- java.java -> javac => java.class -> jvm no windows, linux e os => roda sem problemas

## PROGRAMA JAVA
- todos os programas java são colocados dentro de pacotes/packages/*pastas*
# Java Web
- tomcat é o servidor
> **Obs.:** 


## POO
### CLASSE
  se algo do mundo rela gera informações, posso representá-lo em uma classe.
    carro -> cor, chassi, modelo, ano, renavan etc
    enquanto a classe nao tiver instancias, ela é só um texto. 
    Mas esse texto tem objetivo de ilustrar todas as instruções e criaçÕes de variáveis que precisamos para trabalhar os dados no programa e os gravar num banco de dados.
    quando a classe se tornar viva (ser instanciada), 
---
Fontes:
Programa Start da Capgemini
Pós-graduação em Análise e Desenvolvimento de Sistemas (ADS) da PUC MINAS
