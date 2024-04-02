-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 02/04/2024 às 02:41
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `testes_aula_bd_2503`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `alunos`
--

CREATE TABLE `alunos` (
  `ID_Aluno` int(11) NOT NULL,
  `Nome` varchar(100) DEFAULT NULL,
  `Data_nascimento` date DEFAULT NULL,
  `Turma` varchar(100) DEFAULT NULL,
  `Disciplina` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `alunos`
--

INSERT INTO `alunos` (`ID_Aluno`, `Nome`, `Data_nascimento`, `Turma`, `Disciplina`) VALUES
(1, 'jose', '2010-05-21', '4a', 'matematica'),
(2, 'maria', '2009-06-17', '4b', 'portugues');

-- --------------------------------------------------------

--
-- Estrutura para tabela `aluno_disciplina`
--

CREATE TABLE `aluno_disciplina` (
  `ID_Aluno_Disciplina` int(11) NOT NULL,
  `ID_Aluno` int(11) DEFAULT NULL,
  `ID_Disciplina` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `clientes`
--

CREATE TABLE `clientes` (
  `ID_cliente` int(11) NOT NULL,
  `Nome` varchar(100) DEFAULT NULL,
  `Endereco` varchar(255) DEFAULT NULL,
  `Telefone` varchar(11) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `clientes`
--

INSERT INTO `clientes` (`ID_cliente`, `Nome`, `Endereco`, `Telefone`, `Email`) VALUES
(1, 'Pedro Pedreira', 'Rua das Pedras 123', '55999996545', 'pedregulho123@gamil.com'),
(2, 'Maria Silva', 'Rua das Flores 45', '54123456789', 'mariadas@gmail.com'),
(3, 'João dos Santos', 'Avenida Silvio Santos 10', '54945451234', 'jdsantos@hotmail.com'),
(4, 'Ana Carla Pereira', 'Rua das Margaridas 10', '54997878326', 'anacpereira@yahoo.com.br');

-- --------------------------------------------------------

--
-- Estrutura para tabela `clientes2`
--

CREATE TABLE `clientes2` (
  `ID_cliente2` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `telefone` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `clientes2`
--

INSERT INTO `clientes2` (`ID_cliente2`, `nome`, `telefone`, `email`) VALUES
(1, 'jose', '54 99876325', 'jose@gmail.com'),
(2, 'maria', '54 96523215', 'maria@gmail.com'),
(3, 'pedro', '54 932156547', 'pedro@gmail.com');

-- --------------------------------------------------------

--
-- Estrutura para tabela `diciplinas`
--

CREATE TABLE `diciplinas` (
  `ID_diciplina` int(11) NOT NULL,
  `Nome_disciplina` varchar(100) DEFAULT NULL,
  `Professor` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `diciplinas`
--

INSERT INTO `diciplinas` (`ID_diciplina`, `Nome_disciplina`, `Professor`) VALUES
(1, 'matematica', 'Joacir'),
(2, 'biologia', 'carlos'),
(3, 'portugues', 'susie'),
(4, 'fisica', 'pedro'),
(5, 'quimica', 'dolores');

-- --------------------------------------------------------

--
-- Estrutura para tabela `endereços`
--

CREATE TABLE `endereços` (
  `ID_endereço` int(11) NOT NULL,
  `endereço` varchar(100) DEFAULT NULL,
  `ID_cliente2` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `endereços`
--

INSERT INTO `endereços` (`ID_endereço`, `endereço`, `ID_cliente2`) VALUES
(1, 'rua tal 654', 1),
(2, 'rua tal 654', 2),
(3, 'rua atras daquela', 3);

-- --------------------------------------------------------

--
-- Estrutura para tabela `itemdopedido`
--

CREATE TABLE `itemdopedido` (
  `ID_itemDoPedido` int(11) NOT NULL,
  `nomeItem` varchar(100) DEFAULT NULL,
  `preco` double DEFAULT NULL,
  `ID_pedido2` int(11) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `itemdopedido`
--

INSERT INTO `itemdopedido` (`ID_itemDoPedido`, `nomeItem`, `preco`, `ID_pedido2`, `quantidade`) VALUES
(1, 'maça', 5, 1, 10),
(2, 'laranja', 10, 2, 6),
(3, 'pera', 4, 3, 10);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pedidos`
--

CREATE TABLE `pedidos` (
  `ID_Pedido` int(11) NOT NULL,
  `ID_cliente` int(11) DEFAULT NULL,
  `Data_Pedido` date DEFAULT NULL,
  `Produto` varchar(150) DEFAULT NULL,
  `Valor` decimal(10,2) DEFAULT NULL,
  `Quantidade` int(11) DEFAULT NULL,
  `Valor_Total` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `pedidos`
--

INSERT INTO `pedidos` (`ID_Pedido`, `ID_cliente`, `Data_Pedido`, `Produto`, `Valor`, `Quantidade`, `Valor_Total`) VALUES
(1, 1, '2024-01-30', 'Alface', 12.15, 5, 60.75),
(2, 2, '2024-02-01', 'beterraba', 10.50, 1, 10.50),
(3, 1, '2024-02-05', 'tomate', 8.45, 2, 16.90),
(4, 3, '2024-02-07', 'Melancia', 18.14, 1, 18.14),
(5, 1, '2024-02-15', 'Alface', 12.15, 1, 12.15),
(6, 3, '2024-02-15', 'Laranja', 5.00, 2, 10.00);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pedidos2`
--

CREATE TABLE `pedidos2` (
  `ID_pedido2` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `data` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `pedidos2`
--

INSERT INTO `pedidos2` (`ID_pedido2`, `nome`, `total`, `data`) VALUES
(1, 'jose', 50, '2024-04-09'),
(2, 'maria', 60, '2024-04-24'),
(3, 'pedro', 40.3, '2024-04-16');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `alunos`
--
ALTER TABLE `alunos`
  ADD PRIMARY KEY (`ID_Aluno`);

--
-- Índices de tabela `aluno_disciplina`
--
ALTER TABLE `aluno_disciplina`
  ADD PRIMARY KEY (`ID_Aluno_Disciplina`),
  ADD KEY `ID_Aluno` (`ID_Aluno`),
  ADD KEY `ID_Disciplina` (`ID_Disciplina`);

--
-- Índices de tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`ID_cliente`);

--
-- Índices de tabela `clientes2`
--
ALTER TABLE `clientes2`
  ADD PRIMARY KEY (`ID_cliente2`);

--
-- Índices de tabela `diciplinas`
--
ALTER TABLE `diciplinas`
  ADD PRIMARY KEY (`ID_diciplina`);

--
-- Índices de tabela `endereços`
--
ALTER TABLE `endereços`
  ADD PRIMARY KEY (`ID_endereço`),
  ADD KEY `ID_cliente2` (`ID_cliente2`);

--
-- Índices de tabela `itemdopedido`
--
ALTER TABLE `itemdopedido`
  ADD PRIMARY KEY (`ID_itemDoPedido`),
  ADD KEY `ID_pedido2` (`ID_pedido2`);

--
-- Índices de tabela `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`ID_Pedido`),
  ADD KEY `ID_cliente` (`ID_cliente`);

--
-- Índices de tabela `pedidos2`
--
ALTER TABLE `pedidos2`
  ADD PRIMARY KEY (`ID_pedido2`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `alunos`
--
ALTER TABLE `alunos`
  MODIFY `ID_Aluno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `aluno_disciplina`
--
ALTER TABLE `aluno_disciplina`
  MODIFY `ID_Aluno_Disciplina` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `ID_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `clientes2`
--
ALTER TABLE `clientes2`
  MODIFY `ID_cliente2` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `diciplinas`
--
ALTER TABLE `diciplinas`
  MODIFY `ID_diciplina` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `endereços`
--
ALTER TABLE `endereços`
  MODIFY `ID_endereço` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `itemdopedido`
--
ALTER TABLE `itemdopedido`
  MODIFY `ID_itemDoPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `ID_Pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `pedidos2`
--
ALTER TABLE `pedidos2`
  MODIFY `ID_pedido2` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `aluno_disciplina`
--
ALTER TABLE `aluno_disciplina`
  ADD CONSTRAINT `aluno_disciplina_ibfk_1` FOREIGN KEY (`ID_Aluno`) REFERENCES `alunos` (`ID_Aluno`),
  ADD CONSTRAINT `aluno_disciplina_ibfk_2` FOREIGN KEY (`ID_Disciplina`) REFERENCES `diciplinas` (`ID_diciplina`);

--
-- Restrições para tabelas `endereços`
--
ALTER TABLE `endereços`
  ADD CONSTRAINT `endereços_ibfk_1` FOREIGN KEY (`ID_cliente2`) REFERENCES `clientes2` (`ID_cliente2`);

--
-- Restrições para tabelas `itemdopedido`
--
ALTER TABLE `itemdopedido`
  ADD CONSTRAINT `itemdopedido_ibfk_1` FOREIGN KEY (`ID_pedido2`) REFERENCES `pedidos2` (`ID_pedido2`);

--
-- Restrições para tabelas `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `pedidos_ibfk_1` FOREIGN KEY (`ID_cliente`) REFERENCES `clientes` (`ID_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
