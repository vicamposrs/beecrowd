# 1079 - Weighted Averages

(Médias Ponderadas)

## Resumo
Lê um valor inicial inteiro de quantas médias serão feitas, a partir dele se lê três valores flutuantes ( A , B , C ) com até uma casa decimal, para cada trio se calcula a média usando os pesos 2, 3 e 5 respectivamente e exibe tudo no final com uma casa decimal cada.

---

**Abordagem:** um laço de `0` até `N-1` (onde `N` é o valor lido inicialmente). 
Em cada iteração lê-se A, B e C e calcula-se:
$$
\text{média} = \frac{A \times 2 + B \times 3 + C \times 5}{10}
$$

---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1079)