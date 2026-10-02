# 1041 - Coordinates of a Point

(Coordenadas de um Ponto)

## Resumo
Lê dois valores de ponto flutuante, representando as coordenadas x e y de um ponto.
A partir disso exibe se esse ponto está na origem, eixo x , eixo y, ou em qual quadrante o ponto está.

---

**Abordagem:** Lê os valores.
Em seguida, verifica os casos especiais:

 - Se `x` e `y` forem iguais a zero, exibe `Origem` e encerra o programa;
 - Se apenas `x` for igual a zero, exibe `Eixo Y` e encerra o programa;
 - Se apenas `y` for igual a zero, exibe `Eixo X` e encerra o programa.

Caso o ponto não esteja sobre nenhum dos eixos, verifica se y é positivo ou negativo para determinar se ele está acima ou abaixo do eixo X. Depois, verifica o sinal de x para determinar de qual lado do eixo Y o ponto está.

Com base nessas verificações, exibe diretamente Q1, Q2, Q3 ou Q4.


---

🟢 **Categoria:** Iniciante &nbsp; ![Iniciante](https://img.shields.io/badge/BeeCrowd-Iniciante-2ea44f)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1041)