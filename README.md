# Email Service
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white)

Este projeto é uma implementação do desafio técnico proposto, na categoria **Email Service**, utilizando **Java** com o framework **Spring Boot**. A aplicação foi desenvolvida com foco em arquitetura limpa, código testável e pronto para produção.

## 📨 Descrição do Projeto

O Email Service é uma API REST que envia e-mails de forma confiável, com um sistema de failover entre dois provedores de e-mail distintos. Caso o provedor principal esteja indisponível, a aplicação alterna automaticamente para o provedor secundário, garantindo a entrega das mensagens sem afetar a experiência do usuário.

### Funcionalidades principais

- Envio de e-mails via API RESTful.
- Failover automático entre dois provedores de e-mail.
- Documentação da API com Swagger.
- Testes automatizados com cobertura dos principais fluxos.
- Projeto modular e pronto para deploy em produção.

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Retry** (para tentativas automáticas)
- **Spring Validation**
- **Feign Client** (para integração com APIs externas)
- **Swagger / OpenAPI**
- **JUnit + Mockito** (para testes)
- **Docker** (opcional para facilitar o deploy)

## 💡 Arquitetura

A aplicação segue os princípios de separação de responsabilidades e pode ser facilmente escalada ou adaptada para novos provedores de e-mail. O fluxo de envio inclui:

1. Validação do payload recebido.
2. Tentativa de envio com o provedor principal.
3. Caso ocorra falha, failover para o provedor secundário.
4. Retorno do status da operação via HTTP.

## 🔧 Provedores Utilizados

Neste projeto, foram utilizados:

- **SendGrid**
- **Mailgun**

É possível adicionar outros provedores (como Amazon SES, SparkPost, etc.) facilmente, seguindo a estrutura definida.

## 📦 Como Executar Localmente

### Pré-requisitos

- Java 17+
- Maven
- Conta nos provedores (SendGrid e Mailgun) com chaves de API

### Passos

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/email-service.git
cd email-service

# Configure as variáveis de ambiente
cp .env.example .env
# Edite o arquivo .env com suas credenciais

# Execute o projeto
./mvnw spring-boot:run

