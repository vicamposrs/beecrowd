# 1026 - To Carry or not to Carry

(Vai Um ou Não Vai Um?)

## Resumo
Lê pares de valores inteiros até não ter mais(EOF), calcula o valor inteiro que corresponde ao XOR bit a bit de cada par e exibe os resultados ao final.

---

**Abordagem 1 (Main):**  Vai lendo os valores em um `while` até `EOF`,comparando se `readLine()` diferente de `null`. Para cada par de valores usa o operador `^` para calcular o XOR.

*Complexidade por par:* `O(1)`

**Abordagem 1 (Main):**  Vai lendo os valores em um `while` até `EOF`,usando a condição `sc.hasNext()`. Para cada par calcula o XOR manualmente. Enquanto pelo menos um dos dois valores forem diferentes de zero, calcula o bit atual, multiplica-o pela potência de 2 correspondente e adiciona à soma. Em seguida, divide os dois valores por 2 e avança para a próxima potência. Ao final, obtém o valor inteiro correspondente ao XOR.

*Complexidade por par:* `O(log(max(a, b)))`

---

🟡 **Categoria:** Ad-Hoc &nbsp; ![Ad-Hoc](https://img.shields.io/badge/BeeCrowd-Ad--Hoc-yellow)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1026)