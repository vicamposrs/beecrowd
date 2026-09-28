# 1021 - Banknotes and Coins

(Cédulas e Moedas)

## Resumo
Lê um valor monetário e calcula a quantidade necessária de cada cédula e moeda para representá-lo utilizando a menor quantidade possível.

---

**Abordagem:** Utiliza uma estratégia gulosa, processando as cédulas e moedas da maior para a menor.

Primeiro, multiplica o valor lido por 100 e converte o resultado para um número inteiro, permitindo que todos os cálculos sejam realizados em centavos. Cria um vetor com os valores das cédulas e moedas em centavos e outro para armazenar suas respectivas quantidades.

Em cada repetição do laço for, divide o valor restante pelo valor da cédula ou moeda atual para calcular a quantidade utilizada. Depois, subtrai do total o valor correspondente:

$$
\text{quantidade}_i =
\frac{\text{valor restante}}{\text{valor}_i}
$$

$$
\text{valor restante} =
\text{valor restante} -
(\text{quantidade}_i \times \text{valor}_i)
$$

Ao final, percorre separadamente as posições correspondentes às cédulas e às moedas e exibe suas quantidades com os valores formatados com duas casas decimais.

---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1021)