# Projeto Padaria - Padrão Decorator (Design Patterns)

Este projeto demonstra a implementação do Padrão Decorator para adicionar funcionalidades (recheios, dizeres, camadas) a um objeto base (Cake) dinamicamente.

## Estrutura do Projeto
- **`Bolos`**: Contém as classes base (`CakeAbstrato`) e os tipos concretos de bolo (`VanillaCake`, `ChocolateCake`, `StrawberryCake`).

- **`Recheios`**: Contém a classe Decorator abstrata (`RecheiosAbstrato`) e os decoradores concretos (`sayingDecorator`, `granuladoDecorator`, `camadasDecorator`).

- **`Main.java`**: Contém a lógica de teste para instanciar e decorar os bolos conforme o requisito.

## Exemplo de Saída
O método `main` gera a seguinte saída, demonstrando o cálculo de custos e a decoração:

10  Chocolate cake\
10  Vanilla cake with saying "PLAIN!"\
12  Vanilla cake with sprinkles with saying "FANCY!"\
29  Multi-layered Strawberry cake with sprinkles with sprinkles with saying "One of" with saying "EVERYTHING"
