# 1195 - Binary Search Tree

(Árvore Binária de Busca)

## Resumo

Lê uma quantidade de casos de teste e, para cada caso, recebe uma sequência de valores inteiros que são inseridos em uma Árvore Binária de Busca (BST).

Após a construção da árvore, exibe seus elementos utilizando os percursos em pré-ordem, em ordem e pós-ordem.

---

**Abordagem:** A árvore é representada por objetos da classe `Node`. Cada nó armazena um valor e referências para seus filhos `left` e `right`.

A raiz é criada a partir do primeiro valor recebido. Os demais valores são inseridos utilizando o método recursivo `insert()`. A cada chamada, o valor é comparado com o valor do nó atual. Caso seja menor, a inserção continua pela esquerda; caso contrário, pela direita. O processo continua até encontrar uma posição vazia (`null`), onde um novo nó é criado.

Após a construção da árvore, são realizados três percursos recursivos:

* **Pré-ordem:** raiz → esquerda → direita
* **Em ordem:** esquerda → raiz → direita
* **Pós-ordem:** esquerda → direita → raiz

Um `StringBuilder` é compartilhado entre as chamadas recursivas dos percursos para armazenar os resultados.

**Complexidade de inserção:** `O(h)` por elemento, sendo `h` a altura da árvore.

**Complexidade dos percursos:** `O(n)`

---

## Evolução da Solução

A primeira versão realizava toda a inserção dos nós diretamente no `main`. Para indicar que um valor já havia sido inserido, era atribuído `-1` à própria variável que armazenava esse valor. Os percursos retornavam `String` e utilizavam concatenações durante as chamadas recursivas.

Na segunda versão, os percursos passaram a receber um `StringBuilder`, evitando a criação de várias `String` intermediárias durante a recursão. O controle da inserção também deixou de utilizar o valor `-1` como sinal de parada e passou a utilizar um `boolean notInserted`, separando o valor armazenado da condição de controle.

Na versão atual, a lógica de inserção foi retirada do `main` e movida para o método `insert()` da classe `Node`. A inserção também passou a ser recursiva, fazendo com que cada nó seja responsável por continuar a busca pela posição adequada em sua própria subárvore.

---

🩷 **Categoria:** Grafos &nbsp; ![Grafos](https://img.shields.io/badge/BeeCrowd-Grafos-ff69b4)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1195)
