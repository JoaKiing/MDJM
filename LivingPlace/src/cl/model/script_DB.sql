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

CREATE TABLE registro_venta(
    id INT PRIMARY KEY AUTO_INCREMENT,
    vendedor_fk INT REFERENCES persona(id),
    vivienda_fk INT REFERENCES vivienda(id),
    cliente_fk INT REFERENCES cliente(id),
    fecha DATETIME
);


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

CREATE VIEW datosModulo_log  -- SELECT * FROM datosModulo_log;
AS
SELECT v.nombre AS 'Vendedor',
       v.run AS 'Rut Vendedor',
       vi.direccion AS 'Direccion de vivienda',
       vi.cantidad_pieza AS 'Cantidad Piezas',
       vi.cantidad_baño AS 'Cantidad Baños',
       tv.nombre AS 'Tipo Vivienda',
       vi.precio AS 'Precio vivienda',
       vi.nuevo_usado AS 'Nuevo o Usado',
       cl.nombre AS 'Nombre Cliente',
       cl.run AS 'Run Cliente',
       cl.sueldo AS 'Sueldo Cliente'
FROM
	   registro_venta ml
       INNER JOIN vendedor v
       ON ml.vendedor_fk = v.id
       INNER JOIN vivienda vi
       ON ml.vivienda_fk = vi.id
       INNER JOIN tipo_vivienda tv
       ON vi.tipo_vivienda_FK = tv.id
       INNER JOIN cliente cl 
	   ON ml.cliente_fk = cl.id

       


CREATE VIEW datosModulo_log  -- SELECT * FROM datosModulo_log;
AS
SELECT v.nombre AS 'Vendedor',
       v.run AS 'Rut Vendedor',
       vi.direccion AS 'Direccion de vivienda',
       vi.cantidad_pieza AS 'Cantidad Piezas',
       vi.cantidad_baño AS 'Cantidad Baños',
       tv.nombre AS 'Tipo Vivienda',
       vi.precio AS 'Precio vivienda',
       vi.nuevo_usado AS 'Nuevo o Usado',
       cl.nombre AS 'Nombre Cliente',
       cl.run AS 'Run Cliente',
       cl.sueldo AS 'Sueldo Cliente',
       ml.fecha AS 'Fecha registro'
FROM
	   modulo_log ml
       INNER JOIN vendedor v
       ON ml.vendedor_fk = v.id
       INNER JOIN vivienda vi
       ON ml.vivienda_fk = vi.id
       INNER JOIN tipo_vivienda tv
       ON vi.tipo_vivienda_FK = tv.id
       INNER JOIN cliente cl 
	   ON ml.cliente_fk = cl.id;

SELECT * FROM vivienda ORDER BY precio ASC;


CREATE VIEW nombreVivienda AS -- SELECT * FROM nombreVivienda;
SELECT tv.nombre AS 'Vivienda' 
FROM vivienda v INNER JOIN tipo_vivienda tv ON tv.id = v.tipo_vivienda_fk;

       
       
       
       
       
       
       
       
       