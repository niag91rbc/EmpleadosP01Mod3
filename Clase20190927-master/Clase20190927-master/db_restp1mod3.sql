
CREATE DATABASE IF NOT EXISTS db_restp1mod3;

USE db_restp1mod3;

DROP TABLE IF EXISTS empleado;

CREATE TABLE empleado(
rut VARCHAR(10),
nombre VARCHAR(50),
edad INT,
antiguedad INT,
PRIMARY KEY(rut));

INSERT INTO empleado VALUES('11111111', 'Joaquina', '36', '3');
INSERT INTO empleado VALUES('22222222', 'Jimena', '25', '5');
INSERT INTO empleado VALUES('33333333', 'Soledad', '41', '6');
INSERT INTO empleado VALUES('44444444', 'Roberto', '25', '8');
INSERT INTO empleado VALUES('55555555', 'Karin', '19', '4');
INSERT INTO empleado VALUES('66666666', 'Lorena', '37', '9');
INSERT INTO empleado VALUES('77777777', 'Thomas', '28', '5');
INSERT INTO empleado VALUES('88888888', 'Nelson', '45', '10');
INSERT INTO empleado VALUES('99999999', 'Soraya', '52', '9');

SELECT * FROM empleado;
