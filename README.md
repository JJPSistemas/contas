# Contas

### Requisitos tecnicos
- O projeto deve ser desenvolvido em Java;
- O banco de dados deve ser Banco de dados em Memoria (H2, HSQLDB);
- Desenvolvimento em camadas, com tratamento de erros eficiente;
- O Backend deve disponibilizar uma API Rest (get/post/delete/update);
- Deve ser possível efeturar todas as operações disponibilizadas pelo Backend;
- Disponibilizar os verbos para

### Entrega esperada
A solução completa (scripts de banco de dados e qualquer outro artefato necessário para execução da solução) deve ser disponibilizada em um repositório público do GitHub (http://github.com/). 


### Necessidade a ser resolvida: Sistema para controle de contas
Você deve criar um CRUD para manutenção de Contas de saldo. Podemos ter 2 tipos de contas:

- Conta Matriz -  É a conta principal, a qual pode ter (n) contas filhas e essas também podem possuir suas filhas, formando assim uma hierarquia. É a principal conta da estrutura.
- Conta Filial - É uma conta idêntica a Conta Matriz, porém possui obrigatoriamente uma conta Pai (pode ser a Conta Matriz ou outra Conta Filial) e pode ou não ter uma Conta Filial abaixo.

### Dados para Cadastro de Contas

Nome

Data de Criação

Obs: Todas as Contas devem possuir uma Pessoa e esta pode ser Jurídica ou Física


### Dados para Pessoa Jurídica

CNPJ

Razão Social

Noem Fantasia


### Dados para Pessoa Física

CPF

Nome Completo

Data Nascimento


### Funcionalidade de Tranferência

Toda conta Filial pode fazer tranferências desde que a conta não seja Matriz. 

A Conta Matriz não pode recebr Transferências de outras contas, apenas Aportes alfanuméricos.

Toda transação pode ser estornada deve gerar uma código alfanumérico.

Apenas as Contas Ativas podem receber Cargas ou Tranferências.


####Situação da Conta

Toda Conta pode estar ativa, bloqueada ou cancelada;

Todo Histórico de transações deve ser armazenado e consultado.

### Glossário dos termos

Aporte - Entrada de valores diretamente na Conta Matriz, através de uma transação qualquer 

Transferência - Valores movimentados entre contas, onde uma é debitada e a outra é creditada.
