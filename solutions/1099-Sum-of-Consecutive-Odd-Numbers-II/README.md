# 1099 - Sum of Consecutive Odd Numbers II

(Soma de Ímpares Consecutivos II)

## Resumo
Lê um valor inicial inteiro de quantos casos serão feitos, a partir dele se lê dois valores inteiros. Para cada dupla se calcula a soma dos números ímpares entre eles (não os incluindo) e exibe tudo no final.

---

**Abordagem:** Um laço `for` de `0` até `N-1` (onde `N` é o valor lido inicialmente).
Em cada iteração lê-se X e Y, garantindo que estejam em ordem crescente. Encontra-se o primeiro ímpar **estritamente maior que X** (`X + 1` se X for par, `X + 2` se X for ímpar) e, a partir dele, percorre-se com passo `2` até `Y` (exclusivo), somando cada valor à variável `soma` — dessa forma X e Y nunca entram na soma, mesmo quando um deles é ímpar. Os resultados são guardados em um `StringBuilder`.
Ao final, exibe-se o conteúdo do `StringBuilder`.

---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1099)