# Criando um Banco Digital com Java e Orientação a Objetos

## Descrição

Esse projeto é uma simulação básica de um sistema bancário digital, desenvolvido com Java para demonstrar conceitos fundamentais de Programação Orientada a Objetos (POO). Utilizando a biblioteca Lombok, o código é otimizado para ser mais limpo e legível. O sistema permite a criação e gestão de diferentes tipos de contas bancárias, realizando operações como depósitos, saques e transferências. Além disso, é possível visualizar extratos das contas para acompanhar as movimentações.

## Estrutura do Projeto

- **Banco**: Gerencia uma lista de contas e fornece métodos para adicionar, remover e buscar contas.
- **Conta**: Classe abstrata representando uma conta bancária, com métodos para operações bancárias e impressão de informações.
- **ContaCorrente**: Herda de `Conta` e representa uma conta corrente.
- **ContaPoupanca**: Herda de `Conta` e representa uma conta poupança.
- **Cliente**: Representa um cliente do banco, com um nome associado.
- **IConta**: Interface que define os contratos para operações bancárias.
- **Main**: Classe para testes, demonstrando a criação e uso das contas.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Lombok**: Biblioteca para reduzir a quantidade de código boilerplate.