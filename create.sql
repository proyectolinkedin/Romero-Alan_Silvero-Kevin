
DROP TABLE IF EXISTS ODONTOLOGOS;


CREATE TABLE ODONTOLOGOS (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    MATRICULA INT NOT NULL,
    NOMBRE VARCHAR(100) NOT NULL,
    APELLIDO VARCHAR(100) NOT NULL
);

INSERT INTO ODONTOLOGOS (MATRICULA, NOMBRE, APELLIDO)
VALUES (123456, 'Juan', 'Pérez'),
       (654321, 'María', 'Rodríguez');
