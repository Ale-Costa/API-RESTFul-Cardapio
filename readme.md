# API de Cardápio de Comidas

Esta é uma API RESTful para gerenciar um cardápio de comidas. A API permite realizar operações CRUD (Create, Read, Update, Delete) em alimentos
que estão disponíveis no cardápio. Cada alimento possui um título, uma URL de imagem e um preço em reais.

## Recursos Disponíveis

- **GET /food**: Retorna uma lista de todos os alimentos disponíveis no cardápio.

- **POST /food**: Cria um novo alimento no cardápio com base nos dados fornecidos.

- **PUT /food/{id}**: Atualiza um alimento existente no cardápio com base no ID fornecido.

- **DELETE /food/{id}**: Remove um alimento do cardápio com base no ID fornecido.

## Modelo de Dados

Cada alimento é representado pelo seguinte modelo:

```json
{
  "id": 1,
  "title": "Hambúrguer com Batata Frita",
  "image": "https://example.com/food1.jpg",
  "price": 15.99
}
```

## Utilização

Para utilizar a API, envie requisições HTTP para os endpoints especificados acima, utilizando os métodos apropriados 
(GET, POST, PUT, DELETE) para realizar as operações desejadas nos alimentos.

## Tecnologias Utilizadas

- Java Spring Boot
- Hibernate com JPA para persistência de dados
- Banco de Dados (definido nas configurações da aplicação)
- Flyway para migração de banco de dados

## Iniciando a Aplicação

Para iniciar a aplicação, siga os seguintes passos:

1. Clone este repositório para o seu ambiente local.
2. Configure as informações do banco de dados no arquivo de configuração `application.properties`.
3. Acesse a API em `http://localhost:8080/food`.
