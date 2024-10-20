
**Nome:** Cristofer Luchtenberg
<br>
**Professor:** Dr. Renato Simões Moreira

<h1 align="center">
    Padrões de Design Utilizados no Sistema de Pousada
</h1>

## Introdução

Os padrões de design são soluções reutilizáveis que ajudam a resolver problemas recorrentes em projetos de software. Neste documento, discutiremos quatro padrões de design utilizados no sistema de pousada: Singleton, Builder, Facade e Chain of Responsibility. Cada padrão será abordado com sua aplicabilidade e justificativas para o uso.

## Padrões de Design

### Singleton 

**Aplicabilidade:** Garante que uma classe tenha apenas uma instância, como na classe PousadaSingleton, evitando inconsistências no gerenciamento de reservas e quartos.

**Justificativa:** Mantém um estado único de dados durante toda a execução do sistema.

<br>
<p align="center">
   <img src="https://refactoring.guru/images/patterns/content/singleton/singleton-comic-1-pt-br.png" alt="#01" width="400">
</p>


### Builder

**Aplicabilidade:** Cria objetos complexos de maneira passo a passo, como na classe QuartoBuilder, facilitando a construção de instâncias de Quarto.

**Justificativa:** Melhora a legibilidade do código e reduz a possibilidade de erros na criação de objetos.

<br>
<p align="center">
   <img src="https://refactoring.guru/images/patterns/content/builder/builder-pt-br.png" alt="#01" width="400">
</p>


### Facade

**Aplicabilidade:** Fornece uma interface simplificada para interações complexas, como na classe GerenciadorReservas, facilitando a criação de reservas.

**Justificativa:** Simplifica a interação com o sistema de reservas, tornando-o mais acessível.

<br>
<p align="center">
   <img src="https://refactoring.guru/images/patterns/diagrams/facade/live-example-pt-br.png" alt="#01" width="400">
</p>


### Chain of Responsibility

**Aplicabilidade:** Permite o processamento de diferentes formas de pagamento por meio da classe ProcessadorPagamento.

**Justificativa:** Desacopla o envio de solicitações dos manipuladores, facilitando a adição de novos métodos de pagamento.

<br>
<p align="center">
   <img src="https://refactoring.guru/images/patterns/content/chain-of-responsibility/chain-of-responsibility-comic-1-pt-br.png" alt="#01" width="400">
</p>

