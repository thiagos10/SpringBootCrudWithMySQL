<!-- PROJECT SHIELDS -->

<div class="box">
    <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/thiagos10/SpringBootCrudWithMySQL?style=for-the-badge">
    <img alt="GitHub all releases" src="https://img.shields.io/github/downloads/thiagos10/SpringBootCrudWithMySQL/total?style=for-the-badge">
    <img alt="GitHub" src="https://img.shields.io/github/license/thiagos10/SpringBootCrudWithMySQL?style=for-the-badge">
</div>
<br>

# SpringBootCrudWithMySQL

## About the project
Spring Boot simple CRUD project, example of reading, create, update and delete. Application developed with Spring Boot, Spring Data JPA and MySQL.

## Sobre o projeto
Spring Boot projeto CRUD simples, exemplo de leitura, criação, atualização e exclusão. Aplicativo desenvolvido com Spring Boot, Spring Data JPA and MySQL.

<br>

## What's inside 
This project is based on the [Spring Boot](http://projects.spring.io/spring-boot/) project and uses these packages :
- Maven
- Spring Web
- Spring Data JPA (Hibernate & MySQL)
- Lombok

## O que uso 
Este projeto é baseado no projeto [Spring Boot] (http://projects.spring.io/spring-boot/) e usa estes pacotes:
- Maven
- Spring Web
- Spring Data JPA (Hibernate & MySQL)
- Lombok

<br>

## Installation 
The project is created with Maven, so you just need to import it to your IDE and build the project to resolve the dependencies.

## Instalação 
O projeto é criado com Maven, então você só precisa importá-lo para o seu IDE e construir o projeto para resolver as dependências.

<br>

## Database configuration 
Create a MySQL database with the name `crud` and add the credentials to `/resources/application.properties`.  
The default ones are:

## Configuração database
Crie um banco de dados MySQL com o nome `crud` e adicione as credenciais a `/resources/application.properties`. 
Os padrões são:

<br>

```
spring.datasource.url=jdbc:mysql://localhost:3306/crud?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
spring.jpa.hibernate.ddl-auto=create
spring.jpa.open-in-view=true
```

<br>

## Usage 
Run the project through the IDE and head out to [http://localhost:8080](http://localhost:8080)

## Uso 
Execute o projeto por meio do IDE e vá para [http://localhost:8080](http://localhost:8080)

<br>

## Demonstration of how the API works
Follow the test prints using Insomnia

## Demonstração do funcionamento da API
Segue os prints de testes utilizando o Insomnia

<br>
![Alt text](/prints/findall.jpg?raw=true "Find All")
<br>
![Alt text](/prints/findid.jpg?raw=true "Find ID")
<br>
![Alt text](/prints/findname.jpg?raw=true "Find Name")
<br>
![Alt text](/prints/cadastro.jpg?raw=true "Cadastro")
<br>
![Alt text](/prints/update.jpg?raw=true "Update")
<br>
![Alt text](/prints/delete.jpg?raw=true "Delete")

<br>

## Contact
E-mail: thiagos10@gmail.com

## Contato
E-mail: thiagos10@gmail.com
