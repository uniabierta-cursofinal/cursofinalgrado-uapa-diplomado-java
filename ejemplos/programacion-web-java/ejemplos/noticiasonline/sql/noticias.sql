SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `noticias` DEFAULT CHARACTER SET latin1 ;
USE `noticias` ;

-- -----------------------------------------------------
-- Table `noticias`.`categorias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `noticias`.`categorias` (
  `codigo_categoria` INT(11) NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`codigo_categoria`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `noticias`.`pais`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `noticias`.`pais` (
  `codigo_pais` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`codigo_pais`))
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `noticias`.`ciudades`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `noticias`.`ciudades` (
  `codigo_ciudad` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(200) NOT NULL,
  `codigo_pais` INT(11) NOT NULL,
  PRIMARY KEY (`codigo_ciudad`),
  INDEX `fk_ciudades_1` (`codigo_pais` ASC),
  CONSTRAINT `fk_ciudades_1`
    FOREIGN KEY (`codigo_pais`)
    REFERENCES `noticias`.`pais` (`codigo_pais`))
ENGINE = InnoDB
AUTO_INCREMENT = 15
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `noticias`.`ubicacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `noticias`.`ubicacion` (
  `codigo_ubicacion` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(200) NOT NULL,
  `codigo_ciudad` INT(11) NOT NULL,
  PRIMARY KEY (`codigo_ubicacion`),
  INDEX `fk_ubicacion_1` (`codigo_ciudad` ASC),
  CONSTRAINT `fk_ubicacion_1`
    FOREIGN KEY (`codigo_ciudad`)
    REFERENCES `noticias`.`ciudades` (`codigo_ciudad`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `noticias`.`profesiones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `noticias`.`profesiones` (
  `codigo_profesion` INT(11) NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`codigo_profesion`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `noticias`.`tipo_noticias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `noticias`.`tipo_noticias` (
  `tipo_noticia` INT(11) NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`tipo_noticia`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `noticias`.`ocupaciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `noticias`.`ocupaciones` (
  `codigo_ocupacion` INT(11) NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`codigo_ocupacion`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `noticias`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `noticias`.`usuarios` (
  `codigo_usuario` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(200) NOT NULL,
  `fecha_ingreso` DATE NOT NULL,
  `fecha_nacimiento` DATE NOT NULL,
  `foto` VARCHAR(255) NULL DEFAULT NULL,
  `correo` VARCHAR(200) NOT NULL,
  `sexo` VARCHAR(20) NOT NULL,
  `identificacion` VARCHAR(50) NOT NULL,
  `codigo_profesion` INT(11) NOT NULL,
  `codigo_ocupacion` INT(11) NOT NULL,
  `tipo_noticia` INT(11) NOT NULL,
  `clave` VARCHAR(50) NOT NULL,
  `codigo_ubicacion` INT(11) NOT NULL,
  `usuario_login` VARCHAR(20) NOT NULL,
  `rol` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo_usuario`),
  INDEX `fk_usuarios_1` (`codigo_ubicacion` ASC),
  INDEX `fk_usuarios_2` (`codigo_profesion` ASC),
  INDEX `fk_usuarios_3` (`tipo_noticia` ASC),
  INDEX `fk_usuarios_4` (`codigo_ocupacion` ASC),
  CONSTRAINT `fk_usuarios_1`
    FOREIGN KEY (`codigo_ubicacion`)
    REFERENCES `noticias`.`ubicacion` (`codigo_ubicacion`),
  CONSTRAINT `fk_usuarios_2`
    FOREIGN KEY (`codigo_profesion`)
    REFERENCES `noticias`.`profesiones` (`codigo_profesion`),
  CONSTRAINT `fk_usuarios_3`
    FOREIGN KEY (`tipo_noticia`)
    REFERENCES `noticias`.`tipo_noticias` (`tipo_noticia`),
  CONSTRAINT `fk_usuarios_4`
    FOREIGN KEY (`codigo_ocupacion`)
    REFERENCES `noticias`.`ocupaciones` (`codigo_ocupacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `noticias`.`noticias`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `noticias`.`noticias` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(5000) NOT NULL,
  `fecha` DATE NOT NULL,
  `codigo_usuario` INT(11) NOT NULL,
  `codigo_ubicacion` INT(11) NOT NULL,
  `hora` VARCHAR(12) NOT NULL,
  `tipo_noticia` INT(11) NOT NULL,
  `codigo_categoria` INT(11) NOT NULL,
  `foto` VARCHAR(1000) NULL DEFAULT NULL,
  `video` VARCHAR(1000) NULL DEFAULT NULL,
  `visitas` INT(11) NULL DEFAULT NULL,
  `desc_corta` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_noticias_1` (`codigo_usuario` ASC),
  INDEX `fk_noticias_2` (`codigo_ubicacion` ASC),
  INDEX `fk_noticias_3` (`tipo_noticia` ASC),
  INDEX `fk_noticias_4` (`codigo_categoria` ASC),
  CONSTRAINT `fk_noticias_1`
    FOREIGN KEY (`codigo_usuario`)
    REFERENCES `noticias`.`usuarios` (`codigo_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_noticias_2`
    FOREIGN KEY (`codigo_ubicacion`)
    REFERENCES `noticias`.`ubicacion` (`codigo_ubicacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_noticias_3`
    FOREIGN KEY (`tipo_noticia`)
    REFERENCES `noticias`.`tipo_noticias` (`tipo_noticia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_noticias_4`
    FOREIGN KEY (`codigo_categoria`)
    REFERENCES `noticias`.`categorias` (`codigo_categoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
