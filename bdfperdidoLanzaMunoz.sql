DROP DATABASE IF EXISTS fperdido_LanzaMunoz;
CREATE DATABASE fperdido_LanzaMunoz;
USE fperdido_LanzaMunoz;

CREATE TABLE fotogramas (
  idFotograma int(11) NOT NULL,
  archivo varchar(45) NOT NULL,
  titPelicula varchar(255) NOT NULL,
  anyoEstreno int(11) NOT NULL,
  director varchar(128) NOT NULL,
  genero varchar(50) DEFAULT NULL,
  PRIMARY KEY (idFotograma)
  );

CREATE TABLE usuarios (
  login varchar(12) NOT NULL,
  clave varchar(12) NOT NULL,
  PRIMARY KEY (login)
);

INSERT INTO usuarios VALUES 
('lanza','1234'),
('usuario','usuario');