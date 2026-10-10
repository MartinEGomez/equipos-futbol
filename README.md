Proyecto EquiposFutbol – Spring Boot MVC
Este es un sistema web desarrollado con Java y Spring Boot MVC que permite registrar, listar, editar y eliminar equipos de fútbol. También cuenta con un sistema de inicio de sesión para usuarios registrados.

 Tecnologías utilizadas
Java 17

Spring Boot 3.5.0

Spring MVC

Spring Data JPA

Thymeleaf

PostgreSQL

Maven

Git y GitHub

 Requisitos
Tener instalado Java 17

Tener instalado PostgreSQL

Tener instalado Maven (opcional si usás mvnw)

Tener configurado un IDE como IntelliJ IDEA o VS Code

 Base de datos
Abrír pgAdmin.

Creá una base de datos llamada: equiposdb

Ejecutá este script SQL:


CREATE TABLE equipos_futbol (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100),
    eslogan VARCHAR(100),
    tecnico VARCHAR(100),
    pais VARCHAR(50),
    ciudad VARCHAR(50),
    categoria VARCHAR(50),
    num_goles INTEGER,
    num_partidos_jugados INTEGER,
    num_partidos_ganados INTEGER,
    num_campeonatos INTEGER,
    num_expulsiones INTEGER,
    num_empates INTEGER
);

CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    usuario VARCHAR(50),
    contrasena VARCHAR(50)
);

INSERT INTO usuario (usuario, contrasena) VALUES ('admin', 'admin123');
 En el archivo application.properties la configuración usada es:


spring.datasource.url=jdbc:postgresql://localhost:5432/equiposdb  
spring.datasource.username=postgres  
spring.datasource.password=martin123
Asegurate de que coincidan con tu instalación de PostgreSQL.

Cómo ejecutar el proyecto
Cloná este repositorio:


git clone https://github.com/MartinEGomez/equipos-futbol.git
Abrí el proyecto en IntelliJ IDEA.

Esperá a que descargue las dependencias Maven automáticamente.

Ejecutá la clase principal:


com.equipos.equiposfutbol.EquiposfutbolApplication

 Acceder desde el navegador
Página de inicio de sesión:
http://localhost:8080/login

Formulario para agregar nuevo equipo:
http://localhost:8080/formulario

Lista de equipos registrados:
http://localhost:8080/listar

Editar: botón “Editar” junto a un equipo

Eliminar: botón “Eliminar” junto a un equipo

 Credenciales de prueba
Usuario: admin
Contraseña: admin123

ATT:
Martín Gómez
Correo institucional: [mgomezc2@unicartagena.edu.co]
GitHub: https://github.com/MartinEGomez
