# Introduction to REST API

> The Hypertext Transfer Protocol (HTTP) is the protocol that web browsers and web services use to communicate with each other over the internet

* HTTP works as a request and response protocol between Client (browser) and webserver.

![img](https://lh7-us.googleusercontent.com/4f9DdOc5iKz3vbJQMzGmzvz7_34DOrRfUaDnDU-IYxsc-NhZ3yN8EHu1Y7N_HoCe5Ho6w_QQONUXaPZuiGqFSMN-p-y4bnFLZU6cBwoKcIDIdZF9rhMJdZpEP4ZHATzroheQvqKig5CU4BYGUMEg3vY)

## HTTP Request and Response

### HTTP Request

> An HTTP request is a message sent by the client (browser) to the web server asking for the resource or action

This HTTP request consists of several parts

1. URL
2. Request method (Mandatory)
   - GET, POST, DELETE, PATCH, PUT
3. Headers (Optional)
4. Body (Optional)

![img](https://lh7-us.googleusercontent.com/_9uOenJdG3JQDwZ36xvF7xzevDRW7sW5a9AEM5DelmLJyjsPKoZqkqdb2FXi0hchRzj6KveouRXzMksA7qUWmklpUQ4pJRjobWN2EdsWlPz1VZNTVp8y2soQTt9yfcChulNNtxRehMI6e-0O2b9YBPc)

### HTTP Response

> An HTTP Response is the message sent back  by the WebServer to the client in reply to an HTTP Request

HTTP Response consists of three main parts

1. Status Code (Mandatory)

2. Headers (Optional)

   ```
   Content-Type : text/html
   Content-Length : 1024
   ```

   

3. Body (Optional)

![img](https://lh7-us.googleusercontent.com/mYXx4U7p78lcYckmMNfDC6__U-Mp8aoJ74QtBiv33bZqokGzVjbOop43u5bMdwI6P1uDKSq4vl7Qd754e6HeoKTSIu9VgNB3YlTl0Dm9Xx5UB9hrWWFY8Xz7RoQ-yq9-TxeizGxZvFDds1b4sQfr20U)

## What is WebService

> A service which is made available over the web is called as webservice

![img](https://lh7-us.googleusercontent.com/QQYdCH4VqAq_CVmiD14IXCA2ceTZ2ZJeLvLWyKuB6Tsn62fKL78OUaIxpKqOz-AntSV9GLSfFlN7nGnOMIOr5IV0pB-LQeAucPRYud3X30emd0bTCgSZrFG54kx6ML1jCeGsKzs-bdew_AEGV2E-ZNY)

![img](https://lh7-us.googleusercontent.com/3_tcCwGYH-1hixYrT6XIU6-xrFtr6bBiIqLzPiwU9N4X6Q1HVZuxxbJQMe15UlKziSCjwYVpwjAppL-xewv--koR4XXmTtAOp-ucxKNVQGJ7irLpxd6cEi8zIaqN2xWrM2fm8qE1h75_r-Mp7OztJQE)

## Types of Web Services

There are two types of Web Services

1. SOAP
2. REST
3. GraphQL



## REstFul Services

1. Spring Boot (Java)
2. Python (Flask, Django. FlaskRestful, Fast API)



## Spring Boot

1. https://start.spring.io/

2. CRUD operation USER API

   1. Retrieve all users

      GET /users

   2. Create a user

      POST /user

   3. Retrieve single user

      GET /user/1

   4. Delete a user

      DELETE /users/{id}

   5. Update the user

      1. PUT
      2. PATCH