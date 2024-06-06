create database unpbank;
use unpbank;
CREATE TABLE clientes (
  id_cliente int DEFAULT NULL,
  nome_cliente varchar(50) DEFAULT NULL,
  cpf_cliente varchar(50) DEFAULT NULL,
  email_cliente varchar(50) DEFAULT NULL,
  senha_cliente varchar(50) DEFAULT NULL,
  idade_cliente varchar(20) DEFAULT NULL,
sexo_cliente varchar(10) DEFAULT NULL);
INSERT INTO clientes (id_cliente, nome_cliente, cpf_cliente, email_cliente, senha_cliente, idade_cliente, sexo_cliente) VALUES
(1, 'João Silva', '123.456.789-00', 'joao.silva@example.com', 'senha123', '30', 'Masculino'),
(2, 'Maria Oliveira', '987.654.321-00', 'maria.oliveira@example.com', 'senha456', '25', 'Feminino'),
(3, 'Carlos Souza', '111.222.333-44', 'carlos.souza@example.com', 'senha789', '40', 'Masculino'),
(4, 'Ana Pereira', '555.666.777-88', 'ana.pereira@example.com', 'senha012', '35', 'Feminino'),
(5, 'Pedro Almeida', '999.888.777-66', 'pedro.almeida@example.com', 'senha345', '28', 'Masculino'),
(6, 'Juliana Santos', '444.333.222-11', 'juliana.santos@example.com', 'senha678', '32', 'Feminino'),
(7, 'Bruno Rocha', '222.333.444-55', 'bruno.rocha@example.com', 'senha901', '45', 'Masculino'),
(8, 'Fernanda Lima', '333.222.111-00', 'fernanda.lima@example.com', 'senha234', '29', 'Feminino'),
(9, 'Ricardo Alves', '666.777.888-99', 'ricardo.alves@example.com', 'senha567', '38', 'Masculino'),
(10, 'Patrícia Costa', '888.999.000-11', 'patricia.costa@example.com', 'senha890', '27', 'Feminino');
