-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 09/04/2024 às 02:41
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
  `Nome` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `alunos`
--

INSERT INTO `alunos` (`ID_Aluno`, `Nome`) VALUES
(1, 'pedro'),
(2, 'caio'),
(3, 'fabio'),
(4, 'maria'),
(5, 'jonas'),
(6, 'alan'),
(7, 'camila');

-- --------------------------------------------------------

--
-- Estrutura para tabela `aluno_disciplina`
--

CREATE TABLE `aluno_disciplina` (
  `Aluno_Disciplina` int(11) NOT NULL,
  `ID_Aluno` int(11) DEFAULT NULL,
  `ID_Disciplina` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `aluno_disciplina`
--

INSERT INTO `aluno_disciplina` (`Aluno_Disciplina`, `ID_Aluno`, `ID_Disciplina`) VALUES
(1, 1, 1),
(2, 1, 4),
(3, 1, 5),
(4, 2, 2),
(5, 2, 3),
(6, 3, 2),
(7, 3, 3),
(8, 3, 4),
(9, 4, 1),
(10, 4, 2),
(11, 4, 3),
(12, 4, 4),
(13, 5, 3),
(14, 5, 5),
(15, 6, 1),
(16, 6, 2),
(17, 6, 3);

-- --------------------------------------------------------

--
-- Estrutura para tabela `artista`
--

CREATE TABLE `artista` (
  `id_artista` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `artista`
--

INSERT INTO `artista` (`id_artista`, `nome`) VALUES
(1, 'jose'),
(2, 'maria'),
(3, 'pedro'),
(4, 'pedro'),
(5, 'fabio'),
(6, 'moacir');

-- --------------------------------------------------------

--
-- Estrutura para tabela `autor`
--

CREATE TABLE `autor` (
  `id_autor` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `autor`
--

INSERT INTO `autor` (`id_autor`, `nome`) VALUES
(1, 'pedro'),
(2, 'moacir'),
(3, 'fabio');

-- --------------------------------------------------------

--
-- Estrutura para tabela `autor_livro`
--

CREATE TABLE `autor_livro` (
  `id_autor_livro` int(11) NOT NULL,
  `id_autor` int(11) DEFAULT NULL,
  `id_livro` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `autor_livro`
--

INSERT INTO `autor_livro` (`id_autor_livro`, `id_autor`, `id_livro`) VALUES
(1, 2, 1),
(2, 1, 2),
(3, 3, 2),
(4, 2, 3);

-- --------------------------------------------------------

--
-- Estrutura para tabela `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `categoria`
--

INSERT INTO `categoria` (`id_categoria`, `nome`) VALUES
(1, 'matinal'),
(2, 'sem gluten'),
(3, 'laticineos');

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
-- Estrutura para tabela `clientes3`
--

CREATE TABLE `clientes3` (
  `id_clientes3` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `clientes3`
--

INSERT INTO `clientes3` (`id_clientes3`, `nome`) VALUES
(1, 'jose'),
(2, 'maria'),
(3, 'pedro');

-- --------------------------------------------------------

--
-- Estrutura para tabela `departamento`
--

CREATE TABLE `departamento` (
  `id_departamento` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `departamento`
--

INSERT INTO `departamento` (`id_departamento`, `nome`) VALUES
(1, 'eletronicos'),
(2, 'mesa e banho'),
(3, 'limpeza'),
(4, 'balcão');

-- --------------------------------------------------------

--
-- Estrutura para tabela `disciplina`
--

CREATE TABLE `disciplina` (
  `ID_Disciplina` int(11) NOT NULL,
  `Disciplina` varchar(100) DEFAULT NULL,
  `Professor` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `disciplina`
--

INSERT INTO `disciplina` (`ID_Disciplina`, `Disciplina`, `Professor`) VALUES
(1, 'matematica', 'moacir'),
(2, 'português', 'cássia'),
(3, 'biologia', 'marcos'),
(4, 'quimica', 'mario'),
(5, 'fisica', 'evelyn');

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
-- Estrutura para tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `id_funcionario` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `id_departamento` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `funcionario`
--

INSERT INTO `funcionario` (`id_funcionario`, `nome`, `id_departamento`) VALUES
(1, 'fabio', 3),
(2, 'maria', 4),
(3, 'jose', 1);

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
-- Estrutura para tabela `livro`
--

CREATE TABLE `livro` (
  `id_livro` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `genero` varchar(100) DEFAULT NULL,
  `ano` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `livro`
--

INSERT INTO `livro` (`id_livro`, `nome`, `genero`, `ano`) VALUES
(1, 'senhor dos aneis', 'fantasia', 1954),
(2, 'dragões', 'fantasia', 2001),
(3, 'quem matou?', 'suspense', 1999);

-- --------------------------------------------------------

--
-- Estrutura para tabela `musica`
--

CREATE TABLE `musica` (
  `id_musica` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `genero` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `musica`
--

INSERT INTO `musica` (`id_musica`, `nome`, `genero`) VALUES
(1, 'campo', 'country'),
(2, 'pedra', 'rock'),
(3, 'no pézinho', 'samba');

-- --------------------------------------------------------

--
-- Estrutura para tabela `musica_artista`
--

CREATE TABLE `musica_artista` (
  `id_musica_artista` int(11) NOT NULL,
  `id_musica` int(11) DEFAULT NULL,
  `id_artista` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `musica_artista`
--

INSERT INTO `musica_artista` (`id_musica_artista`, `id_musica`, `id_artista`) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 2, 3),
(4, 3, 2);

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

-- --------------------------------------------------------

--
-- Estrutura para tabela `produto`
--

CREATE TABLE `produto` (
  `id_produto` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `produto`
--

INSERT INTO `produto` (`id_produto`, `nome`) VALUES
(1, 'bolacha'),
(2, 'pão'),
(3, 'leite'),
(4, 'café');

-- --------------------------------------------------------

--
-- Estrutura para tabela `produto_categoria`
--

CREATE TABLE `produto_categoria` (
  `id_produto_categoria` int(11) NOT NULL,
  `id_produto` int(11) DEFAULT NULL,
  `id_categoria` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `produto_categoria`
--

INSERT INTO `produto_categoria` (`id_produto_categoria`, `id_produto`, `id_categoria`) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 2, 1),
(4, 2, 2),
(5, 3, 3),
(6, 4, 1);

-- --------------------------------------------------------

--
-- Estrutura para tabela `vendas`
--

CREATE TABLE `vendas` (
  `id_vendas` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `id_clientes3` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `vendas`
--

INSERT INTO `vendas` (`id_vendas`, `nome`, `id_clientes3`) VALUES
(1, 'salame', 1),
(2, 'alface', 2),
(3, 'cenoura', 3);

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
  ADD PRIMARY KEY (`Aluno_Disciplina`),
  ADD KEY `ID_Aluno` (`ID_Aluno`),
  ADD KEY `ID_Disciplina` (`ID_Disciplina`);

--
-- Índices de tabela `artista`
--
ALTER TABLE `artista`
  ADD PRIMARY KEY (`id_artista`);

--
-- Índices de tabela `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`id_autor`);

--
-- Índices de tabela `autor_livro`
--
ALTER TABLE `autor_livro`
  ADD PRIMARY KEY (`id_autor_livro`),
  ADD KEY `id_autor` (`id_autor`),
  ADD KEY `id_livro` (`id_livro`);

--
-- Índices de tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`);

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
-- Índices de tabela `clientes3`
--
ALTER TABLE `clientes3`
  ADD PRIMARY KEY (`id_clientes3`);

--
-- Índices de tabela `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`id_departamento`);

--
-- Índices de tabela `disciplina`
--
ALTER TABLE `disciplina`
  ADD PRIMARY KEY (`ID_Disciplina`);

--
-- Índices de tabela `endereços`
--
ALTER TABLE `endereços`
  ADD PRIMARY KEY (`ID_endereço`),
  ADD KEY `ID_cliente2` (`ID_cliente2`);

--
-- Índices de tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id_funcionario`),
  ADD KEY `id_departamento` (`id_departamento`);

--
-- Índices de tabela `itemdopedido`
--
ALTER TABLE `itemdopedido`
  ADD PRIMARY KEY (`ID_itemDoPedido`),
  ADD KEY `ID_pedido2` (`ID_pedido2`);

--
-- Índices de tabela `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`id_livro`);

--
-- Índices de tabela `musica`
--
ALTER TABLE `musica`
  ADD PRIMARY KEY (`id_musica`);

--
-- Índices de tabela `musica_artista`
--
ALTER TABLE `musica_artista`
  ADD PRIMARY KEY (`id_musica_artista`),
  ADD KEY `id_musica` (`id_musica`),
  ADD KEY `id_artista` (`id_artista`);

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
-- Índices de tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id_produto`);

--
-- Índices de tabela `produto_categoria`
--
ALTER TABLE `produto_categoria`
  ADD PRIMARY KEY (`id_produto_categoria`),
  ADD KEY `id_produto` (`id_produto`),
  ADD KEY `id_categoria` (`id_categoria`);

--
-- Índices de tabela `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`id_vendas`),
  ADD KEY `id_clientes3` (`id_clientes3`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `alunos`
--
ALTER TABLE `alunos`
  MODIFY `ID_Aluno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de tabela `aluno_disciplina`
--
ALTER TABLE `aluno_disciplina`
  MODIFY `Aluno_Disciplina` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de tabela `artista`
--
ALTER TABLE `artista`
  MODIFY `id_artista` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `autor`
--
ALTER TABLE `autor`
  MODIFY `id_autor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `autor_livro`
--
ALTER TABLE `autor_livro`
  MODIFY `id_autor_livro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_categoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

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
-- AUTO_INCREMENT de tabela `clientes3`
--
ALTER TABLE `clientes3`
  MODIFY `id_clientes3` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `departamento`
--
ALTER TABLE `departamento`
  MODIFY `id_departamento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `disciplina`
--
ALTER TABLE `disciplina`
  MODIFY `ID_Disciplina` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `endereços`
--
ALTER TABLE `endereços`
  MODIFY `ID_endereço` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id_funcionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `itemdopedido`
--
ALTER TABLE `itemdopedido`
  MODIFY `ID_itemDoPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `livro`
--
ALTER TABLE `livro`
  MODIFY `id_livro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `musica`
--
ALTER TABLE `musica`
  MODIFY `id_musica` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `musica_artista`
--
ALTER TABLE `musica_artista`
  MODIFY `id_musica_artista` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

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
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `id_produto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `produto_categoria`
--
ALTER TABLE `produto_categoria`
  MODIFY `id_produto_categoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `vendas`
--
ALTER TABLE `vendas`
  MODIFY `id_vendas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `aluno_disciplina`
--
ALTER TABLE `aluno_disciplina`
  ADD CONSTRAINT `aluno_disciplina_ibfk_1` FOREIGN KEY (`ID_Aluno`) REFERENCES `alunos` (`ID_Aluno`),
  ADD CONSTRAINT `aluno_disciplina_ibfk_2` FOREIGN KEY (`ID_Disciplina`) REFERENCES `disciplina` (`ID_Disciplina`);

--
-- Restrições para tabelas `autor_livro`
--
ALTER TABLE `autor_livro`
  ADD CONSTRAINT `autor_livro_ibfk_1` FOREIGN KEY (`id_autor`) REFERENCES `autor` (`id_autor`),
  ADD CONSTRAINT `autor_livro_ibfk_2` FOREIGN KEY (`id_livro`) REFERENCES `livro` (`id_livro`);

--
-- Restrições para tabelas `endereços`
--
ALTER TABLE `endereços`
  ADD CONSTRAINT `endereços_ibfk_1` FOREIGN KEY (`ID_cliente2`) REFERENCES `clientes2` (`ID_cliente2`);

--
-- Restrições para tabelas `funcionario`
--
ALTER TABLE `funcionario`
  ADD CONSTRAINT `funcionario_ibfk_1` FOREIGN KEY (`id_departamento`) REFERENCES `departamento` (`id_departamento`);

--
-- Restrições para tabelas `itemdopedido`
--
ALTER TABLE `itemdopedido`
  ADD CONSTRAINT `itemdopedido_ibfk_1` FOREIGN KEY (`ID_pedido2`) REFERENCES `pedidos2` (`ID_pedido2`);

--
-- Restrições para tabelas `musica_artista`
--
ALTER TABLE `musica_artista`
  ADD CONSTRAINT `musica_artista_ibfk_1` FOREIGN KEY (`id_musica`) REFERENCES `musica` (`id_musica`),
  ADD CONSTRAINT `musica_artista_ibfk_2` FOREIGN KEY (`id_artista`) REFERENCES `artista` (`id_artista`);

--
-- Restrições para tabelas `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `pedidos_ibfk_1` FOREIGN KEY (`ID_cliente`) REFERENCES `clientes` (`ID_cliente`);

--
-- Restrições para tabelas `produto_categoria`
--
ALTER TABLE `produto_categoria`
  ADD CONSTRAINT `produto_categoria_ibfk_1` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`),
  ADD CONSTRAINT `produto_categoria_ibfk_2` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`);

--
-- Restrições para tabelas `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `vendas_ibfk_1` FOREIGN KEY (`id_clientes3`) REFERENCES `clientes3` (`id_clientes3`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
