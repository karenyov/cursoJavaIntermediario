-- Create database
create database tw_java_intermediario;

-- Create tables
CREATE TABLE `tw_java_intermediario`.`usr_usuarios` (
  `usr_id` INT NOT NULL AUTO_INCREMENT,
  `usr_nome` VARCHAR(45) NOT NULL,
  `usr_login` VARCHAR(45) NOT NULL,
  `usr_senha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`usr_id`));
