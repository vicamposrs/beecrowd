# 1030 - Flavious Josephus Legend

(A Lenda de Flavious Josephus)

## Resumo
Lê a quantidade de casos de teste. Para cada caso, recebe dois valores inteiros: o primeiro representa o número de pessoas e o segundo o passo utilizado nas eliminações. Para cada par, determina qual pessoa permanece após todas as outras serem removidas seguindo esse passo. Ao final, exibe o resultado de todos os casos.

---

**Abordagem 1 (Main):**  Lê o par de valor `n` e `k`, cria um vetor boolean com `n` posições para representar quais pessoas já foram removidas. Utiliza um `for` para realizar `n - 1` eliminações e, a cada eliminação, percorre as posições utilizando outro `for` e um `while` para ignorar posições já removidas, até alcançar o próximo elemento válido.

**Abordagem 2 (SolutionLikedList):**  Lê o par de valor `n` e `k`, cria uma `LinkedList<Integer>`  com numeros de `1` a `n`, após isso, com um for de `0` a `n - 1`. Em cada eliminação, calcula diretamente o índice do próximo elemento a ser removido utilizando a posição atual, o passo `k` e a quantidade de elementos restantes na lista. O elemento dessa posição é removido até restar apenas um.

**Abordagem 3 (SolutionCircularList):**  Lê o par de valor `n` e `k`, cria uma lista encadeada própria contendo os números de `1` a `n`, liga o inicio ao final. Em cada eliminação, percorre a lista seguindo os próximos nós até atingir a posição correspondente ao passo e remove o nó encontrado, repetindo o processo até restar apenas um.

**Futura Abordagem :**  Utilizar a recorrência matemática do problema de Josephus para calcular diretamente a posição do sobrevivente.

---

🟡 **Categoria:** Ad-Hoc &nbsp; ![Ad-Hoc](https://img.shields.io/badge/BeeCrowd-Ad--Hoc-yellow)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1030)