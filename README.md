📚 Sistema de Microservicios con Spring Boot
Aplicación distribuida basada en microservicios para la gestión de inmuebles, compras, autenticación y descubrimiento de servicios.

✨ Tecnologías principales:

Backend: Java + Spring Boot (Spring Cloud, Spring Security, Spring Data JPA, Spring MVC).

Bases de datos: MySQL / PostgreSQL (modelo entidad-relación con claves foráneas y relaciones entre tablas).

Frontend: Integración con API Gateway para enrutar las solicitudes a los microservicios correspondientes.

API Gateway: Uso de Spring Security para autenticación y autorización con JWT.

🚀 Funcionalidades destacadas:

Microservicio de inmuebles: Gestión completa de inmuebles con operaciones CRUD utilizando JPA y conexión a bases de datos.

Microservicio de compras: Gestión de compras asociadas a los inmuebles con integraciones en tiempo real.

API Gateway: Gestión centralizada de rutas y validación de seguridad mediante JWT.

Eureka Server: Descubrimiento de servicios para facilitar la escalabilidad y la tolerancia a fallos.

🗃️ Base de datos:

Tablas: Inmuebles, compras, usuarios, roles, logs de auditoría.

Datos poblados: Información de inmuebles, compras previas, usuarios registrados, entre otros.

🔐 Seguridad y Autenticación:

JWT (JSON Web Tokens) para la autenticación y autorización de usuarios.

Spring Security para la gestión de seguridad en todos los microservicios.

Cifrado de contraseñas con el algoritmo BCrypt para mayor protección.

⚙️ Tecnologías utilizadas:

Spring Boot: Framework para desarrollar microservicios.

Spring Cloud: Incluye Eureka para descubrimiento de servicios y OpenFeign para comunicación entre microservicios.

Spring Security: Autenticación y autorización.

JPA/Hibernate: ORM para la gestión de las bases de datos.

MySQL / PostgreSQL: Bases de datos relacionales.

Maven: Para la gestión de dependencias y construcción del proyecto.
