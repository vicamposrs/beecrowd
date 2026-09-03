"""
gen_readme.py

Gera o README.md do repositório a partir do problems.csv.

Uso:
    python gen_readme.py

Requisitos:
    pip install pandas

Entrada:
    problems.csv (colunas: numero, nome, categoria) na raiz do repo

Saída:
    README.md (sobrescrito na raiz do repo)
"""

# importar bibliotecas
import pandas as pd
import re

def nome_da_pasta(numero,nome):
    nome = nome.replace(" ","-")
    return str(numero) + "-" + re.sub(r'[^a-zA-Z0-9\s-]', '', nome)
    
# ler arquivo csv

df = pd.read_csv("solutions.csv")

# colocar em ordem

df = df.sort_values(by="numero")

# gerar exercicios em ordem

conteudo = """# BeeCrowd Solutions 🐝

Soluções dos exercícios que venho resolvendo no [BeeCrowd](https://www.beecrowd.com.br/).

Cada pasta tem seu próprio `README.md` com um resumo do problema e o link para o enunciado completo.

## Índice geral

| #    | Problema | Categoria | Enunciado | Solução |
|------|----------|-----------|-----------|---------|
"""

for _,linha in df.iterrows():
    nome_pasta = nome_da_pasta(linha['numero'],linha['nome'])
    conteudo += f"| {linha['numero']} | {linha['nome']} | {linha['categoria']} | [ver](https://judge.beecrowd.com/en/problems/view/{linha['numero']}) | [abrir](./solutions/{nome_pasta}) |\n"

# gerar em ordem por categoria

categorias = [
    "Iniciante",
    "Ad-Hoc",
    "Strings",
    "Estruturas e Bibliotecas",
    "Matemática",
    "Paradigmas",
    "Grafos",
    "Geometria Computacional",
    "SQL"
]

conteudo += "\n## Por categoria\n"

for categoria in categorias:
    df_por_categoria = df[df['categoria'] == categoria]

    conteudo += f"\n### {categoria}"
    for _,linha in df_por_categoria.iterrows():
        conteudo += f"\n- [{linha['numero']} - {linha['nome']}](./solutions/{nome_da_pasta(linha['numero'],linha['nome'])})"
    conteudo +="\n"

# adicionando dados deste arquivo
conteudo += """
## Mantendo o índice atualizado
Pra adicionar um novo exercício, edite `problems.csv` (número, nome, categoria) e rode:
```bash
python tools/gen_readme.py
```
O script regenera este README automaticamente a partir do CSV.
"""
    

# recriar README atualizado

with open("README.md", "w", encoding="utf-8") as arquivo:
    arquivo.write(conteudo)