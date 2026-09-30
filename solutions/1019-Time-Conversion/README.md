# 1019 - Time Conversion

(Conversão de Tempo)

## Resumo
Lê um inteiro de segundos e  converte-o em horas, minutos e segundos e exibe o resultado no formato `horas:minutos:segundos`.

---

**Abordagem:** Divide o total de segundos por `3600` para calcular a quantidade de horas:

$$
\text{horas} = \frac{\text{total de segundos}}{3600}
$$

Utiliza o resto da divisão por `3600` para obter os segundos que ainda precisam ser convertidos. Depois, divide esse valor por `60` para calcular os minutos:

$$
\text{minutos} = \frac{\text{total de segundos} \bmod 3600}{60}
$$

Por fim, utiliza o resto da divisão por `60` para obter os segundos restantes:

$$
\text{segundos} = \text{total de segundos} \bmod 60
$$

Ao final, exibe o resultado no formato `horas:minutos:segundos`.


---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1019)