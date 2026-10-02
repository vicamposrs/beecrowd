# 1035 - Selection Test 1

(Teste de Seleção 1)

## Resumo
Lê quatro valores inteiros `A`, `B`, `C` e `D`. Verifica as seguintes condições:
 - `B` maior que `C`
 - `D` maior que `A`
 - `C + D` maior que `A + B`
 - `C` e `D` positivos 
 - `A` par
 
Se obedecer todas condiçoes retorna "Valores aceitos", se não "Valores nao aceitos"

---

**Abordagem:** Cria a variável inteira `aceito` com o valor inicial `1`, utilizando-a como uma flag para representar que os valores são válidos.

Em seguida, verifica as condições contrárias às exigidas pelo problema. Caso alguma delas seja verdadeira, altera ``aceito`` para ``0``.

Ao final, utiliza um ``if`` para verificar o valor da flag e determinar qual mensagem deve ser exibida.


---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1035)