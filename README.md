# Relatório do Projeto: Conta Bancária com Encapsulamento
- Heloísa Real - 554535 - 2ESR - Java 

## 1. Introdução
O presente relatório tem como objetivo descrever o desenvolvimento de um projeto de Conta Bancária utilizando Java. Esse projeto tem como foco a aplicação do conceito de **encapsulamento**, um dos pilares da Programação Orientada a Objetos (POO). O encapsulamento permite proteger os **dados sensíveis de uma classe**, garantindo que apenas métodos específicos possam acessá-los ou modificá-los.

## 2. Objetivo do Projeto
Criar um sistema bancário que possibilite a manipulação de uma conta bancária, permitindo:
- Criar uma conta bancária com um titular e saldo inicial. 
- Depositar valores na conta.
- Sacar valores, respeitando a condição de saldo suficiente.
- Consultar o saldo da conta de maneira segura.
- Alterar e consultar o nome do titular da conta sem expor diretamente o atributo.

## 3. Implementação
O sistema foi desenvolvido em **Java** e dividido em duas classes principais:

### 3.1. Classe `ContaBancaria`
Essa classe representa a conta bancária e contém os seguintes atributos e métodos:
- **Atributos (privados)**:
  - `saldo` (do tipo `double`): Armazena o saldo da conta.
  - `titular` (do tipo `String`): Armazena o nome do titular da conta.

- **Métodos:**
  - `depositar(double valor)`: Permite adicionar um valor ao saldo, desde que seja positivo.
  - `sacar(double valor)`: Realiza um saque caso haja saldo suficiente.
  - `consultarSaldo()`: Retorna o saldo da conta de maneira segura.
  - `setTitular(String nome)`: Permite definir o nome do titular.
  - `getTitular()`: Retorna o nome do titular da conta.

### 3.2. Classe `Main`
A classe `Main` é responsável por testar o funcionamento do sistema. Ela executa as seguintes operações:
1. Cria uma conta bancária para um titular.
2. Deposita um valor na conta.
3. Tenta sacar um valor superior ao saldo para testar a validação.
4. Realiza um saque válido.
5. Consulta e exibe o saldo da conta.
6. Altera e exibe o nome do titular.

# 4. Encapsulamento Aplicado
O encapsulamento foi utilizado de forma estratégica para proteger os dados da conta bancária. A implementação seguiu os seguintes princípios:

- **Proteção dos Atributos:**
  - Os atributos `saldo` e `titular` foram declarados como **privados (`private`)**, impedindo o acesso direto de fora da classe.
  
- **Métodos de Acesso:**
  - Foram criados **métodos `get` e `set`** para permitir a leitura e modificação do nome do titular, garantindo que apenas métodos específicos possam alterar esse dado.
  - O saldo só pode ser consultado pelo método `consultarSaldo()`, sem permitir modificações diretas.

- **Regras de Negócio Implementadas:**
  - O método `sacar(double valor)` verifica se há saldo suficiente antes de permitir a transação, com um if e else.
  - O método `depositar(double valor)` impede a adição de valores negativos.

Dessa forma, o encapsulamento garante que os dados internos da conta sejam manipulados de forma segura e controlada, evitando alterações indevidas.

## 5. Conclusão
O projeto permitiu a aplicação prática do conceito de **encapsulamento**, garantindo que os dados da conta bancária sejam acessados e modificados apenas por meio de métodos específicos. Isso melhora a segurança do sistema, evitando inconsistências e proporcionando um controle mais eficiente sobre os atributos da classe.

Por meio dessa abordagem, foi possível compreender a importância do encapsulamento na construção de sistemas mais seguros e organizados, reforçando boas práticas de programação orientada a objetos em Java.

