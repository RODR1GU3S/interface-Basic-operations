````markdown
# Operações Básicas com Collection em Java

Este repositório apresenta um exemplo simples em Java utilizando a interface `Collection` através da implementação `HashSet`.
 O objetivo é demonstrar operações fundamentais que podem ser realizadas com coleções, como inserção, remoção e filtragem de elementos.

## 📂 Estrutura

- **Pacote:** `application`
- **Classe principal:** `Program.java`

## 🧠 Conceitos Demonstrados

O código está dividido em três exemplos principais:

### ✅ Exemplo 01: Inserção e Remoção Simples
Adiciona elementos ao conjunto e remove um item específico.

```java
set.add("Tv");
set.add("Notebook");
set.add("Tablet");

set.remove("Tablet");
````

### ✅ Exemplo 02: Remoção com Predicado (Lambda)

Remove todos os elementos que tenham comprimento maior ou igual a 3.

```java
set.removeIf(x -> x.length() >= 3);
```

### ✅ Exemplo 03: Remoção Condicional por Caracteres

Remove todos os elementos cujo primeiro caractere seja maior ou igual a `'T'`.

```java
set.removeIf(x -> x.charAt(0) >= 'T');
```

## 🧰 Tecnologias Utilizadas

* Java 17+ (pode ser adaptado para versões anteriores com pequenas modificações)
* `java.util.HashSet`
* Expressões lambda

## 🚀 Como Executar

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```
2. Abra o projeto em uma IDE Java (Eclipse, IntelliJ, VS Code, etc.).
3. Compile e execute a classe `Program`.

## 📌 Observações

* A interface `Set` não permite elementos duplicados.
* `HashSet` não mantém ordem dos elementos.
* Os exemplos mostram formas de manipular coleções de forma genérica e funcional, usando lambdas.

```
