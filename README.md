# Calculadora

Calculadora desktop com interface gráfica, feita em Java (Swing) no NetBeans.

## Funcionalidades

- Soma, subtração, multiplicação e divisão
- Porcentagem (`%`)
- Inversão de sinal (`+/-`)
- Números decimais com vírgula
- Limpar tudo (`c`) e apagar o último dígito (`⌫`)
- Divisão por zero tratada, sem travar a aplicação

## Estrutura

```
src/calculadora/
├── telaPrincipal.java   → Interface gráfica (Swing) e eventos dos botões
├── telaPrincipal.form   → Layout visual do editor do NetBeans
└── Calculos.java        → Lógica das operações matemáticas
```

As operações ficam separadas da interface na classe `Calculos`.

## Como rodar

**Pré-requisito:** Java 17 ou superior.

**Pelo NetBeans (recomendado):**
1. Abra o NetBeans e escolha *File → Open Project*, selecionando a pasta do projeto.
2. Clique em *Run Project* (F6). A classe principal é `calculadora.telaPrincipal`.

**Pelo terminal:**
```bash
mkdir out
javac -d out src/calculadora/*.java
java -cp out calculadora.telaPrincipal
```

## Tecnologias

- Java 17
- Swing
- Apache Ant (projeto NetBeans)
