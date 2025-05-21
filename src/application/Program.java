package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		System.out.println("Exemplo 01:");

		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");

		set.remove("Tablet");
		
		for (String p : set) {
			System.out.println(p);
		}
		System.out.println();

/*--------------------------------------------------------------------------------------------------------------------------------*/
		
		System.out.println("Exemplo 02:");
		
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		
		set.removeIf(x -> x.length() >= 3);

		for (String p : set) {
			System.out.println(p);
		}
		System.out.println();
		
/*--------------------------------------------------------------------------------------------------------------------------------*/
		
		System.out.println("Exemplo 03:");
		
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		
		set.removeIf(x -> x.charAt(0) >= 'T');

		for (String p : set) {
			System.out.println(p);
		}
		System.out.println();

	}

}
/*       >>>>>     🧠 Essas são operações "individuais", que lidam com elementos um a um.     <<<<<

✅ 1. Operações (Operations)
São as operações básicas e gerais que podem ser feitas com qualquer tipo de coleção (Collection), incluindo Set, List, etc.

📌 Exemplos:
add(E e) – adiciona um elemento.

remove(Object o) – remove um elemento específico.

clear() – remove todos os elementos.

contains(Object o) – verifica se um elemento está presente.

isEmpty() – verifica se a coleção está vazia.

size() – retorna o número de elementos.

iterator() – fornece um iterador para percorrer os elementos.


*/

/*--------------------------------------------------------------------------------------------------------------------------------*/

/*

## ✅ Exemplo 01:

set.add("Tv");
set.add("Notebook");
set.add("Tablet");

set.remove("Tablet");

for (String p : set) {
    System.out.println(p);
}


```

### 📘 Explicação:

1. Adiciona três elementos ao conjunto: `"Tv"`, `"Notebook"`, `"Tablet"`.

2. Remove `"Tablet"` do conjunto com `remove("Tablet")`.

3. Itera e imprime os elementos restantes no conjunto.

**Notas conforme o Java Tutorials:**
* `add(E e)` adiciona um elemento, retornando `false` se o elemento já existir.
* `remove(Object o)` remove um elemento específico, se existir.
* A **ordem de impressão não é garantida** em `HashSet`.


---


## ✅ Exemplo 02:

set.add("Tv");
set.add("Notebook");
set.add("Tablet");

set.removeIf(x -> x.length() >= 3);
```

### 📘 Explicação:

1. Adiciona três elementos ao conjunto: `"Tv"`, `"Notebook"`, `"Tablet"`.

2. `removeIf` usa uma **expressão lambda** para remover todos os elementos cujo comprimento (`length`) é maior ou igual a 3.

   * `"Tv"` tem 2 caracteres → permanece.
   * `"Notebook"` e `"Tablet"` têm mais de 3 → são removidos.

**Notas conforme o Java Tutorials:**
* `removeIf(Predicate<? super E> filter)` está presente em `Collection` (interface mãe de `Set`).
* A função lambda `x -> x.length() >= 3` é uma forma concisa de usar **funções como objetos**, conforme introduzido em Java 8.


---


## ✅ Exemplo 03:

set.add("Tv");
set.add("Notebook");
set.add("Tablet");

set.removeIf(x -> x.charAt(0) >= 'T');
```

### 📘 Explicação:

1. Adiciona três elementos ao conjunto: `"Tv"`, `"Notebook"`, `"Tablet"`.
2. Remove os que começam com uma letra maior ou igual a `'T'` na tabela ASCII.

   * `"Notebook"` começa com `'N'` (antes de `'T'`) → permanece.
   * `"Tv"` começa com `'T'` → é removido.
   * `"Tablet"` começa com `'T'` → é removido.

**Notas conforme o Java Tutorials:**
* `charAt(0)` retorna o primeiro caractere de cada `String`.
* A comparação `>= 'T'` usa o valor Unicode (ou ASCII) dos caracteres.
* A ordenação lexicográfica é baseada nesses valores numéricos.
* O método `removeIf` permite **filtrar** elementos com base em **predicados**, aproveitando os recursos de **lambda expressions**.

*/
