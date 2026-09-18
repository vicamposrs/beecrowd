# 1145 - Logical Sequence 2

(Sequência Lógica 2)

## Resumo
Lê dois valores inteiros `X` e `Y`, e exibe todos números de 1 a Y pulando de linha a cada X elementos.

---

**Abordagem:** Utiliza um laço `for` que percorre os valores de `1` até `Y - 1`. Em cada repetição, adiciona o valor atual no `StringBuilder`,apóss isso, verifica se o valor é divisivel de `X` (i%X == 0), se for adiciona `"\n"` (quebra de linha), se não, adiciona um `" "`(espaço). Ao final adiciona Y e exibe todo conteudo armazenado. 


---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1145)