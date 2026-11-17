# Estudos de Java (POO e Coleções)

Repositório com exercícios práticos em Java voltados para o estudo de Programação Orientada a Objetos (POO), estruturas de coleções (`Set` e `Map`) e entrada de dados via terminal.

## Estrutura do Projeto

```text
.
├── Conjunto/
│   └── Conjuntos.java       # Uso de Set/HashSet para armazenar cargos sem duplicatas
├── Converter/
│   └── Converter.java       # Conversor de temperatura (Celsius e Fahrenheit) com Scanner
├── Map/
│   └── InterfaceMap.java    # Uso de Map/HashMap e iteração sobre pares chave-valor
├── Professor/
│   └── Professor.java       # Herança com Professor, ProfessorConcursado e ProfessorHorista
├── .gitignore
└── README.md
```

## Conteúdo dos Exercícios

- **`Conjunto/Conjuntos.java`**: Cria um `HashSet<String>` com nomes de cargos, demonstrando que elementos duplicados (como `"Diretor"`) não são repetidos no conjunto.
- **`Converter/Converter.java`**: Lê uma temperatura e a opção do usuário via `Scanner`, realizando a conversão entre Celsius e Fahrenheit.
- **`Map/InterfaceMap.java`**: Armazena pares `Integer -> String` em um `HashMap` e percorre as entradas utilizando `Set`, `Iterator` e `Map.Entry`.
- **`Professor/Professor.java`**: Modela a classe base `Professor` (matrícula, nome e método `salario()`) e duas subclasses estáticas:
  - `ProfessorConcursado`: possui salário fixo.
  - `ProfessorHorista`: calcula o salário a partir de `valorHora * quantidadeHora`.

## Tecnologias e Dependências

- **Linguagem:** Java (JDK padrão)
- **Bibliotecas utilizadas:** Apenas API padrão do Java (`java.util.Set`, `java.util.HashSet`, `java.util.Map`, `java.util.HashMap`, `java.util.Iterator`, `java.util.Scanner`)
- Não há dependências externas.

## Como Executar

Para compilar e executar qualquer exercício pelo terminal a partir da raiz do projeto:

```bash
# Exemplo: Professor
javac Professor/Professor.java
java -cp Professor Professor

# Exemplo: InterfaceMap
javac Map/InterfaceMap.java
java -cp Map InterfaceMap

# Exemplo: Converter
javac Converter/Converter.java
java -cp Converter Converter
```
