CREATE DATABASE living_place; -- DROP DATABASE living_place;

USE living_place;

CREATE TABLE tipo_persona( 
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50)
); -- SELECT * FROM tipo_persona;

INSERT INTO tipo_persona VALUES(NULL, 'Administrador');
INSERT INTO tipo_persona VALUES(NULL, 'Vendedor');

CREATE TABLE persona(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    run VARCHAR(13) UNIQUE,
    tipo_perdsona_fk INT REFERENCES tipo_persona(id)
); -- SELECT * FROM persona;

INSERT INTO persona VALUES(NULL,'admin','11-1',1);

CREATE TABLE cliente(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    run VARCHAR(13) UNIQUE,
    sueldo INT
); -- SELECT * FROM cliente;
