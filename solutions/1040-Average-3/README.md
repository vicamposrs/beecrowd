# 1040 - Média 3

(Média 3)

## Resumo
Lê quatro valores de ponto flutuante que representam as notas de um aluno e calcula a média ponderada utilizando os pesos 2, 3, 4 e 1.

Com base na média:
 - Se for maior ou igual a 7.0, o aluno é aprovado;
 - Se for menor que 5.0, o aluno é reprovado;
 - Se estiver entre 5.0 e 7.0, o aluno deverá realizar um exame.

No último caso, lê a nota do exame, calcula a média final e informa se o aluno foi aprovado ou reprovado.

---

**Abordagem:** Armazena as quatro notas em um vetor e utiliza um laço for para multiplicar cada uma pelo seu respectivo peso. Depois, divide a soma dos resultados pela soma dos pesos:

$$
\text{média} =
\frac{A \times 2+B \times 3+C \times 4+D \times 1}{10}
$$

Em seguida, verifica a situação do aluno de acordo com a média calculada.

Caso o aluno esteja em exame, lê a nota obtida e calcula a média final por meio da fórmula:

$$
\text{média final} =
\frac{\text{média inicial}+\text{nota do exame}}{2}
$$

Se a média final for maior ou igual a 5.0, o aluno é aprovado. Caso contrário, é reprovado. Todas as médias são exibidas com uma casa decimal.

---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1040)