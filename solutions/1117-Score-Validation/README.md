# 1117 - Score Validation

(Validação de Nota)

## Resumo

Lê valores até receber duas notas válidas (no intervalo [0 ; 10]), e calcula sua média. Ao fim exiba uma mensagem para cada nota inválida e a média das notas válidas.

---

**Abordagem:**  Utiliza um `for` para controlar a leitura das duas notas válidas. Dentro de cada repetição, um `while (true)` continua lendo valores até encontrar uma nota pertencente ao intervalo `[0, 10]`. Quando uma nota válida é encontrada, seu valor é armazenado e o `break` encerra o laço interno, permitindo a busca pela próxima nota. Para cada valor inválido, adiciona a mensagem `nota invalida` ao `StringBuilder`. Após obter as duas notas válidas, calcula a média e adiciona o resultado à saída.

---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1117)
