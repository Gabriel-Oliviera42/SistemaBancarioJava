# SistemaBancarioJava
TRABALHO PRÁTICO: Testes e Gitflow (Sistema Bancário)
Este projeto foi feito para cumprir o trabalho prático de Testes Automatizados e Gitflow da disciplina de Gestão da Qualidade da UNIFENAS.

1. A Aplicação (Domínio)
Criei uma aplicação básica de Sistema Bancário em Java. Ela não tem interface gráfica, sendo apenas a lógica de negócio (classes e funções) para uma ContaBancaria.

As funções principais são:

Criar Conta: Com validação de saldo inicial.

Depositar: Adiciona valor à conta.

Sacar: Retira valor, verificando se há saldo.

2. Testes Unitários e Framework
Para garantir a qualidade, desenvolvi 8 casos de teste unitário usando o JUnit 5 com Java/Maven.

Os testes verificam:

Comportamento Esperado: Se o depósito e o saque funcionam e atualizam o saldo corretamente.

Restrições/Erros: Se o código trata erros, como tentar sacar sem saldo ou criar uma conta com valor inicial negativo.

3. Gitflow e Versionamento
Usei o Gitflow para organizar o desenvolvimento no repositório. O histórico de branches e commits mostra o fluxo completo:

main: A versão final e estável (Produção).

develop: A base onde tudo é integrado e testado.

feature/*: Usei para desenvolver o Saque e o Depósito separadamente.

release/*: Usei para preparar a versão 1.0.0 antes de ir para a main.

hotfix/*: Usei para corrigir um pequeno erro urgente na main (criando a versão 1.0.1).

4. Como Executar os Testes
Para rodar o projeto, você precisa do Java (JDK) e do Maven configurados.

Clone o repositório.

Abra o terminal na pasta do projeto.

Use o Maven para rodar os testes:

Bash

mvn test
O resultado deve mostrar que os 8 testes passaram com sucesso.
