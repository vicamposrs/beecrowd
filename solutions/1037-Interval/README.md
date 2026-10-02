# 1037 - Interval

(Intervalo)

## Resumo
Lê um valor de ponto flutuante e determina a qual dos seguintes intervalos ele pertence:

 - [0,25];
 - (25,50];
 - (50,75];
 - (75,100].

Caso o valor não pertença a nenhum desses intervalos, informa que ele está fora do intervalo.

---

**Abordagem:** Lê o valor com um Scanner, em seguida confere se ele está fora de qualquer um dos intevalos (`x < 0` ou `x > 100`), se sim exibe `"Fora de intervalo"`.
Em seguida passa por uma ``cadeia if else`` comparando se o numero é menor ou igual ao limite superior de cada intervalo, e se for guarda um string dele para exibir no final após `"Intervalo\n"`.
Como as condições são verificadas em ordem crescente, não é necessário comparar novamente os limites inferiores. 

---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1037)