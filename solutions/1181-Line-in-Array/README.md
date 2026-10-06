# 1181 - Line in Array

(Linha na Matriz)

## Resumo

Lê o índice `L` de uma linha de uma matriz `12 × 12` e uma operação, que pode ser soma (`S`) ou média (`M`). Em seguida, lê os 144 valores da matriz, realiza a operação sobre os elementos da linha escolhida e exibe o resultado com uma casa decimal.

---

**Abordagem:** As duas implementações processam apenas os valores necessários, sem armazenar toda a matriz.

Na primeira implementação, descarta os valores das linhas anteriores a `L`, soma os 12 elementos da linha escolhida e depois descarta os valores restantes da entrada.

Na segunda implementação, utiliza dois laços `for` para percorrer as 12 linhas e as 12 colunas da matriz. Quando o índice da linha atual é igual a `L`, converte o valor lido e o adiciona à soma. Nas demais linhas, apenas realiza a leitura para avançar na entrada.

Após a leitura, verifica a operação escolhida:

- Se for `S`, exibe a soma dos elementos da linha;
- Se for `M`, divide a soma por `12` e exibe a média.

$$
\text{média} =
\frac{\text{soma dos elementos da linha}}{12}
$$

Ao final, exibe o resultado com uma casa decimal.

---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1181)