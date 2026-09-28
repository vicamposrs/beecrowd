# 1005 - Average 1

(Média 1)

## Resumo
Lê dois valores de ponto flutuante, calcula a media ponderada entre eles com os pesos `3.5` e `7.5` e exibe o resultado com 5 casas decimais.

---

**Abordagem:** Lê dois valores do tipo `double` e armazena seus respectivos pesos em um array. Utiliza um laço `for`, de `0` até `1`, para multiplicar cada valor pelo seu peso e acumular os resultados em uma variável. Em seguida, divide essa soma pela soma dos pesos e exibe a média com cinco casas decimais com `printf(".5f",media)`.

$$
\text{média} = \frac{A \times 3.5 + B \times 7.5}{11}
$$

---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1005)