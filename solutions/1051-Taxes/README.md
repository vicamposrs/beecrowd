# 1051 - Taxes

Calcula o imposto de forma progressiva por faixas: lê um valor e, dependendo da faixa em que ele se encaixa, aplica a alíquota correspondente sobre o excedente, somando ao total já acumulado das faixas anteriores.

**Abordagem:** uma cadeia de `if/else if`, uma por faixa. Para faixas mais altas, o imposto das faixas anteriores é pré-calculado como constante, somando só a alíquota da faixa atual sobre o excedente — evita recalcular tudo durante a execução.

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1051)