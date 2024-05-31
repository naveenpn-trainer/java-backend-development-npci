# Spring Boot Annotations

## Configuration Styles

Spring offers three types of configuration styles

1. XML based configuration
2. Annotation based configuration
3. Java based configuration

## Spring Boot Annotation

### Core Annotation

1. @SpringBootApplication : It is used to mark the main class of a Spring Boot application.

### Stereotype Annotations

> These annotations are used to create spring beans automatically in the application context.

#### @Component

> It indicates that the annotated class is a spring bean / component, it tells spring container automatically create the spring bean.

### Dependency Injection Annotation

#### @Autowired

> This annotation provided by spring framework is used for dependency injection.

It allows spring to automatically inject the required dependencies into a class.

**Types of Dependency Injection**

There are three types of dependency injection that @Autowired can handle

1. Constructor Injection
2. Setter Injection
3. Field Injection

#### @Qualifier



#### @Primary