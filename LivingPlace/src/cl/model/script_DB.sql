CREATE DATABASE living_place; -- DROP DATABASE living_place;

USE living_place;

CREATE TABLE tipo_vivienda( 
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50)
); -- SELECT * FROM tipo_vivienda;

INSERT INTO tipo_vivienda VALUES(NULL,'Casa');
INSERT INTO tipo_vivienda VALUES(NULL,'Departamento');

CREATE TABLE vendedor(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    run VARCHAR(13) UNIQUE
); -- SELECT * FROM vendedor;

CREATE TABLE administrador(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    run VARCHAR(13) UNIQUE
); -- SELECT * FROM administrador;

INSERT INTO administrador VALUES(NULL,'admin','11-1');

CREATE TABLE cliente(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50),
    run VARCHAR(13) UNIQUE,
    sueldo INT
); -- SELECT * FROM cliente;

INSERT INTO cliente VALUES(NULL,'Daisy','11-1',100000);

CREATE TABLE vivienda(
    id INT PRIMARY KEY AUTO_INCREMENT,
    rol VARCHAR(100),
    direccion VARCHAR(50),
    cantidad_pieza INT,
    cantidad_baño INT,
    tipo_vivienda_FK INT REFERENCES tipo_vivienda(id),
    precio INT,
    nuevo_usado BOOLEAN
); -- SELECT * FROM vivienda;

CREATE TABLE modulo_log(
    id INT PRIMARY KEY AUTO_INCREMENT,
    vendedor_fk INT REFERENCES persona(id),
    vivienda_fk INT REFERENCES vivienda(id),
    cliente_fk INT REFERENCES cliente(id),
    fecha DATETIME
);