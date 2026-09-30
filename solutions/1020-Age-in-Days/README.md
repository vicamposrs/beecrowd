# 1020 - Age in Days

(Idade em dias)

## Resumo
Lê um inteiro de uma idade em dias e converte-a em anos, meses e dias e exibe o resultado no formato:

```text
x ano(s)
y mes(es)
z dia(s)
```

---

**Abordagem:** Divide o numero da idade por 365 para conseguir os anos. guarda o resto e divide por 30 para achar os meses e o resto são os dias.
$$
\text{anos} = \frac{IdadeEmDias}{365}
$$
$$
\text{meses} = \frac{IdadeEmDias \bmod 365}{30}
$$
$$
\text{dias} = (IdadeEmDias \bmod 365) \bmod 30
$$

---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1020)