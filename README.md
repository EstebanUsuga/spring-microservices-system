🛠️ Sistema de Microservicios con Spring Boot
Este repositorio contiene una solución basada en arquitectura de microservicios desarrollada con Spring Boot, que integra componentes esenciales para la construcción de sistemas distribuidos robustos, seguros y escalables. La aplicación implementa autenticación y autorización mediante JWT, comunicación entre servicios mediante OpenFeign, descubrimiento de servicios con Eureka Server y enrutamiento centralizado a través de un API Gateway. Además, utiliza bases de datos relacionales como MySQL y PostgreSQL para el almacenamiento persistente de datos.

📦 Estructura de Microservicios
spring-boot-microservice-1-inmueble
Servicio responsable de la gestión de inmuebles, que incluye operaciones CRUD utilizando JPA y conexión con base de datos relacional.

spring-boot-microservice-2-compra
Microservicio encargado de la gestión de compras asociadas a inmuebles.

spring-boot-microservice-3-api-gateway
Gateway central que enruta las solicitudes HTTP hacia los microservicios correspondientes. Implementa seguridad con Spring Security y validación de tokens JWT.

spring-boot-microservice-4-eureka
Servidor de descubrimiento que permite el registro dinámico de los microservicios, facilitando la escalabilidad y tolerancia a fallos mediante Netflix Eureka.

🔐 Seguridad y Autenticación
Gestión de autenticación y autorización con Spring Security y JWT (JSON Web Tokens).

Registro y login de usuarios.

Cifrado de contraseñas utilizando el algoritmo BCrypt.

⚙️ Tecnologías Utilizadas
Spring Boot

Spring Cloud (Eureka, OpenFeign)

Spring Security + JWT

JPA/Hibernate

MySQL / PostgreSQL

API Gateway

Maven
