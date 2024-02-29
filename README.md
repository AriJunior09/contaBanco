# Sistema de Conta Bancária em Java

Com o objetivo de aprendizagem, este projeto é um sistema de conta bancária que exemplifica conceitos fundamentais de programação orientada a objetos, tais como herança, polimorfismo e encapsulamento.

## Funcionalidades Principais

- Criação de contas para pessoas físicas e jurídicas.
- Realização de depósitos e saques em contas.
- Impressão dos dados da conta, incluindo número da conta, nome do titular e saldo.

## Como Usar

1. Clone este repositório para sua máquina local.
2. Abra o projeto em seu ambiente de desenvolvimento Java preferido.
3. Execute o arquivo `AppBanco.java` para iniciar o programa.
4. Siga as instruções apresentadas no console para interagir com o sistema de conta bancária.

## Exemplo de Uso

```java
// Criar uma conta para pessoa física
Conta contaPessoaFisica = new ContaPessoa(123456, "João da Silva", "123.456.789-00");

// Realizar um depósito na conta
contaPessoaFisica.deposito(1000.00);

// Realizar um saque na conta
contaPessoaFisica.saque(200.00);

// Imprimir os dados atualizados da conta
System.out.println(contaPessoaFisica);
```





 ## Requisitos

- JDK (Java Development Kit) instalado em sua máquina.

## Contribuindo

- Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) ou enviar pull requests para melhorar este projeto.

## Autor
- Este projeto foi desenvolvido por [Ari Júnior].



