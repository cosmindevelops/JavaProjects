
# Spring boot - Blog app

Real time REST API's for Blog App using Spring Boot, Spring Security, JWT, Hibernate, MySQL database


## Technology Stack

**Java Platform:** Java 8+

**Frameworks:** Spring Boot, Spring Security (JWT), Spring Data JPA (Hibernate)

**Build Tool:** Maven

**IDE:** Intellij IDEA

**Server:** Tomcat embedded server

**Database:** MySQL

**REST Client:** Postman

**REST API Documentation:** Swagger

**Production:** AWS
<!-- ## Documentation

[Swagger Documentation](http://springbootblogapp-env.eba-k34dcz2t.eu-west-2.elasticbeanstalk.com/swagger-ui/index.html#/)

-->
## API Reference for Posts

#### Get all posts

```http
  GET /api/v1/posts
```

#### Get post by id

```http
  GET /api/v1/posts/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

#### Post post
```http
  POST /api/v1/posts
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `title`      | `string` | **Required**. Title should have at least 2 characters |
| `description`      | `string` | **Required**. Description should have at least 10 characters |
| `content`      | `string` | **Required**. Blog post content not empty |
| `JWT_token`      | `string` | **Required**. JWT Token  |

#### Put post by id

```http
  PUT /api/v1/posts/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |
| `title`      | `string` | **Required**. Title should have at least 2 characters |
| `description`      | `string` | **Required**. Description should have at least 10 characters |
| `content`      | `string` | **Required**. Blog post content not empty |
| `JWT_token`      | `string` | **Required**. JWT Token  |

#### Delete post by id

```http
  DELETE /api/v1/posts/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |
| `JWT_token`      | `string` | **Required**. JWT Token  |

## How to get JWT Token

#### SignIn
```http
  POST /api/v1/auth/signin
```
Copy the key after you sign in into Authorization as such : "Bearer <<insert key here>insert key here>"

## Resources

```mermaid
graph TD;  
 Post-->D(Resources);  
 Comment-->D;  
 User-->D;  
```
## Application Architecture

```mermaid
flowchart RL
 a[(DB)] <--> b("DAO 
 (Repository)") <--> c("Service") <--> d("Controller")
 <-->|JSON| e("Postman 
 Client")
```

## Author

- [@Andrew-Develops](https://github.com/Andrew-Develops)


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/Andrew-Develops/JavaProjects)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/cosminfuica/)
