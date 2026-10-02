# 1036 - Bhaskara's Formula

(Fórmula de Bhaskara)

## Resumo
Lê três valores ponto flutuante, `a` , `b` e `c`, representando coeficientes de uma equação quadrática `a*x^2 + b*x + c = 0`.
Em seguida, calcula e exibe suas duas raízes com cinco casas decimais. Caso não seja possível calculá-las, exibe a mensagem  "Impossivel calcular".

---

**Abordagem:** Lê os três valores e calcula ``delta``:
$$
\Delta = b^2 - 4 a c
$$
Verifica se `delta` é menor que `0` ou `a` é `0`, se verdadeiro retorna `"Impossivel calcular"` e da return.
Case falso, continua o programa e calcula as duas raizes:
$$
x = \frac{-b ± \sqrt{\Delta}}{2a}
$$
Ao final, exibe as raízes precedidas por R1 = e R2 =, utilizando printf com %.5f para mostrar cinco casas decimais.

---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1036)