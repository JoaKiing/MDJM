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

INSERT INTO vendedor VALUES(NULL,'Matias','22-2');

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

INSERT INTO cliente VALUES(NULL,'Daisy','33-3',100000);

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

INSERT INTO vivienda VALUES(NULL, '17MRK','Santiago, Puerto Mont','4','1','1',300000,1);
INSERT INTO vivienda VALUES(NULL, '15SRT','Viña Del Mar','6','2','1',500000,2);

CREATE TABLE registro_venta(
    id INT PRIMARY KEY AUTO_INCREMENT,
    vendedor_fk INT REFERENCES persona(id),
    vivienda_fk INT REFERENCES vivienda(id),
    cliente_fk INT REFERENCES cliente(id),
    fecha DATETIME
);

CREATE TABLE vendedorCliente(
    id INT PRIMARY KEY AUTO_INCREMENT,
    vendedor_fk INT REFERENCES persona(id),
    cliente_fk INT REFERENCES cliente(id),
    fecha DATE,
    hora TIME,
    accion VARCHAR(10)
);-- SELECT * FROM vendedorCliente;

INSERT INTO vendedorCliente VALUES(NULL,'1','1','2018/03/08','23:00:18','Vendio');

CREATE TABLE estado(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50)
);

INSERT INTO estado VALUES(NULL,'Vendida');
INSERT INTO estado VALUES(NULL,'Arrendada');
INSERT INTO estado VALUES(NULL,'Disponible');

CREATE TABLE estado_vivienda(
    id INT PRIMARY KEY AUTO_INCREMENT,
    fk_vivienda INT REFERENCES vivienda(id),
    fk_estado INT REFERENCES estado(id)
);

CREATE VIEW listado_vivienda AS -- SELECT * FROM listado_vivienda;
SELECT v.rol AS 'Rol',
	   v.direccion AS 'Direccion',
       v.cantidad_pieza AS 'Cantidad Pieza',
       v.cantidad_baño AS 'Cantidad Baño',
       tv.nombre AS 'Tipo de vivienda',
       v.precio AS 'Precio',
       v.nuevo_usado AS 'Nuevo o Usado'
FROM
	   tipo_vivienda tv
       INNER JOIN vivienda v
       ON tv.id = v.tipo_vivienda_fk;
       
       
CREATE VIEW nombreVivienda AS -- SELECT * FROM nombreVivienda;
SELECT tv.nombre AS 'Vivienda' 
FROM vivienda v INNER JOIN tipo_vivienda tv ON tv.id = v.tipo_vivienda_fk;

CREATE VIEW modulo_log AS -- SELECT * FROM modulo_log;
SELECT v.nombre AS 'Nombre Vendedor',
	   v.run AS 'Run Vendedor',
       c.nombre AS 'Nombre Cliente',
       vc.fecha AS 'Fecha de registro',
       vc.hora AS 'Hora de registro',
       vc.accion AS 'Acción de registro'
FROM
	   vendedorCliente vc 
       INNER JOIN vendedor v
       ON vc.vendedor_fk = v.id
       INNER JOIN cliente c
       ON vc.cliente_fk = c.id;


SELECT TIME(now());
