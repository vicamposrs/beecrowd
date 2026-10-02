# 1028 - Collectable Cards

(Cartas Colecionáveis)

## Resumo
Lê um número inteiro que representa a quantidade de casos de teste. Para cada caso, lê as quantidades de cartas de dois jogadores e calcula o maior tamanho possível dos grupos em que as cartas podem ser divididas igualmente.

Ao final, exibe o máximo divisor comum(``mdc``) entre os dois valores de cada caso.

---

**Abordagem:** Utiliza o algoritmo de Euclides para calcular o máximo divisor comum (MDC) entre as duas quantidades de cartas.

Enquanto o segundo valor for diferente de zero, guarda-o temporariamente, substitui-o pelo resto da divisão entre os dois valores e atribui o valor anterior à primeira variável:

$$
\operatorname{MDC}(a,b) = \operatorname{MDC}(b,a \bmod b)
$$

Quando o segundo valor se torna zero, o primeiro contém o MDC. Cada resultado é armazenado em um vetor e todos são exibidos ao final.

---

⚪ **Categoria:** Matemática &nbsp; ![Matemática](https://img.shields.io/badge/BeeCrowd-Matemática-918779)
---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1079)