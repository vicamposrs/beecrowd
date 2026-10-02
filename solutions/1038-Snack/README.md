# 1038 - Snack

(Lanche)

## Resumo
Lê dois valores inteiros, representando um código de produto e a quantidade comprada.
Com isso, calcula o valor total da compra e exibe.

Tabela de produtos

| Código | Produto | Preço |
| --- | --- | --- |
| 1 | Cachorro Quente | R$ 4.00 |
| 2 | X-Salada | R$ 4.50 |
| 3 | X-Bacon | R$ 5.00 |
| 4 | Torrada Simples | R$ 2.00 |
| 5 | Refrigerante | R$ 1.50 |

---

**Abordagem:** Cria um vetor `preco` de ponto flutuante de tamanho 5, onde o ``índice - 1`` representa o código de um produto e seu conteúdo é o preço.
Lê os dois valores inteiros e calcula o total:
$$
Total = preco[codigo - 1] \times quantidade
$$
Ao fim exibe "Total: R$ " e o valor com duas casas decimais.  

---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1038)