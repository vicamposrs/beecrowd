# 1018 - Banknotes

(Cédulas)

## Resumo
Lê um valor inteiro que representa uma quantia em reais e calcula quantas cédulas de `100`, `50`, `20`, `10`, `5`, `2` e `1` são necessárias para representar esse valor utilizando a menor quantidade possível. Ao final, exibe o valor original e a quantidade utilizada de cada cédula.

---

**Abordagem:**  Cria dois vetores: um previamente preenchido com os valores das cédulas e outro destinado a armazenar as respectivas quantidades.

Utiliza um laço `for` que percorre os sete tipos de cédula, do maior para o menor. Em cada repetição, divide o valor restante pelo valor da cédula atual para determinar quantas unidades podem ser utilizadas. Em seguida, utiliza o operador `%` para obter o valor que ainda falta representar.

Ao final, exibe a quantidade de cada cédula no formato `x nota(s) de R$ y,00`.

---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1018)