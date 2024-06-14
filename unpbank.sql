-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema unpbank
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema unpbank
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `unpbank` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `unpbank` ;

-- -----------------------------------------------------
-- Table `unpbank`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `unpbank`.`clientes` (
  `id_cliente` INT NULL DEFAULT NULL,
  `nome_cliente` VARCHAR(50) NULL DEFAULT NULL,
  `email_cliente` VARCHAR(50) NULL DEFAULT NULL,
  `cpf_cliente` VARCHAR(50) NULL DEFAULT NULL,
  `senha_cliente` VARCHAR(50) NULL DEFAULT NULL,
  `idade_cliente` VARCHAR(20) NULL DEFAULT NULL,
  `sexo_cliente` VARCHAR(10) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `unpbank`.`contacorrente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `unpbank`.`contacorrente` (
  `id_conta` INT NULL DEFAULT NULL,
  `cpf_cliente` VARCHAR(20) NULL DEFAULT NULL,
  `saldo_cliente` DOUBLE NULL DEFAULT NULL,
  `status_cliente` VARCHAR(20) NULL DEFAULT NULL,
  `senha_conta` VARCHAR(20) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `unpbank`.`funcionarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `unpbank`.`funcionarios` (
  `id_funcionario` INT NULL DEFAULT NULL,
  `nome_funcionario` VARCHAR(50) NULL DEFAULT NULL,
  `senha_funcionario` VARCHAR(50) NULL DEFAULT NULL,
  `cpf_funcionario` VARCHAR(50) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `unpbank`.`sexo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `unpbank`.`sexo` (
  `id_sexo` INT NULL DEFAULT NULL,
  `descricao_sexo` VARCHAR(10) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `unpbank`.`status`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `unpbank`.`status` (
  `id_status` INT NULL DEFAULT NULL,
  `descricao_status` VARCHAR(10) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
