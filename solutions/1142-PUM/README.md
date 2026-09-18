# 1142 - PUM

(PUM)

## Resumo
Lê um valor inteiro `N`, e exibe até a enésima linha nessa sequência(três numeros seguidos e PUM)

```text
1 2 3 PUM
5 6 7 PUM
9 10 11 PUM
...
```

---

**Abordagem:** Utiliza dois laços for. O primeiro percorre os valores de `1` até `4 * N`, com passo `4`, e determina o primeiro número de cada linha. O segundo percorre os valores de `0` até `2` e adiciona cada um deles ao valor inicial da linha, formando os três números consecutivos. Depois desses números, adiciona a palavra PUM ao `StringBuilder` e passa para a próxima linha. Ao final exibe tudo.


---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1142)