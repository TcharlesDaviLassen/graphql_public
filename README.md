# 🔗 GraphQL Public API (Spring Boot)

Explore o poder do GraphQL com uma API prática e didática construída com Spring Boot! 🚀

## 🧠 Sobre o Projeto
O repositório **GraphQL Public** apresenta uma estrutura de backend utilizando **Java com Spring Boot** e **GraphQL**. Ideal para estudos, testes e demonstrações de como funciona a integração do GraphQL com aplicações Java modernas.

## ✨ Funcionalidades
- ✅ API funcional com GraphQL e Spring Boot
- 🔍 Queries e Mutations implementadas
- 🗂️ Schema GraphQL (definido via arquivos `.graphqls`)
- 🧪 Ambiente propício para testes com playgrounds como Altair, GraphiQL ou Insomnia

## 🧰 Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot**
- **GraphQL Java** (com Spring for GraphQL)
- **Maven**
- **PostgreSQL**

## 🚀 Como Executar o Projeto
1. Clone o repositório:
   ```bash
   git clone https://github.com/TcharlesDaviLassen/graphql_public.git
   ```
2. Acesse a pasta do projeto:
   ```bash
   cd graphql_public
   ```
3. Compile e execute com Maven: 	
   ```bash
   ./mvnw spring-boot:run
   ```
4. Acesse o GraphQL Playground:
   ```
   http://localhost:8080/graphiql
   ```

## 🧪 Exemplos de Uso
```graphql
# Consulta
query {
  users {
    id
    name
    email
    orders {
      id
      user {
      	id
        name
      }
      products {
        id
        name
        price
      }
    }
  }
}

# Mutação
mutation {
  createUser(name: "John Doe", email: "john.doe@example.com") {
    id
    name
    email
  }
}

mutation {
  createProduct(name: "Laptop Asus", price: 12999.99) {
    id
    name
    price
  }
}

mutation {
  createOrder(userId: 1, productIds: [1, 2]) {
    id
    user {
      id
      name
    }
    products {
      id
      name
    }
  }
}
```

## 📁 Estrutura do Projeto
```
/graphql_public
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.graphql
│   │   │       ├── controllers
│   │   │       ├── entities
│   │   │       ├── repositories
│   │   │       └── services
│   │   └── resources
│   │       ├── application.yml
│   │       └── graphql
│   │           └── schema.graphqls
├── pom.xml
└── README.md
```

## 🙌 Contribuições
Contribuições são super bem-vindas! Quer adicionar novos resolvers, mutations ou integrações com banco de dados? Sinta-se à vontade para abrir uma issue ou enviar um PR.

## 📄 Licença
Distribuído sob a licença MIT. Veja o arquivo [`LICENSE`](LICENSE) para mais informações.

---

🎯 **Explore, aprenda e construa APIs modernas com Spring Boot + GraphQL!**

