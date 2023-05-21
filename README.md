<h1 align = "center"> Blogging Platform API </h1>

<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
  
<a >
    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-blue.svg">
</a>
</p>
   
This is a web based application which allow user to Sign up , Sign in and help user to post there blog. This application will help to built and community for people how are loved to blog. It helps to post the blog, watch others blog comment on it etc. User and update delete the blog as they pleased. Once user login the authentication token will generated and used it across the application.

---
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok
* Validation
* Swagger

<br>

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

## Language Used
* Java

---
<br>

---

## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

<br>


## API End Points 

The following endpoints are available in the API:

* User Controller:
```
SignUp /signup
SignIn /signin
FollowUser /follow/{myid}/{oid}
```

* Post Controller
```
POST /post: create a new post
GET /get: get all posts
Update /update/{postid}/{data}
Delete /delete/{postid}
```

* Comment Controller
```
POST /comment: post the comment
```

<br>

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
<br>

## New in this project

- I have used MySql - Database in this project which will we can link to sql workbench which is persistance database,data will stored remotely
- I have used Authentication, which will produce token, which we can use to verify user all the time.

## Project Summary

The project is a basic web application built using Java and the Spring framework. It allows users to sign up, sign in, and used to upload there blog in the website, where large number of viewer can view the blog. Users can also create and view posts. The application uses authentication tokens to secure user data and ensure that only authenticated users can access certain features. The API endpoints include user signup, signin, and update details, post creation and retrieval, and authentication token creation. 

    
---
    
## Show your support

Give a ⭐️ if this project helped you!
    
---
