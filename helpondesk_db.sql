-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 29, 2017 at 02:35 AM
-- Server version: 5.7.14
-- PHP Version: 7.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `helpondesk`
--
CREATE DATABASE IF NOT EXISTS `helpondesk` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `helpondesk`;

-- --------------------------------------------------------

--
-- Table structure for table `chamado`
--

CREATE TABLE `chamado` (
  `id` int(10) NOT NULL,
  `situacao` enum('aberto','em andamento','finalizado') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'aberto',
  `urgencia` enum('baixa','média','alta') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'baixa',
  `descricao` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `id_Solic` int(10) NOT NULL,
  `id_Tec` int(10) DEFAULT NULL,
  `hora` time NOT NULL,
  `data` date NOT NULL,
  `obsFinal` varchar(200) COLLATE utf8_unicode_ci NOT NULL DEFAULT 'Nenhuma',
  `horaFinal` time NOT NULL,
  `dataFinal` date NOT NULL,
  `custo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `chamado`
--

INSERT INTO `chamado` (`id`, `situacao`, `urgencia`, `descricao`, `id_Solic`, `id_Tec`, `hora`, `data`, `obsFinal`, `horaFinal`, `dataFinal`, `custo`) VALUES
(1, 'finalizado', 'alta', 'Atualizar Office', 2, 1, '18:56:48', '2014-11-17', '-', '22:59:06', '2017-10-28', 0),
(2, 'finalizado', 'alta', 'Trocar teclado', 7, 1, '19:29:41', '2014-11-17', '-', '22:59:13', '2017-10-28', 0);

-- --------------------------------------------------------

--
-- Table structure for table `funcionario`
--

CREATE TABLE `funcionario` (
  `id` int(10) NOT NULL,
  `perfil` enum('solicitante','tecnico') COLLATE utf8_unicode_ci NOT NULL DEFAULT 'solicitante',
  `login` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `senha` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `funcionario`
--

INSERT INTO `funcionario` (`id`, `perfil`, `login`, `senha`) VALUES
(1, 'tecnico', 'gabriel', '123'),
(2, 'solicitante', 'alexs', '123'),
(3, 'tecnico', 'crafael', '1234567'),
(7, 'solicitante', 'san', '123');

-- --------------------------------------------------------

--
-- Table structure for table `solicitante`
--

CREATE TABLE `solicitante` (
  `matricula_Solic` varchar(15) COLLATE utf8_unicode_ci NOT NULL,
  `nome_Solic` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `email_Solic` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `setor_Solic` varchar(30) COLLATE utf8_unicode_ci NOT NULL,
  `ramal_Solic` int(8) NOT NULL,
  `andar_Solic` int(2) NOT NULL,
  `id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `solicitante`
--

INSERT INTO `solicitante` (`matricula_Solic`, `nome_Solic`, `email_Solic`, `setor_Solic`, `ramal_Solic`, `andar_Solic`, `id`) VALUES
('99/987654-32', 'Alex Souza', 'alex@hotmail.com', 'Contabilidade', 97456345, 6, 2),
('9999999', 'Claudio San', 'claudio.sanroman23@gmail.com', 'Comunicação', 97456347, 7, 7);

-- --------------------------------------------------------

--
-- Table structure for table `tecnico`
--

CREATE TABLE `tecnico` (
  `nome_Tec` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `email_Tec` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `tecnico`
--

INSERT INTO `tecnico` (`nome_Tec`, `email_Tec`, `id`) VALUES
('Gabriel Azevedo', 'gabriel@gg.com', 1),
('Claudio Rafael', 'claudio_rafael14@hotmail.com', 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chamado`
--
ALTER TABLE `chamado`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_Solic` (`id_Solic`),
  ADD KEY `id_Tec` (`id_Tec`);

--
-- Indexes for table `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `solicitante`
--
ALTER TABLE `solicitante`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tecnico`
--
ALTER TABLE `tecnico`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chamado`
--
ALTER TABLE `chamado`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
--
-- AUTO_INCREMENT for table `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `chamado`
--
ALTER TABLE `chamado`
  ADD CONSTRAINT `chamado_ibfk_1` FOREIGN KEY (`id_Solic`) REFERENCES `solicitante` (`id`),
  ADD CONSTRAINT `chamado_ibfk_2` FOREIGN KEY (`id_Tec`) REFERENCES `tecnico` (`id`);

--
-- Constraints for table `solicitante`
--
ALTER TABLE `solicitante`
  ADD CONSTRAINT `solicitante_ibfk_1` FOREIGN KEY (`id`) REFERENCES `funcionario` (`id`);

--
-- Constraints for table `tecnico`
--
ALTER TABLE `tecnico`
  ADD CONSTRAINT `tecnico_ibfk_1` FOREIGN KEY (`id`) REFERENCES `funcionario` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
