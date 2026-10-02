# 1024 - Encryption

(Criptografia)

## Resumo
Lê um valor inicial inteiro de quantos textos serão criptografados. Para cada texto, aplica três etapas de criptografia:
 - letras avançam três posições na tabela ASCII
 - texto é invertido
 - volta um na tabela ASCII todos caracteres do meio ao fim

 Ao final, exibe cada texto criptografado.

---

**Abordagem:** Utiliza um laço `for` para processar os ``N`` textos.

Para cada texto, percorre todos os seus caracteres. Quando o caractere é uma letra, soma 3 ao seu código na tabela ASCII. Os demais caracteres permanecem inalterados.

Em seguida, calcula o ponto que divide o texto ao meio e o percorre de trás para frente, construindo uma nova string invertida. Durante essa inversão, subtrai 1 dos caracteres que ocuparão a segunda metade do resultado.

Cada texto criptografado é armazenado em um vetor e todos são exibidos ao final.

---

🟩 **Categoria:** Strings &nbsp; ![Strings](https://img.shields.io/badge/BeeCrowd-Strings-45b829)

---

🔗 [Ver enunciado completo](https://judge.beecrowd.com/en/problems/view/1024)