CREATE TABLE cliente (
	id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	nombre VARCHAR,
	apellido VARCHAR,
	membresia INTEGER UNIQUE
);
-- hola
SELECT * FROM cliente;

-- CRUD
-- 		Create (INSERT)
--		Read   (SELECT)
--		Update (UPDATE)
--      Delete (DELETE)

-- INSERT
INSERT INTO cliente(nombre, apellido, membresia) VALUES ('Luis', 'Ojeda', 100);
INSERT INTO cliente(nombre, apellido, membresia) VALUES ('Dalia', 'Ochoa', 101);
INSERT INTO cliente(nombre, apellido, membresia) VALUES ('Carlos', 'López', 102);

-- SELECT
SELECT * FROM cliente;

-- UPDATE
update cliente 
set apellido = 'Alárcon' 
WHERE id = 2

-- DELETE
DELETE FROM cliente WHERE id = 3;