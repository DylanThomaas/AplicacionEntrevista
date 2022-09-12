# Base de Datos MySQL

Dejo asentado por este medio el codeo para realizar la base de datos necesaria para correr la aplicacion.  

CREATE SCHEMA IF NOT EXISTS `basedatosentrevista`;
DROP DATABASE `basedatosentrevista`;
USE `basedatosentrevista`;
CREATE TABLE `basedatosentrevista`.`alumnos` (`id` INT NOT NULL PRIMARY KEY , `dni` VARCHAR (255) , `apellido` VARCHAR(255) , `curso` VARCHAR(255) ) ENGINE = InnoDB;
INSERT INTO `alumno` (`id`, `curso`, `dni`, `nombre`) VALUES ('1', 'Base de datos', '40464045', 'Fernandez Dylan');
